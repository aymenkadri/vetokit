package com.miringue.vetokit.back.client.ui.clients;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;
import com.miringue.vetokit.back.shared.model.Client;

public interface ClientView extends IsWidget {

    void setPresenter(Presenter listener);

    void addArticle(Client client);

    void removeArticles(Collection<Client> clients);

    void setArticles(List<Client> clients);

    Set<Client> getSelectedArticles();

    void clear();



    public interface Presenter {

        void goTo(Place place);

        void onSelect(Set<Client> selectedclients);
    }
}
