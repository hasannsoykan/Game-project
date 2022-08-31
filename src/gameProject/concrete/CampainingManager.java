package gameProject.concrete;

import gameProject.abstracts.BaseCampaignManager;
import gameProject.adapters.SellerServiceAdapters;
import gameProject.entities.Customer;
import gameProject.entities.Games;

public class CampainingManager extends BaseCampaignManager{
	
	SellerServiceAdapters sellerServiceAdapters;

	public CampainingManager(SellerServiceAdapters sellerServiceAdapters) {
		this.sellerServiceAdapters = sellerServiceAdapters;
	}
	
	@Override
	public void campaignAdd(Games games, Customer customer) {
		super.campaignAdd(games, customer);
	}
	
	@Override
	public void campaignUpdate(Games games, Customer customer) {
		games.setPrice((int)this.sellerServiceAdapters.discountedPrice(games));
		super.campaignUpdate(games, customer);
	}
	
	@Override
	public void campaignDelete(Games games, Customer customer) {
		super.campaignDelete(games, customer);
	}
	
}
