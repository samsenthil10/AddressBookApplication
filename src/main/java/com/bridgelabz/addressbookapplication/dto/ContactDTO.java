package com.bridgelabz.addressbookapplication.dto;

import javax.validation.constraints.Pattern;

public class ContactDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-z]{2,}$", message = "First name Invalid")
    public String firstName;

    @Pattern(regexp = "^[A-Z]{1}[a-z]{2,}$", message = "Last name Invalid")
    public String lastName;

    @Pattern(regexp = "(?!^\\d+$)^[A-Z,a-z,0-9, ()#-]{3,}$", message = "Address Invalid")
    public String address;

    public String state;
    public String city;

    @Pattern(regexp = "^[0-9]{3}\\s{0,1}[0-9]{3}$", message = "Zip Code Invalid")
    public String zip;

    @Pattern(regexp = "^([\\+]?\\d{2})?[\\s]?\\d{10}$", message = "Phone Invalid")
    public String phoneNumber;

    public ContactDTO(String firstName, String lastName, String address, String state, String city, String zip,
            String phoneNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.state = state;
        this.city = city;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "ContactDTO [First Name =" + firstName + ", Last Name =" + lastName + ", Address =" + address
                + ", State =" + state + ", City =" + city + ", Zip =" + zip + ", Phone =" + phoneNumber + "]";
    }

}
