package org.pages;

import org.Baseclass.Baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class search_page extends Baseclass{

	public search_page(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='PLACE ORDER']")
	WebElement shoe_place_order;
	
	
	public WebElement getShoe_place_order() {
		return shoe_place_order;
	}



	public WebElement getShoe_bag_icon() {
		return shoe_bag_icon;
	}



	public WebElement getShoe_add_to_bag() {
		return shoe_add_to_bag;
	}



	public WebElement getShoe_size() {
		return shoe_size;
	}

	@FindBy(xpath="//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']")
	WebElement shoe_bag_icon;
	
	@FindBy(xpath="//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")
	WebElement shoe_add_to_bag;
	
	@FindBy(xpath="(//p[@class='size-buttons-unified-size'])[3]")
	WebElement shoe_size;

	
	@FindBy(xpath="(//a[@style='display: block;'])[2]")
	WebElement shoe_prodect;
	
	public WebElement getShoe_prodect() {
		return shoe_prodect;
	}



	public WebElement getShoe_color() {
		return shoe_color;
	}



	public WebElement getShoe_brand() {
		return shoe_brand;
	}



	public WebElement getShoe_categories() {
		return shoe_categories;
	}


	@FindBy(xpath="(//div[@class='common-checkboxIndicator'])[18]")
	WebElement shoe_color;
	
	@FindBy(xpath="(//div[@class='common-checkboxIndicator'])[8]")
	WebElement shoe_brand;
	
	@FindBy(xpath="(//div[@class='common-checkboxIndicator'])[1]")
	WebElement shoe_categories;
	
	
	
	
	@FindBy(xpath="//input[@class='desktop-searchBar']")
	WebElement search_box;
	
	
	
	public WebElement getSearch_box() {
		return search_box;
	}
	
}

