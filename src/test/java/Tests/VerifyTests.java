package Tests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import org.testng.annotations.Test;

import Pages.loginPage;
import Pages.registerOnlyName;
import Pages.registrationPage;

public class VerifyTests extends TestsParameters {

	
	@Test(priority=1)
	public void signUp()throws  Exception {
		
		registrationPage register = new registrationPage(driver);
		ArrayList<String> users = getTestDataArray("C:\\Users\\danng\\eclipse-workspace\\CalculatorTest\\Duomenys\\login.txt");
	try {
		register.ClickCreateNewUser();
		String[] userInfo = users.get(1).split(",", 2);
		register.EnterCredentials(userInfo[0],userInfo[1]);
		register.ClickButtonSignUp();
		register.CatchUserName();
		register.ClickLogout();
		}catch(Exception e) {
			System.out.println("Sign up. Something went wrong");
		}
	}

	
	@Test(priority=2)
	public void login() throws Exception {
      
		loginPage login = new loginPage(driver);
		ArrayList<String> users = getTestDataArray("C:\\Users\\danng\\eclipse-workspace\\CalculatorTest\\Duomenys\\login.txt");
		    try {
		     // login.ClickMenuLogin();
		      String[] userInfo = users.get(1).split(",", 2);
		      login.TypePersonalData(userInfo[0],userInfo[1]);
		      login.ClickButtonLogin();
		      login.CatchUserName();
		      login.ClickLogout();
		  
              }catch(Exception e) {
	          //login.CheckIfLoginWarningExist();
	           System.out.println("login. Something went wrong");
              }
			}

	
	@Test(priority=3)
	public void loginWrongName() throws Exception {
      
		loginPage loginWrongName = new loginPage(driver);
		ArrayList<String> users = getTestDataArray("C:\\Users\\danng\\eclipse-workspace\\CalculatorTest\\Duomenys\\login.txt");
		    try {
		    	System.out.println("Login test with wrong userName");
		      String[] userInfo = users.get(2).split(",", 2);
		      loginWrongName.TypePersonalData(userInfo[0],userInfo[1]);
		      loginWrongName.ClickButtonLogin();
		      loginWrongName.CatchErrorMessage();
		      
              }catch(Exception e) {
	           System.out.println("Login. Something went wrong");
              }
			}


	@Test(priority=4)
	public void registrationOnlyName() throws Exception {
      
		registerOnlyName registrationOnlyName = new registerOnlyName(driver);
		ArrayList<String> users = getTestDataArray("C:\\Users\\danng\\eclipse-workspace\\CalculatorTest\\Duomenys\\login.txt");
		    try {
		    	System.out.println("Registration test with entered only name");
		      String[] userInfo = users.get(3).split(",", 2);
		      registrationOnlyName.ClickCreateNewUser();
		      registrationOnlyName.EnterCredentials(userInfo[0],userInfo[1]);
		      registrationOnlyName.ClickButtonSignUp();
		      registrationOnlyName.CatchErrorMessage();
		      
              }catch(Exception e) {
	           System.out.println("Login. Something went wrong");
              }
			}

	
	
	
	
//Metodai


	public static ArrayList<String> getTestDataArray(String myFile) throws Exception {
		ArrayList<String> listOfLines = new ArrayList<String>();
		String line;

		FileReader FR = new FileReader(myFile);
		BufferedReader BR = new BufferedReader(FR);
		line = BR.readLine();

		while (line != null) {
			listOfLines.add(line);
			line = BR.readLine();
		}
		BR.close();
		return listOfLines;
	}
	
	
	
	
	
	
	
}