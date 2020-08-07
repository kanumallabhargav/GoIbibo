package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Cities 
{
	Properties prop = new Properties();
	public String getFromCity() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\config\\browserConfig.properties");
		prop.load(fis);
		String fromCity = prop.getProperty("from");
		return fromCity;
	}
	public String getToCity() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\config\\browserConfig.properties");
		prop.load(fis);
		String toCity = prop.getProperty("to");
		return toCity;
	}
}
