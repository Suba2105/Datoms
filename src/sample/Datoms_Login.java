package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datoms_Login {
	  public static WebDriver driver;
	  
	  public static void main(String[] args){
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suba\\eclipse-workspace\\sample\\src\\sample\\chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.get("https://accounts.datoms.io/login");
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.id("email")).sendKeys("subametha21@gmail.com");
		  driver.findElement(By.id("password")).sendKeys("Suba@21");
		  driver.findElement(By.id("form_submit_btn")).click();

}
}
