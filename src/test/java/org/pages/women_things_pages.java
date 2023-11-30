package org.pages;

import org.Baseclass.Baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class women_things_pages extends Baseclass {
	

	public women_things_pages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='PLACE ORDER']")
	WebElement women_place_to_order;
	
	
	
	public WebElement getWomen_place_to_order() {
		return women_place_to_order;
	}

	@FindBy(xpath="//img[@alt='BAESD Shoulder Straps Crop Top']")
	WebElement women_tops_tops_pitcher;
	
	@FindBy(xpath="(//p[@class='size-buttons-unified-size'])[2]")
	WebElement women_top_size;
	
	@FindBy(xpath="//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")
	WebElement women_add_to_bag;
	
	@FindBy(xpath="//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']")
	WebElement women_add_to_bag_icon;
	

	
	public WebElement getWomen_tops_tops_pitcher() {
		return women_tops_tops_pitcher;
	}


	public WebElement getWomen_top_size() {
		return women_top_size;
	}


	public WebElement getWomen_add_to_bag() {
		return women_add_to_bag;
	}


	public WebElement getWomen_add_to_bag_icon() {
		return women_add_to_bag_icon;
	}


	@FindBy(xpath="(//label[@class='common-customRadio gender-label'])[2]")
	WebElement tops_women_option;
	
	@FindBy(xpath="(//div[@class='common-checkboxIndicator'])[1]")
	WebElement tops_tops_option;
	
	@FindBy(xpath="(//div[@class='common-checkboxIndicator'])[5]")
	WebElement tops_brand_women;
	
	@FindBy(xpath="(//div[@class='common-checkboxIndicator'])[13]")
	WebElement tops_color_women;
	
	
	
	
	public WebElement getTops_women_option() {
		return tops_women_option;
	}


	public WebElement getTops_tops_option() {
		return tops_tops_option;
	}


	public WebElement getTops_brand_women() {
		return tops_brand_women;
	}


	public WebElement getTops_color_women() {
		return tops_color_women;
	}


	public WebElement getWomen_option_myntra() {
		return women_option_myntra;
	}
	
	@FindBy(xpath="(//a[text()='Tops'])[1]")
	WebElement women_tops;
	
	
	public WebElement getWomen_tops() {
		return women_tops;
	}


	@FindBy(xpath="(//a[text()='Women'])[1]")
	WebElement women_option_myntra;
	
	
	
}
