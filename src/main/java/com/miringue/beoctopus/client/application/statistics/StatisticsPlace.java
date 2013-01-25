package com.miringue.beoctopus.client.application.statistics;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;
import com.google.web.bindery.requestfactory.shared.RequestFactory;

public class StatisticsPlace extends Place {
  
  /** 
   * I'm not really using the tokenizer here, but good for example
   */
  @Prefix("chart")
  public static class Tokenizer implements PlaceTokenizer<StatisticsPlace> {

    private RequestFactory requestFactory;

    public Tokenizer(RequestFactory requestFactory) {
      this.requestFactory = requestFactory;
    }
    
    @Override
    public String getToken(StatisticsPlace place) {
      String token = place.getToken();
      return token;
    }

    @Override
    public StatisticsPlace getPlace(String token) {
      return new StatisticsPlace(token);
    }

  }
  
  private String token;

  public StatisticsPlace(String token) {
    this.token = token;
  }

  public String getToken() {
    return token;
  }
  
}
