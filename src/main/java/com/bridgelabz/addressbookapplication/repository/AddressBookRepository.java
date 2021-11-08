package com.bridgelabz.addressbookapplication.repository;

import java.util.List;

import com.bridgelabz.addressbookapplication.models.Contact;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AddressBookRepository extends JpaRepository<Contact, Integer> {

    @Query(value = "select * from address_book where state=:state", nativeQuery = true)
    List<Contact> findContactByState(String state);

    @Query(value = "select * from address_book where city=:city", nativeQuery = true)
    List<Contact> findContactByCity(String city);

}
