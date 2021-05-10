package Concrete;

import Abstract.SaleManagerService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class SaleManager implements SaleManagerService {

	@Override
	public void saleGame(Player player, Game game) {
		
		System.out.println(player.getFirstName() +" "+ "Ýsimli Oyuncu" +" "+ game.getGameName() +" "+ "Oyununu Satýn Aldý."+ "Fiyat : " + game.getGamePrice());
		
	}
	
	public void campaignGamePrice(Campaign campaign, Game game) {
		
		System.out.println("Oyun : " + game.getGameName() + " " + "Kampanyalý Yeni Fiyatý : " +(game.getGamePrice() -(game.getGamePrice() * campaign.getDiscountRate() / 100)));
		
	}
	

}
