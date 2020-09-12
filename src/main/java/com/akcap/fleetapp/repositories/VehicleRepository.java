package com.akcap.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akcap.fleetapp.models.Vehicle;



@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}