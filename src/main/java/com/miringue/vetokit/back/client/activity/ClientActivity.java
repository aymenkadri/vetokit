package com.miringue.vetokit.back.client.activity;



import java.util.List;
import java.util.Set;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.miringue.vetokit.back.client.mvp.HasPlace;
import com.miringue.vetokit.back.client.place.ClientPlace;
import com.miringue.vetokit.back.client.rpc.AppAsyncCallback;
import com.miringue.vetokit.back.client.rpc.ClientRPCServiceAsync;
import com.miringue.vetokit.back.client.ui.clients.ClientView;
import com.miringue.vetokit.back.shared.model.Client;

public class ClientActivity extends AbstractActivity implements HasPlace, ClientView.Presenter {

    @Inject
    private ClientView view;

    @Inject
    private PlaceController placeController;

    private ClientPlace place;

    @Inject
    private ClientRPCServiceAsync articleService;

    @Override
    public void start(final AcceptsOneWidget panel, final EventBus eventBus) {
        view.setPresenter(this);
        panel.setWidget(view.asWidget());

        articleService.listAll(new AppAsyncCallback<List<Client>>() {

            @Override
            public void onSuccess(List<Client> result) {
                view.setArticles(result);
            }
        });
    }

    @Override
    public void goTo(final Place place) {
        placeController.goTo(place);
    }

    @Override
    public Activity setPlace(final Place place) {
        this.place = (ClientPlace) place;
        return this;
    }

    @Override
    public void onSelect(Set<Client> selectedarticles) {
        // TODO Auto-generated method stub

    }

}
