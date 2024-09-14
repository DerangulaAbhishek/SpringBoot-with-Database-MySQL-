package com.example.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Bike;

public interface BikeRepositary extends JpaRepository<Bike, String>{

}
