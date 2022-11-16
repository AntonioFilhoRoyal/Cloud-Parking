package one.dioinnovation.parking.controller.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import one.dioinnovation.parking.controller.dto.ParkingCreateDTO;
import one.dioinnovation.parking.controller.dto.ParkingDTO;
import one.dioinnovation.parking.model.Parking;
import java.util.*;
import java.util.stream.Collectors;

@Component
public class ParkingMapper {
	
	private static final ModelMapper MODEL_MAPPER = new ModelMapper();
	
	public ParkingDTO toParkingDTO(Parking parking) {
		return MODEL_MAPPER.map(parking, ParkingDTO.class);
	}
	
	public List<ParkingDTO> toParkingDTOList(List<Parking> parkingList){
		return parkingList.stream().map(this::toParkingDTO).collect(Collectors.toList());
	}

	public static Parking toParking(ParkingCreateDTO dto) {
		return MODEL_MAPPER.map(dto, Parking.class);
	}
	
	
	public static Parking toParkingCreated(ParkingCreateDTO dto) {
		return MODEL_MAPPER.map(dto, Parking.class);
	}
	
}