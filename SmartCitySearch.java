package com.SmartCitySearch.properties;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;  
import org.hibernate.service.ServiceRegistry;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
	
public class SmartCitySearch {
	
		String country, region, city;
		double locationID, postalCode, latitude, longitude, meteroCode, areaCode;
		
	
			public static void main(String[] args)  
			{
				try{
					  // Open the file that is the first 
					  // command line parameter
					  FileInputStream fstream = new FileInputStream("file.csv");
					  // Get the object of DataInputStream
					  DataInputStream in = new DataInputStream(fstream);
					  BufferedReader br = new BufferedReader(new InputStreamReader(in));
					  String strLine;
					  //Read File Line By Line
					  while ((strLine = br.readLine()) != null)   {
					  // Print the content on the console
					  System.out.println (strLine);
					  }
					  //Close the input stream
					  in.close();
					    }catch (Exception e){//Catch exception if any
					  System.err.println("Error: " + e.getMessage());
					  }
				
			}
				
			
}
			
		
	
	
	

