package com.testrun;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadConfigFile {

	@Test
	public void getValue() throws Exception {
		// FileInputStream fis =new FileInputStream("./Environments/dev.properties");

		String ENV_CONFIG = System.getProperty("env.config");
		ENV_CONFIG = System.getProperty("env.config");
		System.out.println("Environment selected to run test = " + ENV_CONFIG);
		
		FileInputStream fis = new FileInputStream(ENV_CONFIG);
		Properties pro = new Properties();
		pro.load(fis);

		Object applicationURL = pro.get("APPLICATION_URL");
		System.out.println(applicationURL);
	}
}
