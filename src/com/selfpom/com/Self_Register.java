package com.selfpom.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Self_Register {
	
	@FindBy(xpath="(//a[@title='Account'])[1]")
	
	private WebElement register;

	public WebElement getRegister() {
		return register;
	}
	
	

}
