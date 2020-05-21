package model.services;

import model.entities.Invoice;
import model.entities.carRental;

public class RentalService {
	private Double pricePerDay;
	private Double pricePerHour;
	
	private BrasilTaxService taxService;

	public RentalService(Double pricePerDay, Double pricePerHour, BrasilTaxService taxService) {
		super();
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	public void proccessInvoice(carRental carRental) {
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();
		
		double hours = (double)(t2 - t1) / 1000 / 60 / 60;
		double basicPayment;
		if(hours <= 12.0) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		}else {
			basicPayment = Math.ceil(hours)  * pricePerDay;
		}
	
		double tax = taxService.tax(basicPayment);
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
	
	
}