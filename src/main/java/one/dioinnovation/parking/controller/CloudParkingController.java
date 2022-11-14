package one.dioinnovation.parking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CloudParkingController {

	@GetMapping
	public String home() {
		return "Bem-vindos";
	}
}
