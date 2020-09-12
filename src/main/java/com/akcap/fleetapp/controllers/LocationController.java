package com.akcap.fleetapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.akcap.fleetapp.models.Country;
import com.akcap.fleetapp.models.Location;
import com.akcap.fleetapp.models.State;
import com.akcap.fleetapp.services.CountryService;
import com.akcap.fleetapp.services.LocationService;
import com.akcap.fleetapp.services.StateService;

@Controller
public class LocationController {

	@Autowired private CountryService countryService;
	@Autowired private StateService stateService;
	@Autowired private LocationService locationService;

	@GetMapping("/locations")
	public String getlocations(Model model) {
		
		List<Country> countryList = countryService.getCountries();

		List<Location> locationsList = locationService.getLocations();
		
		List<State> stateList=stateService.getState();

		model.addAttribute("locations", locationsList);
		
		model.addAttribute("countries", countryList);
		
		model.addAttribute("states", stateList);

		return "location";
	}

	@PostMapping("/locations/addNew")
	public String addNew(Location location) {

		locationService.save(location);

		return "redirect:/locations";
	}

	@GetMapping("/locations/findById")
	@ResponseBody
	public Optional<Location> findById(int id) {
		// CountryService service=new CountryService();

		
		return locationService.findById(id);
	}

	@RequestMapping(value = "/locations/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(Location location) {

		locationService.save(location);

		return "redirect:/locations";
	}

	@RequestMapping(value = "/locations/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
	public String delete(Integer  id) {

		locationService.delete(id);

		return "redirect:/locations";
	}

}
