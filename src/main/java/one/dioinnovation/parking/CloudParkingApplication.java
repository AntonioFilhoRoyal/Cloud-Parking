package one.dioinnovation.parking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudParkingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudParkingApplication.class, args);
	}

}

/*
	docker run --name parking-db -p 5432:5432 -e POSTGRES_DB=parking -e POSTGRE_USER=admin -e
		POSTGRE_PASSWORD=123 -d postgres:10-alpine

*/