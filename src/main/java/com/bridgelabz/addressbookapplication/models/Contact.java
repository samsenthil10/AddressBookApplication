package com.bridgelabz.addressbookapplication.models;

import com.bridgelabz.addressbookapplication.dto.ContactDTO;

import lombok.Data;

public @Data class Contact {
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

    public Contact(int contactId, ContactDTO contactDTO) {
        this.contactId = contactId;
        this.firstName = contactDTO.firstName;
        this.lastName = contactDTO.lastName;
        this.address = contactDTO.address;
        this.state = contactDTO.state;
        this.city = contactDTO.city;
        this.zip = contactDTO.zip;
        this.phoneNumber = contactDTO.phoneNumber;
    }
}
