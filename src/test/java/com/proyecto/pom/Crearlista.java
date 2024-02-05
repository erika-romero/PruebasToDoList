package com.proyecto.pom;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Crearlista extends Base{
	
	By nuevaLista = By.xpath("//input[@value='Add a new list']");
	By inputNueva = By.id("id_title");
	By enviarForm = By.xpath("//input[@value='Save']");
	By paginaActual = By.xpath("//h3[text()='Add a new list']");

	public Crearlista(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void NuevaLista() throws InterruptedException {
		Thread.sleep(2000);
		click(nuevaLista);
		Thread.sleep(2000);
		if(isDisplayed(paginaActual)){
			type("Nueva Lista",inputNueva);
			Thread.sleep(2000);
			click(enviarForm);
		}else {
			System.out.println("Pagina no encontrada");
		}
	}
		

}
