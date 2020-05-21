package model.entities;

import java.util.Date;

public class carRental {
	
	private Date start;
	private Date finish;
	
	private Veicle veicle;
	private Invoice invoice;
	
	public carRental() {
	}

	public carRental(Date start, Date finish, Veicle veicle) {
		this.start = start;
		this.finish = finish;
		this.veicle = veicle;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getFinish() {
		return finish;
	}

	public void setFinish(Date finish) {
		this.finish = finish;
	}

	public Veicle getVeicle() {
		return veicle;
	}

	public void setVeicle(Veicle veicle) {
		this.veicle = veicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	
	
}
