package org.pages;

import org.Baseclass.Baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class men_myntra_pages extends Baseclass {
	
	public men_myntra_pages(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='PLACE ORDER']")
	WebElement men_place_order;
	
	public WebElement getMen_place_order() {
		return men_place_order;
	}

	@FindBy(xpath="(//span[text()='GO TO BAG'])[2]")
	WebElement men_go_to_bag;
	
	public WebElement getMen_go_to_bag() {
		return men_go_to_bag;
	}

	@FindBy(xpath="//h1[text()='Blackberrys']")
	WebElement men_sample_click;
	
	
	public WebElement getMen_sample_click() {
		return men_sample_click;
	}

	@FindBy(xpath="(//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center'])[2]")
	WebElement men_add_to_bag;
	
	@FindBy(xpath="//div[text()='How to measure']")
	WebElement men_how_to_measure;
	
	
	public WebElement getMen_add_to_bag() {
		return men_add_to_bag;
	}

	


	public WebElement getMen_how_to_measure() {
		return men_how_to_measure;
	}


	@FindAll({
		@FindBy(xpath="//button[text()='Size Chart']"),
		@FindBy(xpath="//button[@class='size-buttons-show-size-chart']")
	})
	WebElement men_blazer_size_chart;
	
	
	public WebElement getMen_blazer_size_chart() {
		return men_blazer_size_chart;
	}

	public void setMen_blazer_size_chart(WebElement men_blazer_size_chart) {
		this.men_blazer_size_chart = men_blazer_size_chart;
	}

	@FindBy(xpath="(//button[@class='size-buttons-size-button size-buttons-size-button-default'])[1]")
	WebElement blaze_size;
	
	
	public WebElement getBlaze_size() {
		return blaze_size;
	}

	@FindBy(xpath = "(//a[@style='display: block;'])[6]")
	WebElement blazer_suit;
	
	public WebElement getBlazer_suit() {
		return blazer_suit;
	}


	@FindBy(xpath="(//div[@class='common-checkboxIndicator'])[14]")
	WebElement blazer_color;
	
	public WebElement getBlazer_color() {
		return blazer_color;
	}


	@FindBy(xpath="(//div[@class='common-checkboxIndicator'])[10]")
	WebElement blazer_prize;
	
	@FindBy(xpath="(//div[@class='common-checkboxIndicator'])[5]")
	WebElement black_berrys;

	public WebElement getBlack_berrys() {
		return black_berrys;
	}

	public WebElement getBlazer_prize() {
		return blazer_prize;
	}

	@FindBy(xpath = "(//a[text()='Men'])[1]")
	WebElement men;

	public WebElement getMen() {
		return men;
	}
	
	@FindBy(xpath = "//a[text()='Blazers & Coats']")
	WebElement blazer_coats;

	public WebElement getBlazer_coats() {
		return blazer_coats;
	}
	
	
	
	
	
}
