package Steps.keenggo.com;

import java.io.IOException;

import Elementos.keeggo.com.Elementos;
import Metodos.keeggo.com.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	Pages page = new Pages();
	Elementos elementos = new Elementos();

	@When("Preencher as informacoes de Cadastro")
	public void preencherCadastro() throws IOException, InterruptedException {
		page.pauser(5000, "pausa");
		page.clicar(elementos.getBtnUser(), "botão usuario");
		page.pauser(3000, "pausa");
		page.clicar(elementos.getBtnCreate(), "creat");
		page.pauser(8000, "pausa");
		page.escrever(elementos.getNomeusuario(), "Samuel", " nome");
		page.escrever(elementos.getCampoEmail(), "samuca_rds@yahoo.com.br", " Email");
		page.escrever(elementos.getSenha(), "Samuel1990", "senha");
		page.escrever(elementos.getConfirmarsenha(), "Samuel1990", "senha");
		page.escrever(elementos.getPrimeiroNome(), "samuel", "nome");
		page.escrever(elementos.getUltimoNome(), "Rodrigues", " nome");
		page.escrever(elementos.getTelefone(), "00000000000", "telefone");
		page.selecionarComboPosicao(elementos.getPais(), 160, "Pais");
		page.escrever(elementos.getCidade(), "São paulo", " Cidade");
		page.escrever(elementos.getEndereco(), "Paulista", " rua");
		page.escrever(elementos.getEstado(), "são paulo", " Estado");
		page.escrever(elementos.getCep(), "00000000", "Cep");
		page.clicar(elementos.getCheckBox(), "CHeckbox");
		
	}

	@Given("que estou no site {string}")
	public void abriSite(String site) throws IOException {
		page.executarNavegador(site, "CHROME", "NAVEGADOR");

	}

	@Then("Cadastro sera efetivado")
	public void cadastroEfetivado() throws IOException, InterruptedException {
		page.pauser(5000, "Pausa");
		page.clicar(elementos.getBtnRegistrar(), "Registrar");		
	}

	@When("Preencher informacoes de Login")
	public void fazerLogin() throws IOException, InterruptedException {
		page.pauser(6000, "Pausa");
		page.clicar(elementos.getHome(), "voltar pagina inicial");
		page.pauser(3000, "Pausa");
		page.clicar(elementos.getBtnUser(), " ");
		page.escrever(elementos.getUsuario(), "Samuel", "nome do usuario");
		page.pauser(3000, "Pausa");
		page.escrever(elementos.getSenhaLogin(), "Samuel1990", "Senha");
		page.clicar(elementos.getCheckboxLembrarnovamente(), "checkbox");
		page.pauser(3000, "Pausa");
		page.clicar(elementos.getBtnlogar(), "login");
	}

	@Then("Login sera concluido com sucesso")
	public void validarLogin() throws IOException, InterruptedException {
		page.pauser(2000, "Pausa");
		page.validarTexto(elementos.getValidarNome(), "Samuel", "validando nome do usuario");
		String Evidencia = "Login";
		page.screnShoot("./Evidencia/" + Evidencia + ".png");
		page.fecharBrowser("navegador");
	}
}
