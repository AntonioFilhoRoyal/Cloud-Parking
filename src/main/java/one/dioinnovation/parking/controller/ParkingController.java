package one.dioinnovation.parking.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import one.dioinnovation.parking.controller.dto.ParkingCreateDTO;
import one.dioinnovation.parking.controller.dto.ParkingDTO;
import one.dioinnovation.parking.controller.mapper.ParkingMapper;
import one.dioinnovation.parking.model.Parking;
import one.dioinnovation.parking.service.ParkingService;

@RestController
@RequestMapping("/parking")
@Api(tags = "Parking Controller")
	public class ParkingController {
	
	private ParkingService parkingService = new ParkingService();
	private ParkingMapper parkingMapper = new ParkingMapper();
	
	
	
	public ParkingController(ParkingService parkingService, ParkingMapper parkingMapper) {
		this.parkingService = parkingService;
		this.parkingMapper = parkingMapper;
	}

		// Lista de todos os objeto
	@GetMapping
	@ApiOperation("Find All")
	public ResponseEntity<List<ParkingDTO>> findAll(){
		List<Parking> parkingList = parkingService.findAll();
		List<ParkingDTO> result = parkingMapper.toParkingDTOList(parkingList);
		return ResponseEntity.ok(result);
	}

		// Pega o objeto pelo ID
	@GetMapping("/{id}")
	@ApiOperation("Find By Id")
	public ResponseEntity<ParkingDTO> findById(String id){
		Parking parking = parkingService.findById(id);
		ParkingDTO result = parkingMapper.toParkingDTO(parking);
		return ResponseEntity.ok(result);
	}
	
	@PostMapping
	public ResponseEntity<ParkingDTO> create(@RequestBody ParkingCreateDTO dto){
		var parkingCreate = ParkingMapper.toParkingCreated(dto);
		var parking = parkingService.create(parkingCreate);
		var result = parkingMapper.toParkingDTO(parking);
		return ResponseEntity.status(HttpStatus.CREATED).body(result);
	}
	
	@PutMapping
	public ResponseEntity<ParkingDTO> update(@PathVariable String id, @RequestBody ParkingCreateDTO dto){
		Parking parkingUpdate = ParkingMapper.toParkingCreated(dto);
		Parking parking = parkingService.update(id, parkingUpdate);
		return ResponseEntity.ok(parkingMapper.toParkingDTO(parking));
	}
	
	@PostMapping
	public ResponseEntity<ParkingDTO> checkOut(@PathVariable String id){
		Parking parking = parkingService.checkOut(id);
		return ResponseEntity.ok(parkingMapping.toParkingDTO(parking);
	}
	
	@DeleteMapping
	public ResponseEntity<ParkingDTO> delete(@PathVariable String id){
		parkingService.delete(id);
		return ResponseEntity.noContent().build();
	}

	public ParkingMapper getParkingMapper() {
		return parkingMapper;
	}	
}
