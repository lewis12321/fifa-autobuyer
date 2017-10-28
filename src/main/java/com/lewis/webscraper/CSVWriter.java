package com.lewis.webscraper;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class CSVWriter {

	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	String contents = "Name,League,Position,Card Type,Lowest Buy Now Price,Max Bid Price,Minimum Sell Price,Last Updated" + timeStamp;


	public void writeToFile(ArrayList<Player> players) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(
				"/home/lewis12321/IdeaProjects/webscraper/src/main/java/resources/datatable3.csv"))) {

			bw.write(contents);
			bw.newLine();
			for (Player player : players) {
				bw.write(player.getName() + "," + player.getLeague() + "," + player.getPosition() + ","
						+ player.getType() + "," + player.getPrice() + "," + player.getPriceToBuyAt() + ","
						+ player.getPriceToSellAt() + "," + player.getLastUpdated());
				bw.newLine();
			}

		} catch (IOException e) {

			e.printStackTrace();

		}
	}

}
