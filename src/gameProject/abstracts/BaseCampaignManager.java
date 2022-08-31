package gameProject.abstracts;

import gameProject.entities.Customer;
import gameProject.entities.Games;

public abstract class BaseCampaignManager implements CampaignService{

	@Override
	public void campaignAdd(Games games, Customer customer) {
		System.out.println(games.getGameName() + " oyunu " + customer.getFirstName() + " tarafindan % "
				+ games.getDiscount() + " indirime girdi." );
		
	}

	@Override
	public void campaignUpdate(Games games, Customer customer) {
		System.out.println(games.getGameName() + " oyunun yeni fiyati " + games.getPrice());
		
	}

	@Override
	public void campaignDelete(Games games, Customer customer) {
		System.out.println(games.getGameName() + " oyunun indirimine " + customer.getFirstName() 
				+ " kisisi tarafindan son verildi.");
	
		
	}

	

}
