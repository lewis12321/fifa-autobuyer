package com.lewis.webscraper;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URLService {
	
	public static List<String> readUrls() {
		Scanner s = null;
		try {
			s = new Scanner(new File("/home/lewis12321/IdeaProjects/webscraper/src/main/java/resources/urls2.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNext()){
		    list.add(s.next());
		}
		s.close();
		return list;
	}

}
