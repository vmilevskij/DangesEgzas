package Pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registrationPage {
	By createNewUser = By.cssSelector("body > div > form > div > h4 > a");
	By fieldUserName = By.id("username");
	By fieldPsw = By.id("password");
	By fieldPswComfirm = By.id("passwordConfirm");
	By buttonSignUp = By.cssSelector("#userForm > button");
	
	By buttonLogout = By.cssSelector("body > nav > div > ul.nav.navbar-nav.navbar-right > a");
	
	private WebDriver driver;
	
	

	public registrationPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	//Metodai
	public void ClickCreateNewUser() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(createNewUser).click();	
		Thread.sleep(1000);
	}
	
	
	public void EnterCredentials(String username, String psw) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(fieldUserName).sendKeys(username+RandomStringUtils.random(2,true, false)
);
		Thread.sleep(1000);
		driver.findElement(fieldPsw).sendKeys(psw);
		Thread.sleep(1000);
		driver.findElement(fieldPswComfirm).sendKeys(psw);
		Thread.sleep(1000);
	}
	
	public void ClickButtonSignUp() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(buttonSignUp).click();	
		Thread.sleep(1000);
	}
	
	
	
	public void CatchUserName() throws InterruptedException {
		Thread.sleep(1000);
		String CartMessage = driver.findElement(buttonLogout).getText();
		Thread.sleep(1000);
		System.out.println(CartMessage);
		Thread.sleep(1000);
		//assertTrue("Logout, Dange11", true);
		Thread.sleep(1000);
		 
		System.out.println("Success registration");
	}

	

	public void ClickLogout() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(buttonLogout).click();
		Thread.sleep(1000);
		
	}

	}


//public class registerNewPositiv extends pageparameters{
//	
//	By createnew = By.cssSelector("body > div > form > div > h4 > a");
//	By fieldUserName = By.id("username");
//	By fieldUserPsw = By.id("password");
//	By passwordConfirm = By.id("passwordConfirm");
//	By errornote = By.id ("username.errors");
//	By buttonSignIn = By.cssSelector("#userForm > button");
//	By check2 = By.cssSelector("body > nav > div > ul.nav.navbar-nav.navbar-right > a");
//	String name = "Adolfas9";
//	//konstruktorius
//		public  registerNewPositiv (WebDriver driver) {
//			this.driver=driver;
//		}
//			
//			//metodai
//			public void ClickButton() {
//				
//				driver.findElement(createnew).click();
//			}
//			
//			public void EnterCredentials() {
//				driver.findElement(fieldUserName).sendKeys(name);
//				driver.findElement(fieldUserPsw).sendKeys("12345");
//				driver.findElement(passwordConfirm).sendKeys("12345");
//				
//			}
//			
//			public void Clickbtn() {
//				driver.findElement(buttonSignIn).click();
//
//			}
//			
//			public void patikrinti2 () {
//				//paimame teksta
//				String a = driver.findElement(check2).getText();
//				//kokio teksto tikimes
//				assertEquals("Logout, "+name,a);
//				//isvedame i konsole
//				System.out.println("Testas pavyko(positive).Vartotojas prisijunge"  +  a);
//			}
//}
//
//
//






































