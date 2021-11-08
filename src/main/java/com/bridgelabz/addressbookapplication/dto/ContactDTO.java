package com.bridgelabz.addressbookapplication.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.ToString;

public @ToString class ContactDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-z]{2,}$", message = "First name Invalid")
    @NotBlank(message = "First name cannot be Empty")
    public String firstName;

    @Pattern(regexp = "^[A-Z]{1}[a-z]{2,}$", message = "Last name Invalid")
    @NotBlank(message = "Last name cannot be Empty")
    public String lastName;

    @Pattern(regexp = "(?!^\\d+$)^[A-Z,a-z,0-9, ()#-]{3,}$", message = "Address Invalid")
    @NotBlank(message = "Address cannot be Empty")
    public String address;

    @NotBlank(message = "State cannot be Empty")
    public String state;

    @NotBlank(message = "City cannot be Empty")
    public String city;

    @Pattern(regexp = "^[0-9]{3}\\s{0,1}[0-9]{3}$", message = "Zip Code Invalid")
    @NotBlank(message = "Zip code cannot be Empty")
    public String zip;

    @Pattern(regexp = "^([\\+]?\\d{2})?[\\s]?\\d{10}$", message = "Phone Invalid")
    @NotBlank(message = "Phone Number cannot be Empty")
    public String phoneNumber;

}
