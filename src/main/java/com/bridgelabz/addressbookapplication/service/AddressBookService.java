package com.bridgelabz.addressbookapplication.service;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.addressbookapplication.dto.ContactDTO;
import com.bridgelabz.addressbookapplication.model.Contact;

import org.springframework.stereotype.Service;

@Service
public class AddressBookService implements IAddressBookService {

    @Override
    public List<Contact> getContact() {
        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact(1,
                new ContactDTO("Front", "Man", "Play Arena", "Karnataka", "Bengaluru", "560001", "9876543210")));
        return contactList;
    }

    @Override
    public Contact getContactById(int contactId) {
        Contact contact = new Contact(1,
                new ContactDTO("Front", "Man", "Play Arena", "Karnataka", "Bengaluru", "560001", "9876543210"));
        return contact;
    }

    @Override
    public Contact createContact(ContactDTO contactDTO) {
        Contact contact = new Contact(1, contactDTO);
        return contact;
    }

    @Override
    public Contact updateContact(int contactId, ContactDTO contactDTO) {
        Contact contact = new Contact(1, contactDTO);
        return contact;
    }

    @Override
    public void deleteContact(int contactId) {

    }

}
