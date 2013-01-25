package com.miringue.beoctopus.client.application.menu;

import com.github.gwtbootstrap.client.ui.NavLink;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.miringue.beoctopus.client.ClientFactory;

public class Menu extends Composite {

    private static MenuUiBinder uiBinder = GWT.create(MenuUiBinder.class);
    private ClientFactory clientFactory;

    @UiField
    NavLink home;

    interface MenuUiBinder extends UiBinder<Widget, Menu> {
    }

    public Menu(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("home")
    public void clickHome(ClickEvent event){
        /*clientFactory.getPlaceController().goTo(place);
        Main.getPlaceController().goTo(new AccueilPlace());*/
    }
    @UiHandler("chart")
    public void clickChart(ClickEvent event){
        Window.alert("clientFactory: "+clientFactory);
        /*clientFactory.getPlaceController().goTo(place);
        Main.getPlaceController().goTo(new AccueilPlace());*/
    }
}