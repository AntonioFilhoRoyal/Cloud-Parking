package one.dioinnovation.parking.service;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import one.dioinnovation.parking.exception.ParkingNotFoundException;
import one.dioinnovation.parking.model.Parking;
import one.dioinnovation.parking.repository.ParkingRepository;

@Service
public class ParkingService {

	private final ParkingRepository parkingRepository;
	
	static {
		var id = getUUID();
		var id1 = getUUID();
		Parking parking = new Parking(id, "MSD-973", "SC", "GOL","PRETO");
		Parking parking1 = new Parking(id1, "MSD-554", "CE", "PUTUN","PRETO");
		parkingMap.put(id, parking);
		
	}
	
	public List<Parking> findAll(){
		return parkingRepository.findAll();
	}
	
	private static String getUUID() {
		return UUID.randomUUID().toString().replace("-", "");
	
	}

	public Parking findById(String id) {
		return parkingRepository.findById(id).orElseThrow(() ->
				new ParkingNotFoundException(id));
	}

	public Parking create(Parking parkingCreate) {
		var uuid = getUUID();
		parkingCreate.setId(uuid);
		parkingCreate.setEntryDate(LocalDateTime.now());
		parkingRepository.save(parkingCreate);
		return parkingCreate;
	}

	public void delete(String id) {
		// TODO Auto-generated method stub
		findById(id);
		return parkingRepository.deleteById(id);
	}

	public Parking update(String id, Parking parkingCreate) {
		// TODO Auto-generated method stub
		Parking byId = findById(id);
		byId.setLicense(parkingCreate, getLicense());
		byId.setColor(parkingCreate, getColor());
		parkingRepository.save(byId);
		return byId;
	}

	public Parking checkOout(String id) {
		return null;
	}
	
	private Object getLicense() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object getColor() {
		// TODO Auto-generated method stub
		return null;
	}

}

