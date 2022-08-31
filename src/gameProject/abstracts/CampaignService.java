package gameProject.abstracts;

import gameProject.entities.Customer;
import gameProject.entities.Games;

public interface CampaignService {
	void campaignAdd(Games games, Customer customer);
	void campaignUpdate(Games games, Customer customer);
	void campaignDelete(Games games, Customer customer);

}
