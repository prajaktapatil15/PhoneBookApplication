package com.bikkadIt.PhoneBookApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIt.PhoneBookApplication.Contact;
import com.bikkadIt.PhoneBookApplication.Service.ContactServiceI;

@RestController
public class ContactController {
    @Autowired
	private  ContactServiceI contactserviceI;
    
	@PostMapping(value="/saveContact",consumes = "APPLICATION/JSON")
	public ResponseEntity<String> saveContact(@RequestBody Contact contact){
		
	  boolean save = contactserviceI.savecontact(contact);
		if(save != true) {
			String msg=" Contact Saved Successfully";
			return new ResponseEntity<String>(msg,HttpStatus.OK);
			
		}else {
			String msg=" Contact  not Saved Successfully";
			return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);
			
			
		}
		
	}
	
	
	

}
