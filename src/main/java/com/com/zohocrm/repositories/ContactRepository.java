package com.com.zohocrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.com.zohocrm.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
