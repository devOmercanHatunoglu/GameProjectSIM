package Concrete;

import Abstract.PlayerCheckService;
import Entities.Player;

public class PlayerService implements PlayerCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {
		
		System.out.println("Oyuncu Bilgileri Doðrulandý.");
		
		return true;
		
	}

}
