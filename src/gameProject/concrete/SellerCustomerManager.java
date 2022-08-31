 package gameProject.concrete;

import gameProject.abstracts.BaseSellerManager;
import gameProject.adapters.SellerServiceAdapters;
import gameProject.entities.Customer;
import gameProject.entities.Games;

public class SellerCustomerManager extends BaseSellerManager {
	
	SellerServiceAdapters sellerServiceAdapters;

	public SellerCustomerManager(SellerServiceAdapters sellerServiceAdapters) {
		this.sellerServiceAdapters = sellerServiceAdapters;
	}
	
	@Override
	public void sell(Games games, Customer customer) {
		games.setPrice((int)this.sellerServiceAdapters.discountedPrice(games));
		super.sell(games, customer);
	}
	
	

}
