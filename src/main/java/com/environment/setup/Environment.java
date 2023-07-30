package com.environment.setup;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Environment {
	
	static Properties pro = new Properties();
	static String ENV_CONFIG;
	public  Map<String,String> config = new HashMap<>();
	static {
	 ENV_CONFIG = System.getProperty("env.config");
	System.out.println("Environment selected to run test = "+ENV_CONFIG );
	
	}

	public Environment() {
		try {
			pro.load(getClass().getClassLoader().getResourceAsStream(ENV_CONFIG));
			pro.forEach((k,v)->config.put(k.toString(), v.toString()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
