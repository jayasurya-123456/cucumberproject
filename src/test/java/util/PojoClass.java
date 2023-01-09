package util;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass{
public PojoClass() {
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath="//iframe[@class='demo-frame lazyloaded']")
private WebElement txtuser;
@FindBy(id="datepicker")
private WebElement txtdate;
@FindBy(xpath="//span[@class='ui-datepicker-month']")
private WebElement txtdate1;
@FindBy(xpath="//a[text()='10']")
private WebElement txtdate2;
public WebElement getTxtuser() {
	return txtuser;
}
public WebElement getTxtdate() {
	return txtdate;
}
public WebElement getTxtdate1() {
	return txtdate1;
}
public WebElement getTxtdate2() {
	return txtdate2;
}
}
