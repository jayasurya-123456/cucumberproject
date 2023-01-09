package util;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Enter;

public class BaseClass {
	
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert x;
	public static JavascriptExecutor js;
	public static Select s;
	//1
public static void launchChrome() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
}
//2
public static void maximize() {
	driver.manage().window().maximize();

}
//3
public static void loadUrl(String url) {
	driver.get(url);

}
//4
public static void getTitle() {
	System.out.println(driver.getTitle());

}
//5
public static void getCurrentUrl() {
	System.out.println(driver.getCurrentUrl());

}
//6
public static  void getText(WebElement e) {
	String text = e.getText();
	System.out.println(text);

}
//7
public static  void getAttribute(WebElement e,String name) {
	String attribute = e.getAttribute(name);
	System.out.println(attribute);

}
//8
public static void sendKeys(WebElement ele,String value) {
	ele.sendKeys(value);

}
//9
public static void click(WebElement ele) {
	ele.click();

}
//10
public static void closeUrl() {
	driver.close();
}
//11
public static void quiteUrl() {
	driver.quit();

}
//12
public static void moveToElement(WebElement e) {
	 a = new Actions(driver);
	 a.moveToElement(e).perform();

}
//13
public static void doubleClick(WebElement e) {
	 
	a.doubleClick(e).perform();
}
//14
public static void contextClick(WebElement e) {
	a.contextClick(e).perform();

}
//15
public static void dragAndDrop(WebElement src,WebElement des) {
	a.dragAndDrop(src, des).perform();
}
//16
public static void actionClick(WebElement e) {
a.click(e).perform();

}
//17
public static void robotEnter() throws AWTException {
	 r = new Robot();
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);

}
//18
public static void robotTab() {
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);

}
//19
public static void robotCopy() {
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_C);
	r.keyRelease(KeyEvent.VK_C);
	r.keyRelease(KeyEvent.VK_CONTROL);
	
}
//20
public static  void robotPaste() {
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
}
//21
public static void robotUp() {
	r.keyPress(KeyEvent.VK_UP);
	r.keyRelease(KeyEvent.VK_UP);
}
//22
public static void robotDown() {
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);

}
//23
public static  void alertAccept() {
	x = driver.switchTo().alert();
	x.accept();

}
//24
public static void alertDismiss() {
	x.dismiss();

}
//25
public static void getTextAlert() {
	x.getText();

}
//26
public static void sendkeysAlert(String y) {
x.sendKeys(y);
}
//27
//public static void screenShot(String name) throws IOException {
//	TakesScreenshot t =  (TakesScreenshot)driver;
//	File src = t.getScreenshotAs(OutputType.FILE);
//	File f = new File(System.getProperty("user.dir")+"\\MavenProject\\target\\Screenshot"+name+".jpg");
//	FileUtils.copyDirectory(src, f);
//	
//
//}

public static void doScreenShot(String fileName,String extension) throws IOException {

	TakesScreenshot tks = (TakesScreenshot) driver;
	File temp = tks.getScreenshotAs(OutputType.FILE);

	String timestamp = new SimpleDateFormat("yyyy/MM/dd_hh_mm_ss").format(new Date());
	
	File perm = new File("C:\\Users\\d.jayasurya\\eclipse-workspace\\MavenProject\\target\\Screenshot" + fileName+" "+timestamp+extension);
	FileUtils.copyFile(temp, perm);

}


//28
public static  void javaScriptScrollUp(WebElement e) {
	js =(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(false)", e);

}
//30
public static void javaScriptScrollDown(WebElement e) {
	js.executeScript("arguments[0].scrollIntoView(true)", e);

}
//31
public static void javaScriptClick(WebElement e) {
	js.executeScript("arguments[0].click()", e);

}
//32
public static void javaScriptSendkeys(WebElement e,String text) {
	js.executeScript("arguments[0].setAttribute('value','"+text+"')", e);
}
//33
public static void frameId(String id) {
	driver.switchTo().frame(id);

}
//34
public static void frameName(String name) {
	driver.switchTo().frame(name);

}
//35
public static void frameIndex(int index) {
	driver.switchTo().frame(index);

}
//36
public static void frameWebElement(WebElement e) {
	driver.switchTo().frame(e);

}
//37
public static  void windowsName(String url) {
	driver.switchTo().window(url);

}
//38
public static void windowsTitle(String title) {
	driver.switchTo().window(title);

}
//39
public static void windowsId(String Id) {
	driver.switchTo().window(Id);

}
//40
public static void parentWindow() {
	String parent = driver.getWindowHandle();
	System.out.println(parent);
}
//41
public static void allWindow() {
	Set<String> all = driver.getWindowHandles();
	List<String> l = new LinkedList<String>();
	l.addAll(all);
	driver.switchTo().window(l.get(1));
	
	}
//42
public static void selectValue(WebElement ref,String value) {
	s = new Select(ref);
	s.selectByValue(value);

}
//43
public static void selectText(String Text) {
	s.selectByVisibleText(Text);
}
//44
public static void selectIndext(int index) {
	s.selectByIndex(index);

}
public static void defaultcontent() {
	driver.switchTo().defaultContent();
}
public static void datePicker(String month,String year,String day) {
	
	while (true) {
		
		String text = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String text1 = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		if (text.equals(month)&&text1.equals(year)) {
			break;
			
		} else {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
	}
	List<WebElement> web = driver.findElements(By.xpath("//table//tr//td//a"));
	for (int i = 0; i <web.size(); i++) {
		WebElement g = web.get(i);
		String u = g.getText();
		if (u.equals(day)) {
		web.get(i).click();
		}
	}
	

}












}
