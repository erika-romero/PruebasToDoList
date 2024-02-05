package com.proyecto.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Additem extends Base {
	
	By nuevoItem = By.xpath("//input[@value='Add a new item']");
	By tituloItem= By.xpath("//input[@name='title']");
	By descItem= By.xpath("//textarea[@name='description']");
	By enviarForm = By.xpath("//input[@value='Submit']");
	By paginaActual = By.xpath("//h3[text()='Edit list:']");
	By completada = By.xpath("//form/button[@type='submit']");
	public Additem(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public void NuevoItem() throws InterruptedException {
		List<WebElement> listItems = findElements(By.xpath("//ul/li"));
		if (!listItems.isEmpty()) {
	        WebElement firstList = listItems.get(0);
	        Thread.sleep(2000);
	        firstList.click();
	        Thread.sleep(2000);
	        click(nuevoItem);
	        Thread.sleep(2000);
			type("Nuevo Item",tituloItem);
			Thread.sleep(2000);
			type("Creando un nuevo Item en mi lista",descItem);
			Thread.sleep(2000);
			click(enviarForm);
			Thread.sleep(2000);
			click(completada);
			Thread.sleep(2000);
		}
	}
	
}
