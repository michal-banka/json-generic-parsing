package com.app.service;

import org.springframework.stereotype.Service;

@Service
public class Printer {

	public static String format(String prefix, Object value, String suffix) {
		try {
			return prefix + ":\n" + value.toString() + "\t-\t" + suffix + "\n";
		} catch (NullPointerException e) {
			return e.toString();
		}
	}


}
