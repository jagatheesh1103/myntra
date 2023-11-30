package org.Reusable;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.Baseclass.Baseclass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class reusable extends Baseclass {
	
	
	
	
	

public JavascriptExecutor js;
	
	
	
	
	public  void toclick(WebElement Element ) {

		Element.click();
	}



	

	public  void windowhandaling() {
		String windowHandle = driver.getWindowHandle();

		Set<String> ch = driver.getWindowHandles();

		for (String neww : ch) {

			driver.switchTo().window(neww);

		}	

	}

	public void screenshot() throws IOException {
		TakesScreenshot tss=(TakesScreenshot)driver;
		File source=tss.getScreenshotAs(OutputType.FILE);
		File target=new File("src\\test\\resources\\screenshot\\new.png");
		FileUtils.copyFile(source, target);

	}

	public void enterkey() throws Exception {
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void downkey() throws AWTException {
		Robot rob1 = new Robot();

		rob1.keyPress(KeyEvent.VK_DOWN);
		rob1.keyRelease(KeyEvent.VK_DOWN);

	}
	
	
	public void tosendkey(WebElement element, String text) {
		element.sendKeys(text);
		

	}
	public  void backtonavigate(WebElement element) {
		driver.navigate().back();

	}
	
	public void scrolldown(WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		

	}
	
	public void scrollup(WebElement element) {
		JavascriptExecutor jsclick = (JavascriptExecutor)driver;
		jsclick.executeScript("arguments[0].scrollIntoView(false)", element);
		

	}
	public  void doubleclick(WebElement e) {
		Actions  actions = new Actions(driver);
		actions.doubleClick(e).perform();

	}
	
	public void mouseclick(WebElement e) {
		Actions  mousea = new Actions(driver);
		mousea.click(e).perform();


	}
	
	public void implicitywait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	
	public void javascriptclick(WebElement e) {
		js = (JavascriptExecutor)driver;

		js.executeScript("arguments[0].click;", e);

	}
	
	public void switichframe() {
		WebElement framee = driver.findElement(By.id("wiz-iframe-intent"));
		driver.switchTo().frame(framee);

	}
	
	public  void fluenwait() {
		FluentWait<WebDriver> flwait = new FluentWait<WebDriver>(driver)
				.pollingEvery(Duration.ofSeconds(10)).ignoring(Throwable.class).withTimeout(Duration.ofSeconds(30));
		flwait.until(ExpectedConditions.alertIsPresent());
		

	}
	
	public void mouse_holder(WebElement e) {
		Actions  mousholder = new Actions(driver);
		mousholder.clickAndHold(e).build().perform();

	}
	
	public void women_mouse_holder(WebElement e) {
		Actions  wmmousholder = new Actions(driver);
		wmmousholder.moveToElement(e).build().perform();
		


	}



	
}
