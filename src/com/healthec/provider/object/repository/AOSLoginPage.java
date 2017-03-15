package com.healthec.provider.object.repository;

import org.openqa.selenium.By;

public class AOSLoginPage {
	
	public By userNameTxtfld = By.xpath("//android.widget.EditText[@content-desc='User Name']");
	public By pwdTxtfld = By.xpath("(//android.widget.EditText)[2]");
	public By loginBtn= By.xpath("//android.widget.Button[@content-desc='Log In']");
	public By contactUslink= By.xpath("//android.view.View[@content-desc='Contact us']");
	public By privacyPolicylink= By.xpath("//android.view.View[@content-desc='Privacy Policy']");
	public By termsOfUselink= By.xpath("//android.view.View[@content-desc='Terms of use']");
	public By invalidCredentials = By.xpath("//android.view.View[contains(@content-desc,'Incorrect')and @index='2']");
}
