package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LegalPojoClass extends BaseClass{
public LegalPojoClass() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="(//input[@type='text'])[10]")
		private WebElement getPsid;
@FindBy(xpath="(//textarea[@onmouseover='this.title=this.value'])[4]")
private WebElement getExecution;
@FindBy(xpath=("//button[@id='Btn_Save']"))
private WebElement getClick;
@FindBy(xpath="//button[@data-bb-handler='ok']")
private WebElement getSave;
public WebElement getGetPsid() {
	return getPsid;
}
public WebElement getGetExecution() {
	return getExecution;
}
public WebElement getGetClick() {
	return getClick;
}
public WebElement getGetSave() {
	return getSave;
}
}
