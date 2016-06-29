package teste.pagina.devmedia;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestarLoginQuickLoja {
	private static WebDriver driver;

	@Before
	public void setUp() throws Exception {
		/**
		 * Abrir o navegador e acessar a pagina do quick loja
		 */
		driver = new FirefoxDriver();
		driver.get("http://quickloja.qualister.info/");
	}

	@After
	public void tearDown() throws Exception {
		// fechar aplicação
		driver.close();
	}

	@Test
	public void testLoginIncorreto() {
		// preenche os campos Login e senha
		WebElement element = driver.findElement(By.id("usuariologin"));
		element.sendKeys("karla");
		element = driver.findElement(By.id("usuariosenha"));
		element.sendKeys("1234");
		
		
		
		// verifica se a mensagem é exibida
		
		 element = driver.findElement(By.xpath(".alert.alert-error"));
		 equals(element.getText().contains("Usuário ou senha incorretos"));
		
	}

}
