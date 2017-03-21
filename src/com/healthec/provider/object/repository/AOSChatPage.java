package com.healthec.provider.object.repository;

import org.openqa.selenium.By;

public class AOSChatPage {
	
	//public By chatIcon = By.xpath("//android.view.View[contains(@content-desc,'Dr.Albert')]/following-sibling::android.view.View[@index='1']");
	public By chatIcon = By.id("idChat");
	public By searchBtn = By.xpath("//android.view.View[@content-desc='chat?parm=xhePCRWMUskoWzDVJlYgVQ==#']");
	public By searchBox = By.xpath("//android.widget.EditText[@index='0']");
	public By searchCancelBtn = By.xpath("//android.widget.EditText[@index='0']/following-sibling::android.view.View[@index='1']");
	public By userFilter = By.xpath("//android.view.View[@content-desc='chat?parm=xhePCRWMUskoWzDVJlYgVQ==#']");
    public By WebView  = By.className("android.webkit.WebView");
    public By permissionsAccept = By.id("com.android.packageinstaller:id/permission_allow_button");
    public By permissionsDeny = By.id("com.android.packageinstaller:id/permission_deny_button");
}
