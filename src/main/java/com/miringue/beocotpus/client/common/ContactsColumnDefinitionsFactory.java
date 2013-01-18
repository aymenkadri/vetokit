package com.miringue.beocotpus.client.common;

import com.miringue.beocotpus.shared.ContactDetails;

import java.util.ArrayList;
import java.util.List;

public class ContactsColumnDefinitionsFactory<T> {
  public static List<ColumnDefinition<ContactDetails>>
      getContactsColumnDefinitions() {
    return ContactsColumnDefinitionsImpl.getInstance();
  }

  public static List<ColumnDefinition<ContactDetails>>
      getTestContactsColumnDefinitions() {
    return new ArrayList<ColumnDefinition<ContactDetails>>();
  }
}
