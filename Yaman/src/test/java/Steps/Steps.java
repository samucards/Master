package Steps;

import java.io.IOException;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	Metodos m = new Metodos();
	Elementos e = new Elementos();
	
	
	@Given("que acesse o site {string}")
	public void que_acesse_o_site(String site) throws IOException {
	   m.executarNavegador(site, "CHROME", "ABRINDO NAVEGADOR");
	}

	@When("Realizo um busca")
	public void realizo_um_busca() throws IOException, InterruptedException {
	    m.pauser(15000, "Pausa");
		m.popup();
		m.escrever(e.getCampoBusca(), "botas feminino", "preenchendo campo de busca");
	m.btnEnter(e.getCampoBusca(), "Enter");
	}

	@When("incluir o produto no carrinho")
	public void incluir_o_produto_no_carrinho() throws IOException, InterruptedException {
	    m.pauser(3000,"Pauda para carregar a tela");
	    m.clicar(e.getBotaCuturno(), "selecionando produto");
	    m.clicar(e.getTamanho(), "selecionando o tamanho");
	    m.pauser(3000, "pausa");
	    m.clicar(e.getBtnComprar(), "clicando no botão comprar");
	    
	}

	@Then("Validar os Produtos includos no carrinho em tela de pagemento")
	public void validar_os_produtos_includos_no_carrinho_em_tela_de_pagemento() throws IOException {
	 
	 m.validarTexto(e.getValor(), "269,90", "validando valor");
		m.fecharBrowser("fechando navegador");
		
		
	}
}
