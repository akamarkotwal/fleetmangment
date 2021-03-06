package com.akcap.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akcap.fleetapp.models.State;
import com.akcap.fleetapp.repositories.StateRepository;

@Service
public class StateService {
	
	@Autowired
	private StateRepository stateRepository;
	
	public List<State> getState() {

		return stateRepository.findAll();

	}

	public void save(State state) {
		stateRepository.save(state);
	}

	public Optional<State> findById(int id) {
		return stateRepository.findById(id);
	}
	
	public void delete(int id) {
		stateRepository.deleteById(id);
	}

}
