package com.Hocam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class FalinizaBakalim {

	
	public static void main(String[] args) throws IOException {
		
		URL url = new URL("http://mahmure.hurriyet.com.tr/astroloji/burclar/boga");
		
		URLConnection con = url.openConnection();
		InputStream is = con.getInputStream();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		String line = "";
		
		while((line = br.readLine())!=null) {
			if(line.contains("<div class=\"burcDetail mBot30px\">")) {
				System.out.println(line.split("<p>")[1].replace("Ä±", "ý"));				
			}
			
		}
		
		
	}
}
