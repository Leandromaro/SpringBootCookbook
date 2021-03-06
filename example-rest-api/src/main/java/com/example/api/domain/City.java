package com.example.api.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * City Class
 * @author iparis
 */

@Entity
@Table(name = "city")
public class City{
	
	//An autogenerated id (unique for each player in the db)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	private String name;
	
	@NotNull
	private String country;
	
	//Constructors
	public City() {
	}
	
	public City(String name, String country) {
		this.name = name;
		this.country = country;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
