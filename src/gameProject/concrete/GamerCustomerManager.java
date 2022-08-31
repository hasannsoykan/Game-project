package gameProject.concrete;

import gameProject.abstracts.BaseCustomerManager;
import gameProject.abstracts.CustomerCheckService;
import gameProject.entities.Customer;

public class GamerCustomerManager extends BaseCustomerManager {
	CustomerCheckService customerCheckService;

	public GamerCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void add(Customer customer) {
		if (this.customerCheckService.checkIfRealPerson(customer)) {
			super.add(customer);
		}
		else {
			System.out.println(" not a valid person ");
		}
	}
	
	@Override
	public void update(Customer customer) {
		if (this.customerCheckService.checkIfRealPerson(customer)) {
			super.update(customer);
		}
		else {
			System.out.println(" not a valid person");
		}
	}
	
	@Override
	public void delete(Customer customer) {
		if (this.customerCheckService.checkIfRealPerson(customer)) {
			super.delete(customer);
		}
		else {
			System.out.println(" not a valid person");
		}
	}

}
