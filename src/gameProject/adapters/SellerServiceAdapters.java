package gameProject.adapters;

import gameProject.abstracts.SellerDiscountService;
import gameProject.entities.Games;

public class SellerServiceAdapters implements SellerDiscountService{
	@Override
	public double discountedPrice(Games games) {
		return games.getPrice() - (games.getPrice() * games.getDiscount() / 100);
	}

}
