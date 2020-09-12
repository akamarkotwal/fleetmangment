package com.akcap.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akcap.fleetapp.models.Contact;



@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
