package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import pages.RegisterPage;

public class CostumerManagerStep {
	private RegisterPage registerPage;
	ChromeDriver driver = new ChromeDriver();

	public void AutomacaoWebStep() {
		this.registerPage = new RegisterPage(driver);
	}

	@Dado("^que eu acesse o site \"([^\"]*)\"$")
	public void que_eu_acesse_o_site(String site) throws Throwable {
		new RegisterPage(driver).setQueAcessoSite(site);
	}

	@E("^clico User$")
	public void clico_User() throws Throwable {
		new RegisterPage(driver).clicarUser();
	}

	@E("^clico em Criar Nova Conta$")
	public void clico_em_Criar_Nova_Conta() throws Throwable {
		new RegisterPage(driver).createNewAccount();
	}

	@Dado("^digito \"([^\"]*)\"$")
	public void digito(String username) throws Throwable {
		new RegisterPage(driver).criarUsername(username);
	}

	@Dado("^digito email$")
	public void digito_email(String email) throws Throwable {
		new RegisterPage(driver).digitarEmail(email);
	}

	@Dado("^digito senha$")
	public void digito_senha(String senha) throws Throwable {
		new RegisterPage(driver).digitarSenha(senha);
	}

	@Dado("^confirmo \"([^\"]*)\"$")
	public void confirmo(String confirSenha) throws Throwable {
		new RegisterPage(driver).confirmarSenha(confirSenha);
	}

	@Dado("^digito primeiro Nome \"([^\"]*)\"$")
	public void digito_primeiro_nome(String primeiroNome) throws Throwable {
		new RegisterPage(driver).digitarPrimeiroNome(primeiroNome);
	}

	@Dado("^digito ultimo Nome \"([^\"]*)\"$")
	public void digito_ultimo_nome(String ultimoNome) throws Throwable {
		new RegisterPage(driver).digitarUltimoNome(ultimoNome);
	}

	@Dado("^digito celular \"([^\"]*)\"$")
	public void digito_celular(String celular) throws Throwable {
		new RegisterPage(driver).digitarCelular(celular);
	}

	@Dado("^seleciono o \"([^\"]*)\"$")
	public void seleciono_um(String pais) throws Throwable {
		new RegisterPage(driver).selecionarUmPais(pais);
	}

	@Dado("^digito cidade \"([^\"]*)\"$")
	public void digito_cidade(String cidade) throws Throwable {
		new RegisterPage(driver).digitarCidade(cidade);
	}

	@Dado("^digito endereco \"([^\"]*)\"$")
	public void digito_endereco(String endereco) throws Throwable {
		new RegisterPage(driver).digitarCidade(endereco);
	}

	@Dado("^digito regiao \"([^\"]*)\"$")
	public void digito_regiao(String regiao) throws Throwable {
		new RegisterPage(driver).digitarRegiao(regiao);
	}

	@Dado("^digito cep \"([^\"]*)\"$")
	public void digito_cep(String cep) throws Throwable {
		new RegisterPage(driver).digitarCEP(cep);
	}

	@Dado("^clicarNoCheckBoxEuConcordo \"([^\"]*)\"$")
	public void clicar_no_check_box_eu_concordo() {
		new RegisterPage(driver).clicarNoCheckBoxEuConcordo();
	}

	@Entao("^clico no check box eu concordo$")
	public void clico_no_check_box_eu_concordo() throws Throwable {
		new RegisterPage(driver).clicarNoCheckBoxEuConcordo();
	}

	@Dado("^clico em User para Login$")
	public void clico_em_User_para_Login() throws Throwable {
		new RegisterPage(driver).clicoUserParaLogin();
	}

	@Dado("^digito o login \"([^\"]*)\"$")
	public void digito_o_login(String username) throws Throwable {
		new RegisterPage(driver).digitologin(username);
	}

	@Dado("^digito a senha \"([^\"]*)\"$")
	public void digito_a_senha(String password) throws Throwable {
		new RegisterPage(driver).digitoaSenha(password);
	}

	@Dado("^clico sign in$")
	public void clico_sign_in() throws Throwable {
		new RegisterPage(driver).clicoSignIn();
	}

	@Dado("^clico continue shopping$")
	public void clico_continue_shopping() throws Throwable {
		new RegisterPage(driver).clicoContinueShopping();
	}

	@Dado("^clico em Mice$")
	public void clico_em_Mice() throws Throwable {
	
	}

	@After
	public void bfechaBrowser() throws InterruptedException {
		driver.quit();
	}
}