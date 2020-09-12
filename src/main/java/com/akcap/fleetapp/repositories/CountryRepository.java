package com.akcap.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akcap.fleetapp.models.Country;



@Repository

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
