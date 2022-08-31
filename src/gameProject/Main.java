package gameProject;

import java.time.LocalDate;

import gameProject.abstracts.BaseCampaignManager;
import gameProject.abstracts.BaseCustomerManager;
import gameProject.abstracts.BaseSellerManager;
import gameProject.adapters.EDevletServiceAdapter;
import gameProject.adapters.SellerServiceAdapters;
import gameProject.concrete.CampainingManager;
import gameProject.concrete.GamerCustomerManager;
import gameProject.concrete.SellerCustomerManager;
import gameProject.entities.Gamer;
import gameProject.entities.Games;
import gameProject.entities.Seller;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager = new GamerCustomerManager(new EDevletServiceAdapter());
		BaseCampaignManager baseCampaignManager = new CampainingManager(new SellerServiceAdapters());
		BaseSellerManager baseSellerManager = new SellerCustomerManager(new SellerServiceAdapters());
		Gamer gamer = new Gamer("1" , "sa@gmail.com", "Hasan" , "Soykan", LocalDate.of(1995, 3, 22),
				"12345654321", "hasanmail");
		Seller seller = new Seller("2" , "as@gmail.com", "Engin" , "Demirog", LocalDate.of(1989, 1, 15),
				"56789098765", "enginmail");
		Games game1 = new Games("Cs" , 1000, 15);
		Games game2 = new Games("Pubg" , 1500, 30);
		
		baseCustomerManager.add(gamer);
		baseCustomerManager.delete(gamer);
		baseCustomerManager.update(gamer);
		baseSellerManager.sell(game1, gamer);
		baseSellerManager.sell(game2, gamer);
		baseCampaignManager.campaignAdd(game1, seller);
		baseCampaignManager.campaignUpdate(game1, seller);
		baseCampaignManager.campaignDelete(game1, seller);
		
		
		
		
	}

}
