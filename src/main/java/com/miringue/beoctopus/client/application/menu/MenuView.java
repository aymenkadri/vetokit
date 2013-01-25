 package com.miringue.beoctopus.client.application.menu;

 import com.github.gwtbootstrap.client.ui.NavLink;
 import com.google.gwt.core.client.GWT;
 import com.google.gwt.uibinder.client.UiBinder;
 import com.google.gwt.uibinder.client.UiField;
 import com.google.gwt.user.client.ui.Composite;
 import com.google.gwt.user.client.ui.Widget;
 import com.miringue.beoctopus.client.application.Presenter;

 public class MenuView extends Composite {

   private static SignInViewImplUiBinder uiBinder = GWT.create(SignInViewImplUiBinder.class);

   interface SignInViewImplUiBinder extends UiBinder<Widget, MenuView> {}

     @UiField
     NavLink home;
   private Presenter presenter;

   public MenuView() {
     initWidget(uiBinder.createAndBindUi(this));
   }

   public void setPresenter(Presenter presenter) {
     this.presenter = presenter;
   }

   public void start() {

   }

 }
