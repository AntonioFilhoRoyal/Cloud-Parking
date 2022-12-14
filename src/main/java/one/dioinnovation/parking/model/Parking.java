package one.dioinnovation.parking.model;

import java.time.LocalDateTime;

@Entity
public class Parking {
	
	@Id
	private String id;
	private String license;
	private String model;
	private String state;
	private String color;
	private LocalDateTime entryDate;
	private LocalDateTime exitDate;
	private Double bill;
	
	
	
	public Parking(String id, String license, String model, String state, String color) {
	
	}
	
	public Parking() {
		super();

	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public LocalDateTime getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(LocalDateTime entryDate) {
		this.entryDate = entryDate;
	}
	public LocalDateTime getExitDate() {
		return exitDate;
	}
	public void setExitDate(LocalDateTime exitDate) {
		this.exitDate = exitDate;
	}
	public Double getBill() {
		return bill;
	}
	public void setBill(Double bill) {
		this.bill = bill;
	}

	public void setColor(Parking parkingCreate, Object color2) {
		// TODO Auto-generated method stub
		
	}

}
