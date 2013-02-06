package com.miringue.vetokit.back.client.ui.clients;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.github.gwtbootstrap.client.ui.Button;
import com.github.gwtbootstrap.client.ui.CellTable;
import com.google.gwt.cell.client.CheckboxCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy.KeyboardSelectionPolicy;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.CellPreviewEvent;
import com.google.gwt.view.client.DefaultSelectionEventManager;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.MultiSelectionModel;
import com.google.gwt.view.client.ProvidesKey;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SelectionChangeEvent.Handler;
import com.miringue.vetokit.back.client.event.TableCheckboxEventTranslator;
import com.miringue.vetokit.back.shared.model.Client;

public class ClientViewImpl extends Composite implements ClientView {

    private static ViewImplUiBinder uiBinder = GWT.create(ViewImplUiBinder.class);

    interface ViewImplUiBinder extends UiBinder<Widget, ClientViewImpl> {}

    @UiField
    protected Button addBtn;

    @UiField(provided = true)
    protected CellTable<Client> listTbl;

    protected ProvidesKey<Client> keyProvider;
    protected MultiSelectionModel<Client> selectionModel;
    protected ListDataProvider<Client> dataProvider;


    private Presenter presenter;

    public ClientViewImpl() {
        init();
        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    public void setPresenter(final Presenter listener) {
        presenter = listener;
    }

    private void init() {
        initKeyProvider();
        initCellTable();
        initSelectionModel();
        initColumns();
        initDataProvider();
    }

    private void initKeyProvider() {
        keyProvider = new ProvidesKey<Client>() {
            @Override
            public Object getKey(final Client article) {
                return article == null ? null : article.getId();
            }
        };
    }

    private void initCellTable() {
        listTbl = new CellTable<Client>(keyProvider);
        listTbl.setKeyboardSelectionPolicy(KeyboardSelectionPolicy.ENABLED);
    }

    private void initSelectionModel() {
        selectionModel = new MultiSelectionModel<Client>(keyProvider);
        selectionModel.addSelectionChangeHandler(new Handler() {
            @Override
            public void onSelectionChange(final SelectionChangeEvent event) {
                final Set<Client> selectedObjects = selectionModel.getSelectedSet();
                presenter.onSelect(selectedObjects);
            }
        });
        final TableCheckboxEventTranslator<Client> tableCheckboxEventTranslator = new TableCheckboxEventTranslator<Client>(
                selectionModel);
        final CellPreviewEvent.Handler<Client> selectionEventManager = DefaultSelectionEventManager
                .createCustomManager(tableCheckboxEventTranslator);
        listTbl.setSelectionModel(selectionModel, selectionEventManager);

    }

    private void initColumns() {
        final Column<Client, Boolean> checkColumn = new Column<Client, Boolean>(new CheckboxCell(true, false)) {
            @Override
            public Boolean getValue(final Client object) {
                return selectionModel.isSelected(object);
            }
        };
        final TextColumn<Client> titleColumn = new TextColumn<Client>() {
            @Override
            public String getValue(final Client object) {
                return object.getNom();
            }
        };
        listTbl.addColumn(checkColumn);
        listTbl.addColumn(titleColumn, "Nom");

    }

    private void initDataProvider() {
        dataProvider = new ListDataProvider<Client>();
        dataProvider.addDataDisplay(listTbl);
    }

    @Override
    public void addArticle(Client article) {
        final List<Client> objects = dataProvider.getList();
        if (!objects.contains(article)) {
            dataProvider.getList().add(article);
            sortArticles(dataProvider.getList());
        }
        redraw();

    }

    @Override
    public void removeArticles(Collection<Client> articles) {
        dataProvider.getList().removeAll(articles);
        for (final Client article : articles) {
            selectionModel.setSelected(article, false);
        }
    }

    @Override
    public void setArticles(List<Client> articles) {
        clear();
        getProviders(articles);
        sortArticles(articles);

        listTbl.setRowCount(articles.size(), true);
        listTbl.setVisibleRange(0, articles.size());
        dataProvider.setList(articles);

    }

    @Override
    public Set<Client> getSelectedArticles() {
        return selectionModel.getSelectedSet();
    }

    @Override
    public void clear() {
        dataProvider.getList().clear();
        selectionModel.clear();
    }

    protected void redraw() {
        final List<Client> objects = dataProvider.getList();
        listTbl.setRowCount(objects.size(), true);
        listTbl.setVisibleRange(0, objects.size());
        listTbl.redraw();
    }

    @SuppressWarnings("unchecked")
    private void sortArticles(final List<Client> articles) {
        if (!articles.isEmpty()) {
            // TODO sort par publish date
        }
    }

    public void getProviders(final List<Client> articles) {
        // by default, no-op 
    }

}
