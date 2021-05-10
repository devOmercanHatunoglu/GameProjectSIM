package Concrete;

import Abstract.SaleManagerService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class SaleManager implements SaleManagerService {

	@Override
	public void saleGame(Player player, Game game) {
		
		System.out.println(player.getFirstName() +" "+ "�simli Oyuncu" +" "+ game.getGameName() +" "+ "Oyununu Sat�n Ald�."+ "Fiyat : " + game.getGamePrice());
		
	}
	
	public void campaignGamePrice(Campaign campaign, Game game) {
		
		System.out.println("Oyun : " + game.getGameName() + " " + "Kampanyal� Yeni Fiyat� : " +(game.getGamePrice() -(game.getGamePrice() * campaign.getDiscountRate() / 100)));
		
	}
	

}
