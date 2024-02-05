package com.proyecto.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Additem_Test {
	private WebDriver driver;
	Additem additem;

	@Before
	public void setUp() throws Exception {
		additem = new Additem(driver);
		driver = additem.chromeDriver();
		additem.visit("http://localhost:8000/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.navigate().refresh();
		additem.NuevoItem();
	}

}
