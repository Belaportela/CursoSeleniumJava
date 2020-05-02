package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import suporte.Web;

public class InformacoesUsuarioPageObjectsTest {
	private WebDriver navegador;
	
@Before public void setUp() {
		navegador = Web.createChrome();
	
}
	
@Test
public void testAdicionarUmaInformacaoAdicionalDoUsuario() {
	   String textToast = new LoginPage(navegador)
		.clickSignIn()
		.DigitarLogin("julio0001")
		.DigitarPassword("123456")
		.clicarSignIn()
		.clicarMe()
		.ClicarAbaMoreDataAboutYou()
		.ClicarBotaoAddMoreDataAboutYou()
		.adicionarContato("Phone", "+551199998888")
		.capturarTextoToast();
	   
	assertEquals("Your contact has been added!", textToast);  
	 
		
}
	
	
@After public void tearDown() {
	   navegador.quit();
		
	}
										
}
