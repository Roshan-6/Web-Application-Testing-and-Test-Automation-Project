package webTesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectModel {
	@FindBy(xpath = "//*[text()='Home']")
	WebElement Home;
	@FindBy(xpath = "//*[text()='Football']")
	WebElement Football;
	@FindBy(xpath = "//*[text()='Busketball']")
	WebElement BasketBall;
	@FindBy(xpath = "//*[text()='Kriket']")
	WebElement Cricket;
	@FindBy(xpath = "//*[text()='Cibersport']")
	WebElement cyberSport;
	

}
