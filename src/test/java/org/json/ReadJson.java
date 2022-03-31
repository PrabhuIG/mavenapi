package org.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJson {
	public static void main(String[] args) throws IOException, ParseException {
		jsonRead();
	}
	public static void jsonRead() throws IOException, ParseException {
		
		//File path
		FileReader path=new FileReader("C:\\Users\\Monster\\eclipse-workspace\\MavenAPI\\src\\test\\resources\\JSON\\sample.json");
		
		//Create jsonparser
		JSONParser j = new JSONParser();
		
		//Parse the json
		Object obj = j.parse(path);
		
		JSONObject jo=(JSONObject)obj;
		Object user = jo.get("username");
		System.out.println(user);
		String us = user.toString();
		System.out.println(us);
		
		System.out.println(jo.get("password").toString());
		System.out.println(jo.get("browserName").toString());
		System.out.println(jo.get("version").toString());
		System.out.println(jo.get("OS").toString());


	}

}
