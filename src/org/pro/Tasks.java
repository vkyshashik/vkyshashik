package org.pro;

import java.util.LinkedHashMap;
import java.util.Map;

public class Tasks {
	public static void main(String[] args) {
		String s = "Welcome To Java";
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (m.containsKey(c)) {
				Integer y = m.get(c);
				m.put(c, y+1);
				//vky change
			}else {
				m.put(c, 1);
			}
			
		}
		System.out.println(m);
	}

}
