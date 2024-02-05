package com.proyecto.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class DeleteItem_Test {
	private WebDriver driver;
	DeleteItem deleteItem;
	@Before
	public void setUp() throws Exception {
		deleteItem = new DeleteItem(driver);
		driver = deleteItem.chromeDriver();
		deleteItem.visit("http://localhost:8000/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		deleteItem.borrarItem();
	}

}
