package com.lewis.webscraper;

import java.text.NumberFormat;
import java.text.ParseException;

public class PlayerFactory {
	
	public Player createPlayer(String url) {
		BrowserService service = new BrowserService(url);
		String name = service.getPlayerName();
		Number price = 0;
		try {
			price = NumberFormat.getNumberInstance(java.util.Locale.US).parse(service.getPlayerPrice());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String position = service.getPlayerPosition();
	    String league = service.getPlayerLeague();
		String type = service.getPlayerType();
		String lastUpdated = service.getLastUpdated();
		return new Player(name, price.intValue(), position, league, type, lastUpdated);
	}

}
