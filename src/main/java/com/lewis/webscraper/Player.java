package com.lewis.webscraper;

public class Player {
	
	private String name;
	private int price;
	private String position;
	private String league;
	private String type;
	private String lastUpdated;
	
	private int priceToBuyAt;
	private int priceToSellAt;
	
	public Player(String name, int price, String position, String league, String type, String lastUpdated) {
		this.name = name;
		this.price = price;
		this.position = position;
		this.league = league;
		this.type = type;
		this.lastUpdated = lastUpdated;
		this.priceToBuyAt = priceToBuyAt(price);
		this.priceToSellAt = priceToSellAt(price);		
	}
	
	private int priceToBuyAt(int price) {
		int priceToBuyAt = 0;
		
		if(price<1000) {
			return price - 500;
		}else if(price >= 1000 && price < 2500) {
			priceToBuyAt = price - 700;
		}else if(price >= 2500 && price < 5000) {
			priceToBuyAt = price - 1000;
		}else {
			priceToBuyAt = (price/100) * 80;
		}
		
		return priceToBuyAt;
	}
	
	private int priceToSellAt(int price) {
		int priceToSellAt = 0;
		
		if(price<10000) {
			return price - 100;
		}else if(price >= 10000 && price < 50000) {
			priceToSellAt = price - 250;
		}else if(price >= 50000 && price < 100000) {
			priceToSellAt = price - 500;
		}else {
			priceToSellAt = price - 1000;
		}
		
		return priceToSellAt;
	}
	
	/*
	 * ***************** GETTERS **********************
	 */

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getPosition() {
		return position;
	}

	public String getLeague() {
		return league;
	}

	public String getType() {
		return type;
	}

	public int getPriceToBuyAt() {
		return priceToBuyAt;
	}

	public int getPriceToSellAt() {
		return priceToSellAt;
	}

	public String getLastUpdated() {
		return lastUpdated;
	}

}