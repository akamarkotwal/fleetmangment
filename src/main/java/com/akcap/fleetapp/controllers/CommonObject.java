package com.akcap.fleetapp.controllers;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.akcap.fleetapp.models.Auditable;

public class CommonObject extends Auditable<String>{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String description;
	private String details;
	public CommonObject() {
		super();
	}
	public CommonObject(Integer id, String description, String details) {
		super();
		this.id = id;
		this.description = description;
		this.details = details;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	

}
