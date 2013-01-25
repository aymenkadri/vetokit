package com.miringue.beoctopus.client.application.menu;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;
import com.google.web.bindery.requestfactory.shared.RequestFactory;

public class MenuPlace extends Place {

  /**
   * I'm not really using the tokenizer here, but good for example
   */
  @Prefix("menu")
  public static class Tokenizer implements PlaceTokenizer<MenuPlace> {

    private RequestFactory requestFactory;

    public Tokenizer(RequestFactory requestFactory) {
      this.requestFactory = requestFactory;
    }

    @Override
    public String getToken(MenuPlace place) {
      String token = place.getToken();
      return token;
    }

    @Override
    public MenuPlace getPlace(String token) {
      return new MenuPlace(token);
    }

  }

  private String token;

  public MenuPlace(String token) {
    this.token = token;
  }

  public String getToken() {
    return token;
  }
  
}
