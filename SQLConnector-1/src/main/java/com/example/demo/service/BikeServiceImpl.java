package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Bike;
import com.example.demo.repositary.BikeRepositary;

@Service
public class BikeServiceImpl implements BikeService {

	
	BikeRepositary bikeRepositary;
	
	
	public BikeServiceImpl(BikeRepositary bikeRepositary) {
		super();
		this.bikeRepositary = bikeRepositary;
	}

	@Override
	public Bike createBike(Bike bike) {
	
		return bikeRepositary.save(bike);
	}

	@Override
	public Bike readBikebyregnumber(String regNumber) {
		System.out.println("---> Service ");
		return bikeRepositary.findById(regNumber).get();
	}

	@Override
	public List<Bike> readAllBike() {

		return bikeRepositary.findAll();
	}

	@Override
	public Bike updatebike(Bike bike) {
		// TODO Auto-generated method stub
		return bikeRepositary.save(bike);
	}

	@Override
	public String DeleteBike(String regNumber) {
		// TODO Auto-generated method stub
	
		 bikeRepositary.deleteById(regNumber);
		
		//It ruturns void
		 return "Bike with "+regNumber+" is deleted.";
	}

}
