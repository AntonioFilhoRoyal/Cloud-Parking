package one.dioinnovation.parking.exception;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ParkingNotFoundException extends RuntimeException{

	public ParkingNotFoundException(String id){
		super("Parking Not Foud with Id: " + id);
	}
}
