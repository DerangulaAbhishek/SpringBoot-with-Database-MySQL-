package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Bike;

public interface BikeService {

	//Create and store bikes
	Bike createBike(Bike bike);

	//Read bike
	Bike readBikebyregnumber(String regNumber);
		
	//Read all bikes
	List<Bike> readAllBike();	
	
	//update bike
	Bike updatebike(Bike bike);
			
	//delete bike
	String DeleteBike(String regNumber);
	
	
}
