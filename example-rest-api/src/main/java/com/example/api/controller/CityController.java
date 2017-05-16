package com.example.api.controller;

import com.example.api.domain.City;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.api.service.CityService;

/**
 * City RestController
 * @author iparis
 */

@RestController
@CrossOrigin(origins = "http://localhost")
@RequestMapping("/cities")
public class CityController {
	
	@Autowired
	private CityService cityService;
	
	@RequestMapping(method=RequestMethod.GET)
	public HttpEntity<List<City>> getAllCities() {
		return new ResponseEntity<List<City>>(cityService.getAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method=RequestMethod.GET)
	public HttpEntity<City> getCityById(@PathVariable final long id) {
		return new ResponseEntity<City>(cityService.getCityById(id), HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public HttpEntity<Boolean> addCity(@RequestBody City newCity) {
		return new ResponseEntity<Boolean>(cityService.addCity(newCity), HttpStatus.CREATED);
	}

	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public HttpEntity<Boolean> deleteCity(@PathVariable("id") String id) {
		return new ResponseEntity<Boolean>(cityService.deleteCity(Long.valueOf(id)), HttpStatus.NO_CONTENT);
	}
}

