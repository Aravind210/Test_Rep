package com.selfpom.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Self_Create {
	
	@FindBy (xpath="(//button[@type='submit'])[2]")
	
	private WebElement createaccount;

	public WebElement getCreateaccount() {
		return createaccount;
	}
	
}
