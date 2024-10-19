package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bike;
import com.example.demo.service.BikeService;





@RestController
@RequestMapping("/bike")

public class BikeController {
	BikeService bikeService; 
	
	
	public BikeController(BikeService bikeService) {
		super();
		this.bikeService = bikeService;
	}


	//Create and store bikes
	@PostMapping
	public Bike createBike(@RequestBody Bike bike) {
		return bikeService.createBike(bike);
	}
	
	
	//Read bike
	@GetMapping (value= "{regNumber}")
	public Bike getBikebyReqNumber(@PathVariable String regNumber) {
		System.out.println("---> Controller");
		return bikeService.readBikebyregnumber(regNumber);
		
	}
	
	
	//Read all bikes
	@GetMapping (value= "{regNumber}")
	public List<Bike> getallBikes(){
		return bikeService.readAllBike();
	}
	
	//update bike
	@PutMapping
	public Bike updateBikebyID(@RequestBody Bike bike) {
		return bikeService.updatebike(bike);
	}
	//delete bike
	@DeleteMapping(value= "{regNumber}")
	public String deleteBikeregNumber(@PathVariable String regNumber) {
		System.out.println("Hello World");
		return bikeService.DeleteBike(regNumber);
	}
	
	
	

}
