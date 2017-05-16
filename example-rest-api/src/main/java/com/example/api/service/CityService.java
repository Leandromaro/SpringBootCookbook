package com.example.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.api.dao.CityDAO;
import com.example.api.domain.City;

/**
 * Player Service Implementation
 * @author iparis
 */

@Service
public class CityService {
	
	@Autowired
	CityDAO cityDAO;
	
	/**
	 * Get all the cities
	 * @author iparis
	 * @return List<City> lCities
	 */
	public List<City> getAll() {
		List<City> lCities = new ArrayList<City>();
		lCities = cityDAO.findAll();
		return lCities;
	}
	
	/**
	 * Get city by id
	 * @author iparis
	 * @return City city
	 */
	public City getCityById(Long idCity) {
		City city = new City();
		city = cityDAO.findOne(idCity);
		return city;
	}

	/**
	 * Add a new city
	 * @author iparis
	 * @param City
	 * @return boolean
	 */
	public boolean addCity(City newCity) {
		if(cityDAO.save(newCity) != null){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * Delete a city by id_city.
	 * @author iparis
	 * @param id_city
	 * @return boolean
	 */
	public boolean deleteCity(Long id_city) {
		try{
			cityDAO.delete(id_city);
			return true;
		}catch(IllegalArgumentException exception){
			return false;
		}
	}
	
}
