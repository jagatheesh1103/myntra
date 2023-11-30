package org.pages;

import org.Baseclass.Baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home_living_page extends Baseclass {
	
	public home_living_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public WebElement getPillow_place_order() {
		return pillow_place_order;
	}

	public WebElement getPillow_bag_icon() {
		return pillow_bag_icon;
	}

	public WebElement getPillow_add_to_bag() {
		return pillow_add_to_bag;
	}

	public WebElement getPillow_size() {
		return pillow_size;
	}



	@FindBy(xpath="//div[text()='PLACE ORDER']")
	WebElement pillow_place_order;
	
	@FindBy(xpath="//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']")
	WebElement pillow_bag_icon;

	@FindBy(xpath="//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")
	WebElement pillow_add_to_bag;
	
	@FindBy(xpath="//p[@class='size-buttons-unified-size']")
	WebElement pillow_size;
	
	
	
	
	
	
	
	
	
	@FindBy(xpath="//img[@alt='Sleepsia Set Of 2 White Fiber  Pillows']")
	WebElement pillow_prodect;
	
	
	
	@FindBy(xpath="(//div[@class='common-checkboxIndicator'])[12]")
	WebElement pillow_color;
	
	public WebElement getPillow_prodect() {
		return pillow_prodect;
	}

	public WebElement getPillow_color() {
		return pillow_color;
	}

	public WebElement getHome_pillow_men() {
		return home_pillow_men;
	}

	public WebElement getPillow_brand() {
		return pillow_brand;
	}

	@FindBy(xpath="(//label[@class='common-customRadio gender-label'])[1]")
	WebElement home_pillow_men;
	
	@FindBy(xpath="(//div[@class='common-checkboxIndicator'])[5]")
	WebElement pillow_brand;
	
	@FindBy(xpath="(//a[text()='Home & Living'])[1]")
	WebElement home_living_option;
	
	@FindBy(xpath="//a[text()='Pillows & Pillow Covers']")
	WebElement home_living_pillow;

	public WebElement getHome_living_option() {
		return home_living_option;
	}

	public WebElement getHome_living_pillow() {
		return home_living_pillow;
	}
	
	

}
