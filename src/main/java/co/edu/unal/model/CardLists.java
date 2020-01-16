package co.edu.unal.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class CardLists {
	public static ArrayList<Integer> commons;
	public static ArrayList<Integer> rares;
	
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    // only got here if we didn't return false
	    return true;
	}
	
	public static void initCardArrays() {
		Class<CardLists> classLoader = CardLists.class;
//		File tmpDir = new File(classLoader.getResource("./cardLists/defaultCommons.txt"));
//		boolean exists = tmpDir.exists();
//		if(exists)
//			System.out.println("EXISTS!!!!!!");
		commons = new ArrayList<Integer>();
		rares = new ArrayList<Integer>();
		BufferedReader reader;
		//defaultcommons
		try {
			InputStream i = classLoader.getResourceAsStream("defaultCommons.txt");
			reader = new BufferedReader(new InputStreamReader(i));
			String line = reader.readLine();
			while (line != null) {
				if(isInteger(line))
					commons.add(Integer.parseInt(line));
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Read def succ");
		//commons1
		try {
			InputStream i = classLoader.getResourceAsStream("commons 1.ydk");
			reader = new BufferedReader(new InputStreamReader(i));
			String line = reader.readLine();
			while (line != null) {
				if(isInteger(line))
					commons.add(Integer.parseInt(line));
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//commons2
		try {
			InputStream i = classLoader.getResourceAsStream("commons 2.ydk");
			reader = new BufferedReader(new InputStreamReader(i));
			String line = reader.readLine();
			while (line != null) {
				if(isInteger(line))
					commons.add(Integer.parseInt(line));
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//defaultrares
		try {
			InputStream i = classLoader.getResourceAsStream("defaultRares.txt");
			reader = new BufferedReader(new InputStreamReader(i));
			String line = reader.readLine();
			while (line != null) {
				if(isInteger(line))
					rares.add(Integer.parseInt(line));
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//rares1
		try {
			InputStream i = classLoader.getResourceAsStream("rares 1.ydk");
			reader = new BufferedReader(new InputStreamReader(i));
			String line = reader.readLine();
			while (line != null) {
				if(isInteger(line))
					rares.add(Integer.parseInt(line));
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//rares2
		try {
			InputStream i = classLoader.getResourceAsStream("rares 2.ydk");
			reader = new BufferedReader(new InputStreamReader(i));
			String line = reader.readLine();
			while (line != null) {
				if(isInteger(line))
					rares.add(Integer.parseInt(line));
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//removed
		try {
			InputStream i = classLoader.getResourceAsStream("removed.ydk");
			reader = new BufferedReader(new InputStreamReader(i));
			String line = reader.readLine();
			while (line != null) {
				if(isInteger(line)) {
					if(rares.indexOf(Integer.parseInt(line)) != -1)
						rares.remove(rares.indexOf(Integer.parseInt(line)));
					if(commons.indexOf(Integer.parseInt(line)) != -1)
						commons.remove(commons.indexOf(Integer.parseInt(line)));
				}
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
