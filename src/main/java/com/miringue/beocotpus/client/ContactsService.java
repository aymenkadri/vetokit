package com.miringue.beocotpus.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.miringue.beocotpus.shared.Contact;
import com.miringue.beocotpus.shared.ContactDetails;

import java.util.ArrayList;

@RemoteServiceRelativePath("contactsService")
public interface ContactsService extends RemoteService {
	
  Contact addContact(Contact contact);
  Boolean deleteContact(String id); 
  ArrayList<ContactDetails> deleteContacts(ArrayList<String> ids);
  ArrayList<ContactDetails> getContactDetails();
  Contact getContact(String id);
  Contact updateContact(Contact contact);
}
