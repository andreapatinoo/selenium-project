package com.opensource.qa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Ejercicios {
	/*Ejercicio#1
		Utilizar como referencia el código de la clase "FirstTest" y validar con un hard assertion el nombre
		el tab de la pagina principal de Facebook.
	    Expected result: Facebook - Inicia sesión o regístrate*/
	
	public static WebDriver driver;

  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
  }

  @Test
  public void fbookTest() {
	  	
	  	System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
	    driver = new ChromeDriver(); // Polimorfismo
		
		driver.get("https://www.facebook.com/"); //https://es-la.facebook.com/
		driver.manage().window().maximize();// inner class manage,
		//System.out.println("Pasa Driver manage");
		//implicit wait
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,10);
		//System.out.println("Pasa wait");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'Password')]")));
		
		System.out.println("Esta en facebook login");
		
		// Validation - Hard Assertion
		Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");
		System.out.println("Si era Facebook Login");

	  
  }
  @Test
  public void fbookTest2() {
	  /*Ejercicio#2

		Validar la URL de la pagina de Facebook utilizando el metodo wrapper correspondiente del objeto driver.
		Expected result: https://es-la.facebook.com/*/
	  	System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
	    driver = new ChromeDriver();
		
		driver.get("https://es-la.facebook.com/"); //https://es-la.facebook.com/
		//driver.manage().window().maximize();
		//System.out.println("Pasa Driver manage");
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'Contraseña')]")));
		
	//	System.out.println("Esta en facebook login");
		
		
		// Validation - Hard Assertion
		Assert.assertEquals(driver.getCurrentUrl(),"https://es-la.facebook.com/");
		//Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");
		System.out.println("Si era Facebook ES");
  }
	  
  
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
