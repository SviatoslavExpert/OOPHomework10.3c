package com.gmail.s.granovskiy;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<String, String> hm = new HashMap<>();
		// filling the Map with keys and values
		hm.put("I", "Ya");
		hm.put("office", "ofis");
		hm.put("every", "kozhen");
		hm.put("go", "ity");
		hm.put("day", "den");
		hm.put("home", "dim");
		hm.put("to", "v");
		hm.put("return", "povertatysia");
		hm.put("my", "miy");
		hm.put(".", ".");
		hm.put("Then", "Potim");
		
		Translation object = new Translation();
		
		object.translateTheText(hm, object.splitText());
		
		object.countRepeatingWords(object.splitText());
		
	}
}
