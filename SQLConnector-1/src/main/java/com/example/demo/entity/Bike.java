package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Bike {
	
	
	@Id
	String regNumber;
	String manufacturer;
	double cost;
	public Bike() {
		super();
	}
	public Bike(String regNumber, String manufacturer, double cost) {
		super();
		this.regNumber = regNumber;
		this.manufacturer = manufacturer;
		this.cost = cost;
	}
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Bike [regNumber=" + regNumber + ", manufacturer=" + manufacturer + ", cost=" + cost + "]";
	}
	

}
