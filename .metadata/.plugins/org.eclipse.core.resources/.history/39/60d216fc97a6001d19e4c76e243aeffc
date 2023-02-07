package com.dio.parking.cloudparking.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.parking.cloudparking.model.Parking;

@RestController
@RequestMapping("/parking")
public class ParkingController {
	
	@GetMapping
	public List<Parking> findAll(){
		var parking = new Parking();
		parking.setLicense("MJS-112");
		parking.setState("CE");
		parking.setColor("Preto");
		parking.setModel("Gol");
		parking.setId("902223");
		
		
		return Arrays.asList(parking);
	}
}
