package one.dioinnovation.parking.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.dioinnovation.parking.model.Parking;

@RestController
@RequestMapping("/parking")
public class ParkingController {

	@GetMapping
	public List<Parking> findAll(){
		var parking = new Parking();
		parking.setId(null);
		parking.setLicense("MSD-222");
		parking.setModel("GOL");
		parking.setColor("Preto");
		parking.setEntryDate(null);
		parking.setExitDate(null);
		parking.setBill(90.23);
		
		return Arrays.asList(parking);
	}
}
