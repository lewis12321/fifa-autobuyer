package com.lewis.webscraper;

import java.util.ArrayList;

public class AppController {

	private ArrayList<Player> players = new PlayerService().getPlayers();
	
	public AppController() {
		PlayerService service = new PlayerService();
		service.createPlayerList();
		players = service.getPlayers();
	}

	public void printPlayers() {
				
		for (Player player : players) {
			System.out.println("Name: " + player.getName());
			System.out.println("Card Type: " + player.getType());
			System.out.println("League: " + player.getLeague());
			System.out.println("Position: " + player.getPosition());
			System.out.println("Lowest Buy Now Price: " + player.getPrice());
			System.out.println("Max Bid Price: " + player.getPriceToBuyAt());
			System.out.println("Minimum Sell Price: " + player.getPriceToSellAt());
			System.out.println(player.getLastUpdated());
			System.out.println("---------------");
		}
		
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}
	
}
