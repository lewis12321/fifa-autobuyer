package com.lewis.webscraper;


/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		Long startTime = System.currentTimeMillis();
		AppController controller = new AppController();
		controller.printPlayers();
		Long endTime = System.currentTimeMillis();
		double finalTime = (endTime - startTime)/1000;
		System.out.println(finalTime + " Seconds");
		
		new CSVWriter().writeToFile(controller.getPlayers());
		
	}
}
