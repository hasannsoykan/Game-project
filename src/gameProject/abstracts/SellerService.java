package gameProject.abstracts;

import gameProject.entities.Customer;
import gameProject.entities.Games;

public interface SellerService {

	void sell(Games games, Customer customer);

}
