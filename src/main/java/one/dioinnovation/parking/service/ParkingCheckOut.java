package one.dioinnovation.parking.service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import one.dioinnovation.parking.model.Parking;

public class ParkingCheckOut {

	public static int ONE_HOUR = 60;
	public static int TRENTY_HOUR_VALUE = 24 * ONE_HOUR;
	public static double ONE_HOUR_VALUE = 5.0;
	public static double ADDITIONAL_PER_HOUR_VALUE = 2.00;
	public static double DATA_VALUE = 24.00;
	
	public static Double getBill(Parking parking) {
		return getBill(parking.getEntryDate(), parking.getExitDate());
	}

	private static Double getBill(LocalDateTime entryDate, LocalDateTime exitDate) {
		long minutes = entryDate.until(exitDate, ChronoUnit.MINUTES);
		Double bill = 0.0;
		
		if(minutes <= ONE_HOUR) {
			return ONE_HOUR_VALUE;
		}
		
		if(minutes <= TRENTY_HOUR_VALUE) {
			bill = ONE_HOUR_VALUE;
			int hours = (int) (minutes / ONE_HOUR);
			System.out.println(hours);
			for(int i = 0; i < hours; i++) {
				bill += ADDITIONAL_PER_HOUR_VALUE;
			}
			return bill;
		}
		
		int days = (int) (minutes / TRENTY_HOUR_VALUE);
		System.out.println(days);
		for(int i = 0; i < days; i++) {
			bill += DATA_VALUE;
		}
		return bill;
	}
	
}



