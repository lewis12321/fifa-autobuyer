package com.lewis.webscraper;

import java.util.ArrayList;

public class PlayerService {
	
	private ArrayList<String> urls = (ArrayList<String>) URLService.readUrls();
	private ArrayList<Player> players = new ArrayList<Player>();
	CSVWriter writer = new CSVWriter();

		
	public void createPlayerList() {
		PlayerFactory playerFactory = new PlayerFactory();
		for (String url : urls) {
			if(url == null) {
				continue;
			}
			players.add(playerFactory.createPlayer(url));
			writer.writeToFile(getPlayers());
		}
	}
	
	//************ GETTERS **************

	public ArrayList<Player> getPlayers() {
		return players;
	}

}
