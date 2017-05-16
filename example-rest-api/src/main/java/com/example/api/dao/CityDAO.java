package com.example.api.dao;

import java.util.ArrayList;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import com.example.api.domain.City;

/**
 * Player DAO extends CrudRepository
 * @author iparis
 */

@Transactional
public interface CityDAO extends CrudRepository<City, Long> {
	
	@Override
	ArrayList<City> findAll();
	
	@Override
	City findOne(Long idCity);
	
	@Override
	<S extends City> S save(S city);
	
	@Override
	void delete(Long id_city);
	
}
