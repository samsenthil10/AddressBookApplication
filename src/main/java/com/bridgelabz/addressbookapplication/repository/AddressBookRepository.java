package com.bridgelabz.addressbookapplication.repository;

import com.bridgelabz.addressbookapplication.models.Contact;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressBookRepository extends JpaRepository<Contact, Integer> {

}
