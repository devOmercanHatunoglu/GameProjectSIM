package Concrete;

import Abstract.BasePlayerManager;
import Entities.Player;

public class PlayerManager implements BasePlayerManager {

	@Override
	public void addPlayer(Player player) {
		
		System.out.println("Oyuncu Kay�t Edildi." + player.getFirstName());
	}

	@Override
	public void deletePlayer(Player player) {
		
		System.out.println("Oyuncu Silindi." + player.getFirstName() +" "+ player.getNationalId());
	}

	@Override
	public void updatePlayer(Player player) {
		
		System.out.println("Oyuncu G�ncellendi." + player.getFirstName() +" "+ player.getLastName());
	}

}
