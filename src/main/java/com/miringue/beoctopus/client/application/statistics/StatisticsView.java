 package com.miringue.beoctopus.client.application.statistics;

 import com.google.gwt.core.client.GWT;
 import com.google.gwt.uibinder.client.UiBinder;
 import com.google.gwt.user.client.ui.Composite;
 import com.google.gwt.user.client.ui.Widget;
 import com.miringue.beoctopus.client.application.Presenter;

 public class StatisticsView extends Composite {

   private static SignInViewImplUiBinder uiBinder = GWT.create(SignInViewImplUiBinder.class);

   interface SignInViewImplUiBinder extends UiBinder<Widget, StatisticsView> {}

   private Presenter presenter;

   public StatisticsView() {
     initWidget(uiBinder.createAndBindUi(this));
   }

   public void setPresenter(Presenter presenter) {
     this.presenter = presenter;
   }

   public void start() {

   }

 }
