package gameProject.concrete;

import gameProject.abstracts.CustomerCheckService;
import gameProject.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return false;
	}

}
