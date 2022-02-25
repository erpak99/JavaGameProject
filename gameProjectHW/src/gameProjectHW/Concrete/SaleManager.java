package gameProjectHW.Concrete;

import gameProjectHW.Abstract.ISaleService;
import gameProjectHW.Entities.Campaign;
import gameProjectHW.Entities.Game;
import gameProjectHW.Entities.Player;

public class SaleManager implements ISaleService {

	@Override
	public void sale(Player player, Game game, Campaign campaign) {
		double price = game.getGamePrice() - (game.getGamePrice() * campaign.getDiscountAmount() / 100 ); 
		System.out.println("Player " + player.getFirstName() + " bought the game " 
		+ game.getGameName() + " wtih the price of " + price);	
	}
	
}
