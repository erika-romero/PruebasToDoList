package com.proyecto.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Crearlista_Test {
	
	private WebDriver driver;
	Crearlista crearlista;
	

	@Before
	public void setUp() throws Exception {
		crearlista = new Crearlista(driver);
		driver = crearlista.chromeDriver();
		crearlista.visit("http://localhost:8000/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		crearlista.NuevaLista();
	}

}
