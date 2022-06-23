package com.bikkadIt.PhoneBookApplication;

import java.time.LocalDate;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CONTACT-DTLS")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CONTACT_ID")
	private int contactId;
    
	@Column(name="CONTACT_NAME")
	private String contactName;
	
    @Column(name="CONTACT_NUMBER")
    private Long contactNumber;
    
    @Column(name="CONTACT_EMAIL")
    private String contactEmail;
    
    @Column(name="CONTACT_ACTIVESW")
    private Character activeSw;
    
    @Column(name="CONTACT_CREATEDDATE")
    private LocalDate createdDate;
    
    @Column(name="CONTACT_UPDATEDDATE")
    private LocalDate updatedDate;

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public Character getActiveSw() {
		return activeSw;
	}

	public void setActiveSw(Character activeSw) {
		this.activeSw = activeSw;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", contactNumber=" + contactNumber
				+ ", contactEmail=" + contactEmail + ", activeSw=" + activeSw + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + "]";
	}
	



	
	
	
	
	
	
	
	
	
	
}
