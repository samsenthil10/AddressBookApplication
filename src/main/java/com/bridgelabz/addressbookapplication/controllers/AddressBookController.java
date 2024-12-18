package com.bridgelabz.addressbookapplication.controllers;

import java.util.List;

import javax.validation.Valid;

import com.bridgelabz.addressbookapplication.dto.ContactDTO;
import com.bridgelabz.addressbookapplication.dto.ResponseDTO;
import com.bridgelabz.addressbookapplication.models.Contact;
import com.bridgelabz.addressbookapplication.services.IAddressBookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/addressbookservice")
@Slf4j
public class AddressBookController {

    @Autowired
    private IAddressBookService addressBookService;

    @RequestMapping(value = { "", "/", "/get" })
    public ResponseEntity<ResponseDTO> getContactData() {

        List<Contact> contactList = addressBookService.getContact();
        ResponseDTO response = new ResponseDTO("Get call success", contactList);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }

    @GetMapping("/get/{contactId}")
    public ResponseEntity<ResponseDTO> getContactData(@PathVariable("contactId") int contactId) {
        Contact contact = addressBookService.getContactById(contactId);
        ResponseDTO response = new ResponseDTO("Get call success for id", contact);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addContactData(@Valid @RequestBody ContactDTO contactDTO) {
        Contact contact = addressBookService.createContact(contactDTO);
        log.debug("Address Book DTO: " + contactDTO.toString());
        ResponseDTO response = new ResponseDTO("Created contact data for", contact);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }

    @PutMapping("/update/{contactId}")
    public ResponseEntity<ResponseDTO> updateContactData(@PathVariable("contactId") int contactId,
            @Valid @RequestBody ContactDTO contactDTO) {
        Contact contact = addressBookService.updateContact(contactId, contactDTO);
        ResponseDTO response = new ResponseDTO("Updated contact data for", contact);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }

    @DeleteMapping("/delete/{contactId}")
    public ResponseEntity<ResponseDTO> deleteContactData(@PathVariable("contactId") int contactId) {
        addressBookService.deleteContact(contactId);
        ResponseDTO response = new ResponseDTO("Delete call success for id ", "deleted id:" + contactId);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }

    @GetMapping("/state/{state}")
	public ResponseEntity<ResponseDTO> getContactByState(@PathVariable String state) {
		List<Contact> contactList = addressBookService.findContactByState(state);
		ResponseDTO response = new ResponseDTO("success", contactList);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
	}

    @GetMapping("/city/{city}")
	public ResponseEntity<ResponseDTO> getContactByCity(@PathVariable String city) {
		List<Contact> contactList = addressBookService.findContactByCity(city);
		ResponseDTO response = new ResponseDTO("success", contactList);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
	}
}