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
import com.akcap.fleetapp.models.State;
import com.akcap.fleetapp.repositories.CountryRepository;
import com.akcap.fleetapp.services.CountryService;
import com.akcap.fleetapp.services.StateService;

@Controller
public class StateController {
	
	@Autowired
	private StateService stateService;
	
	@Autowired
	private CountryService countryService;

	@GetMapping("/states")
	public String getCountries(Model model) {

		List<State> stateList = stateService.getState();
		
		List<Country> countryList=countryService.getCountries();

		model.addAttribute("states", stateList);
		model.addAttribute("countries", countryList);

		return "State";
	}

	@PostMapping("/states/addNew")
	public String addNew(State state) {

		stateService.save(state);

		return "redirect:/states";
	}

	@GetMapping("/states/findById")
	@ResponseBody
	public Optional<State> findById(int id) {
		// CountryService service=new CountryService();

		System.out.println(id);
		return stateService.findById(id);
	}

	@RequestMapping(value = "/states/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(State state) {

		stateService.save(state);

		return "redirect:/states";
	}

	@RequestMapping(value = "/states/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
	public String delete(int id) {

		stateService.delete(id);

		return "redirect:/states";
	}

}
