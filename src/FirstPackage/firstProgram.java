 package FirstPackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class firstProgram {
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) throws InterruptedException {
		
		
		/*System.setProperty("webdriver.gecko.driver","C:\\Data_other\\Selenium Jars\\geckodriver-v0.19.0-win64\\geckodriver.exe" );  
		
		 WebDriver driver= new FirefoxDriver(); 
		 
		 driver.manage().window().maximize();
		 
		 String homepage="https://www.amazon.in/";
		 
		 driver.get(homepage);
		 
		 Thread.sleep(3000);*/
		 int a=2;
		 int b=3;
		
		 add(a,b);
		


            System.out.println("updating in local 1");
            
            System.out.println("Updating in local2");
		


	System.out.println("Updating at Master 1");
		System.out.println("Updating at Master 2");

		 
		 		 }

	}


