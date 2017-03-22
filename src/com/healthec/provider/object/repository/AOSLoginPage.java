package com.healthec.provider.object.repository;

import org.openqa.selenium.By;

public class AOSLoginPage {
	
	public By userNameTxtfld = By.xpath("(//android.widget.EditText)[1]");
	public By pwdTxtfld = By.xpath("(//android.widget.EditText)[2]");
	public By loginBtn= By.name("Log In");
	public By contactUslink= By.name("Contact us");
	public By privacyPolicylink= By.name("Privacy Policy");
	public By termsOfUselink=By.name("Terms of use");
	//public By invalidCredentials = By.xpath("//android.view.View[contains(@content-desc,'Incorrect')and @index='2']");
	public By invalidCredentials = By.name("Incorrect username/password");
}
