package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By campoBusca = By.xpath("//input[@id='search-input'][@type='text'][@name='q']");
	private By botasFeminino = By.xpath("//*[@id=\"header-content\"]/header/div/div/section[2]/section/section/div/ul/li[1]/a/span/strong");
	private By botaCuturno = By.xpath("//*[@id=\"item-list\"]/div[1]/div[2]/div[1]/a/img");
	private By tamanho = By.xpath("//*[@id=\"buy-box\"]/section[2]/div/ul/li[4]/a");
	private By btnComprar = By.xpath("//*[@id=\"buy-button-now\"]");
	private By btnContinuar = By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div[1]/div/a[1]");
	private By valor = By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[2]/div/div[3]/div[2]/div/div/p");
	
	
	
	
	public By getCampoBusca() {
		return campoBusca;
	}
	public By getBotasFeminino() {
		return botasFeminino;
	}
	public By getBotaCuturno() {
		return botaCuturno;
	}
	public By getTamanho() {
		return tamanho;
	}
	public By getBtnComprar() {
		return btnComprar;
	}
	public By getBtnContinuar() {
		return btnContinuar;
	}
	public By getValor() {
		return valor;
	}
	
	
	
	
	
	
}
