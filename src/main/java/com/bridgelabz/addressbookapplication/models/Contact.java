package com.bridgelabz.addressbookapplication.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bridgelabz.addressbookapplication.dto.ContactDTO;

import lombok.Data;

@Entity
@Table(name = "address_book")
public @Data class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int contactId;
    public String firstName;
    public String lastName;
    public String address;
    public String state;
    public String city;
    public String zip;
    public String phoneNumber;

    public Contact() {
        
    }

    public Contact(ContactDTO contactDTO) {	
		this.updateContact(contactDTO);
	}

    public void updateContact(ContactDTO contactDTO) {

        this.firstName = contactDTO.firstName;
        this.lastName = contactDTO.lastName;
        this.address = contactDTO.address;
        this.state = contactDTO.state;
        this.city = contactDTO.city;
        this.zip = contactDTO.zip;
        this.phoneNumber = contactDTO.phoneNumber;
    }
}
