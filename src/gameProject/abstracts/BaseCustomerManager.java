package gameProject.abstracts;

import gameProject.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void add(Customer customer) {
		
		System.out.println(customer.getFirstName()+ " " +customer.getLastName() + " kaydiniz basarili bir sekilde tamamlanmistir.");
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName()+" " + customer.getLastName() + " kaydiniz basarili bir sekilde guncellenmistir.");
		
	}

	@Override
	public void delete(Customer customer) {
	
		System.out.println(customer.getFirstName()+ " " +customer.getLastName() + " kaydiniz basarili bir sekilde silinmistir.");
	}



}
