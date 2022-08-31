package gameProject.abstracts;

import gameProject.entities.Customer;
import gameProject.entities.Games;

public abstract class BaseSellerManager implements SellerService{

	@Override
	public void sell(Games games, Customer customer) {
		System.out.println(games.getGameName() + " oyunu " + customer.getFirstName() + " kisisine " 
				+ games.getPrice() + " TL'ye satildi.");
		
	}

	
}
