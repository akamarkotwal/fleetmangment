package com.akcap.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akcap.fleetapp.models.VehicleMaintenance;


@Repository
public interface VehicleMaintenanceRepository extends JpaRepository<VehicleMaintenance, Integer> {

}
