package com.akcap.fleetapp.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.akcap.fleetapp.models.Vehicle;
import com.akcap.fleetapp.services.EmployeeService;
import com.akcap.fleetapp.services.LocationService;
import com.akcap.fleetapp.services.VehicleMakeService;
import com.akcap.fleetapp.services.VehicleModelService;
import com.akcap.fleetapp.services.VehicleService;
import com.akcap.fleetapp.services.VehicleStatusService;
import com.akcap.fleetapp.services.VehicleTypeService;

@Controller

public class VehicleController {
	@Autowired	private VehicleService vehicleService;
	@Autowired	private LocationService locationService;
	@Autowired	private EmployeeService employeeService;
	@Autowired	private VehicleMakeService vehicleMakeService;
	@Autowired	private VehicleStatusService vehicleStatusService;
	@Autowired	private VehicleTypeService vehicleTypeService;
	@Autowired	private VehicleModelService vehicleModelService;


	@GetMapping("/vehicles")
	public String getVehicles(Model model) {	
		
		model.addAttribute("vehicles", vehicleService.getVehicles());			
		model.addAttribute("locations", locationService.getLocations());		
	    model.addAttribute("employees", employeeService.getEmployees());
		model.addAttribute("vehicleMakes", vehicleMakeService.getVehicleMakes());			
		model.addAttribute("vehicleStatuses", vehicleStatusService.getVehicleStatuses());		
		model.addAttribute("vehicleTypes", vehicleTypeService.getVehicleTypes());
		model.addAttribute("vehicleModels", vehicleModelService.getVehicleModels());				
		return "Vehicle";
	}	
	
	@PostMapping("/vehicles/addNew")
	public String addNew(Vehicle vehicle) {
		vehicleService.save(vehicle);
		return "redirect:/vehicles";
	}
	
	@RequestMapping("vehicles/findById")
	@ResponseBody
	public Optional<Vehicle> findById(int id) {
	  return vehicleService.findById(id);	
	}	
	
	@RequestMapping(value="/vehicles/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Vehicle vehicle) {
		vehicleService.save(vehicle);
		return "redirect:/vehicles";
	}
	
	@RequestMapping(value="/vehicles/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		vehicleService.delete(id);
		return "redirect:/vehicles";
	}

}
