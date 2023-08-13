package com.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader 
{
	public void init_prop() throws IOException
	{
		Properties prop = new Properties();
		File f = new File(System.getProperty("user.dir") + "\\Configuration\\Config.properties");
		FileInputStream fis = new FileInputStream(f);
		prop.load(fis);
	}
}
