package gameProject.adapters;

import gameProject.abstracts.CustomerCheckService;
import gameProject.entities.Customer;

public class EDevletServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return customer.getNationalityId().length() == 11;
	}

}
