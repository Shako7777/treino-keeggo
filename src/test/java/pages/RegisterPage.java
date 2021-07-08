package pages;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class RegisterPage extends BasePage {
	private Wait<WebDriver> wait;

	public RegisterPage(WebDriver driver) {

		super(driver);
		// TODO Auto-generated constructor stub
		this.wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(2000)).ignoring(NoSuchElementException.class);
	}

	public void setQueAcessoSite(String site) {
		driver.get(site);
		driver.manage().window().maximize();
	}

	public void clicarUser()  {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='hrefUserIcon']")));
		driver.findElement(By.xpath("//a[@id='hrefUserIcon']")).click();
	}

	public void createNewAccount() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='create-new-account ng-scope']")));
		driver.findElement(By.xpath(".//*[@class='create-new-account ng-scope']")).click();
	}

	public void criarUsername(String username) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='menuUser']")));
		driver.findElement(By.xpath("//*[@id='menuUser']")).click();
	
    }

	public void digitarEmail(String email) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("emailRegisterPage")));
		driver.findElement(By.name("emailRegisterPage")).sendKeys(email);
	}

	public void digitarSenha(String senha) {
		driver.findElement(By.name("passwordRegisterPage")).sendKeys(senha);
	}

	public void confirmarSenha(String confirSenha) {
		driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys(confirSenha);
	}

	public void digitarPrimeiroNome(String primeiroNome) {
		driver.findElement(By.name("first_nameRegisterPage")).sendKeys(primeiroNome);
	}

    public void digitarUltimoNome(String ultimoNome){
        driver.findElement(By.name("last_nameRegisterPage")).sendKeys(ultimoNome);
    }
    
    public void digitarCelular(String celular){
        driver.findElement(By.name("phone_numberRegisterPage")).sendKeys(celular);
    }
    
    public void selecionarUmPais(String pais){
    	Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.tagName("select"))).click();
		
//    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("countryListboxRegisterPage")));
//    	Select selectCountry = new Select(driver.findElement(By.name("countryListboxRegisterPage")));
//        selectCountry.selectByVisibleText(pais);
    }
    
    public void digitarCidade(String cidade){
        driver.findElement(By.name("cityRegisterPage")).sendKeys(cidade);
    }
    
    public void digitarEndereco(String endereco){
        driver.findElement(By.name("addressRegisterPage")).sendKeys(endereco);
    }
    
    public void digitarRegiao(String regiao){
        driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys(regiao);
    }

    public void digitarCEP(String cep){
        driver.findElement(By.name("postal_codeRegisterPage")).sendKeys(cep);
    }
    
    public void clicarNoCheckBoxEuConcordo(){
        driver.findElement(By.name("i_agree")).click();
    }

    public void clicarNoBotaoDeRegistrar(){
        driver.findElement(By.id("register_btnundefined")).click();
    }
    
    public void clicoUserParaLogin(){
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='hrefUserIcon']")));
		driver.findElement(By.xpath("//a[@id='hrefUserIcon']")).click();
    }
    
    public void digitologin(String username) {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
    	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
    }
   
    public void digitoaSenha(String password) {
    	
    	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    }
    
    public void clicoSignIn() {
    	driver.findElement(By.xpath("//*[@id='sign_in_btnundefined']")).click();
    }
    
    public void clicoContinueShopping() {
    	driver.findElement(By.xpath(".//*[@class='a-button ng-scope']")).click();
    }
 }
