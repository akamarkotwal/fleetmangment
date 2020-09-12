package com.akcap.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akcap.fleetapp.models.VehicleType;


@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {

}
