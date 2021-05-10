package GameSim;

import java.time.LocalDate;

import Concrete.*;
import Entities.*;

public class Main {
	public static void main(String[] args) {
        
		Game game = new Game(1,"Oyun1",1500);
		SaleManager saleManager = new SaleManager();
		Campaign campaign = new Campaign(1,"A Kampanyasý",10);
		Player player = new Player(1,"1234","Ömercan","Hatunoðlu",LocalDate.of(1998,11,18));
		PlayerService playerService = new PlayerService();
		
		
		playerService.checkIfRealPerson(player);
		saleManager.campaignGamePrice(campaign, game);
		System.out.println(player.getFirstName());
		
		
		
		
		
		
		
		
		
    }
		
		
		
		
		

}
