package seltest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class GlobalVal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("E:\\Selenium_Java\\Teja\\Test_Selenium\\src\\seltest\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser", "googlechrome");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos = new FileOutputStream("E:\\Selenium_Java\\Teja\\Test_Selenium\\src\\seltest\\data.properties");
		prop.store(fos, null);
		
		

	}

}
