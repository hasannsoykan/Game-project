package gameProject.entities;

import java.time.LocalDate;

public class Seller extends Customer{
	private String number;

	public Seller(String id, String email, String firstName, String lastName, LocalDate dateOfBirth,
			String nationalityId, String number) {
		super(id, email, firstName, lastName, dateOfBirth, nationalityId);
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	

}
