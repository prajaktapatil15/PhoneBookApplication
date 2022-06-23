package com.bikkadIt.PhoneBookApplication.Repository;

import java.io.Serializable;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.bikkadIt.PhoneBookApplication.Contact;
@Repository
public interface ContactRepository  extends JpaRepositoryImplementation<Contact, Serializable>{

}
