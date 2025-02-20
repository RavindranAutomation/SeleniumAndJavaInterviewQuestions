package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Screenshot {

	@FindBy(xpath = "//div[@class='inputs']/child::input[@id='Email']")
	private WebElement emailField;

	public WebElement getEmailField() {
		return emailField;
	}

	public void setEmailField(WebElement emailField) {
		this.emailField = emailField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(WebElement passwordField) {
		this.passwordField = passwordField;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}

	public void setForgotPasswordLink(WebElement forgotPasswordLink) {
		this.forgotPasswordLink = forgotPasswordLink;
	}

	public WebElement getInvalidLoginAlertMessage() {
		return invalidLoginAlertMessage;
	}

	public void setInvalidLoginAlertMessage(WebElement invalidLoginAlertMessage) {
		this.invalidLoginAlertMessage = invalidLoginAlertMessage;
	}

	public WebElement getInvalidEmailMessage() {
		return invalidEmailMessage;
	}

	public void setInvalidEmailMessage(WebElement invalidEmailMessage) {
		this.invalidEmailMessage = invalidEmailMessage;
	}

	@FindBy(xpath = "//div[@class='inputs']/child::input[@id='Password']")
	private WebElement passwordField;

	@FindBy(xpath = "//div[@class='buttons']/child::input[@class='button-1 login-button']")
	private WebElement loginBtn;

	@FindBy(xpath = "//div[@class='inputs reversed']/child::span/a")
	private WebElement forgotPasswordLink;

	@FindBy(xpath = "//div[@class='validation-summary-errors']/span[contains(text(),'unsuccessful')]")
	private WebElement invalidLoginAlertMessage;

	@FindBy(xpath = "//div[@class='inputs']//child::span[@for='Email']")
	private WebElement invalidEmailMessage;
	

}
