package model.entities;

public class Veicle {
	
	private String model;
	
	private Veicle() {
		
	}

	public Veicle(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
