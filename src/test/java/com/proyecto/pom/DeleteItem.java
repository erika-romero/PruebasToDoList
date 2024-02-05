package com.proyecto.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteItem extends Base {
	
	By borrarItem = By.xpath("//input[@value='Delete this item']");
	By confirmarItem= By.id("deleteButton");
	By borrarList= By.xpath("//input[@value='Delete this list']");
	By paginaActual = By.xpath("//h3[text()='Edit list:']");
	By confirmarList= By.xpath("//input[@value='Yes, delete.']");
	
	public DeleteItem(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void borrarItem() throws InterruptedException {
		List<WebElement> listList = findElements(By.xpath("//ul/li"));
		if (!listList.isEmpty()) {
	        WebElement firstList = listList.get(0);
	        Thread.sleep(2000);
	        firstList.click();
	        Thread.sleep(2000);
	        List<WebElement> listItems = findElements(By.xpath("//ul/li/div/div"));
	        if (!listItems.isEmpty()) {
	        WebElement firtsItem = listItems.get(0);
	        Thread.sleep(2000);
	        firtsItem.click();
	        Thread.sleep(2000);
	        click(borrarItem);
	        Thread.sleep(2000);
	        click(confirmarItem);
	        Thread.sleep(2000);
	        click(borrarList);
	        Thread.sleep(2000);
	        click(confirmarList);
	        

		}
	}
	}
}
	

