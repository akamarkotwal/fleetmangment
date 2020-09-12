package com.akcap.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akcap.fleetapp.models.VehicleHire;



@Repository
public interface VehicleHireRepository extends JpaRepository<VehicleHire, Integer> {

}
