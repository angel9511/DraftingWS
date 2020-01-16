package co.edu.unal.controller;

import co.edu.unal.exception.ResourceNotFoundException;
import co.edu.unal.model.CardLists;

import org.apache.tomcat.jni.Time;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api")
public class MainController {


	// Get all tokens
	@GetMapping("/getDeck")
	public String getAllTokens() {
		StringBuilder deck = new StringBuilder();
		deck.append("<PLAINTEXT>");
		deck.append("#created by ...\n");
		deck.append("#main\n");
		for(int x = 0; x < 48; x++) {
			int index = new Random().nextInt(CardLists.commons.size());
			deck.append(CardLists.commons.get(index) + "\n");
		}
		deck.append("59197169\n");
		deck.append("#extra\n");
		deck.append("!side\n");
		for(int x = 0; x < 12; x++) {
			int index = new Random().nextInt(CardLists.rares.size());
			deck.append(CardLists.rares.get(index) + "\n");
		}
	    return deck.toString();
	}
		
		
	
	private String generateTokenString() {
		String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i <20; i++) {
			int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}
	


	
}
