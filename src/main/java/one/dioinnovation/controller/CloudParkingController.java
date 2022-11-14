package one.dioinnovation.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/")
public class CloudParkingController {
	
	@GetMapping
	public String home() {
		return "Bem-vindos";
	}
}
