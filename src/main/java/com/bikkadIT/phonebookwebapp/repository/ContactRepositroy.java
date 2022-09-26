package com.bikkadIT.phonebookwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadIT.phonebookwebapp.model.Contact;

@Repository
public interface ContactRepositroy extends JpaRepository<Contact, Integer>{

	
}
