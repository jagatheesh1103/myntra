package org.stepdefinition;

import java.io.IOException;

import org.Reusable.reusable;
import org.openqa.selenium.WebDriver;
import org.pages.men_myntra_pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class men_myntra_step extends reusable{
	
	

	public men_myntra_pages menpage;
	
	
	@Given("The user launch the myntra application url")
	public void the_user_launch_the_myntra_application_url() throws IOException {
		
		Browser_Launch();
	    
	}
	
	@When("The user mouse cursor hold in men option")
	public void the_user_mouse_cursor_hold_in_men_option() throws InterruptedException {
		menpage = new men_myntra_pages(driver);
		Thread.sleep(5000);
		mouse_holder(menpage.getMen());
	    
	}
	@When("The user select the blazer & coats option")
	public void the_user_select_the_blazer_coats_option() throws InterruptedException {
		
		Thread.sleep(5000);
		toclick(menpage.getBlazer_coats());

	}
	@Then("The user validate the blazer for men page")
	public void the_user_validate_the_blazer_for_men_page() throws InterruptedException {
		Thread.sleep(5000);
	}
	
	@When("The user select the blackberry compeny")
	public void the_user_select_the_blackberry_compeny() throws InterruptedException {
		toclick(menpage.getBlack_berrys());
		Thread.sleep(5000);
	}
	@When("The user select the color for blazer")
	public void the_user_select_the_color_for_blazer() throws InterruptedException {
		scrolldown(menpage.getBlazer_prize());
		toclick(menpage.getBlazer_color());
		Thread.sleep(5000);
		
		
	
	}

	@When("The user select the price for blazer")
	public void the_user_select_the_price_for_blazer()  throws InterruptedException {
		
		toclick(menpage.getBlazer_prize());
		
		
	 
	}
	@Then("The user avalible blazers")
	public void the_user_avalible_blazers() throws InterruptedException {
		Thread.sleep(5000);
	    
	}

	@When("The user choise one blazer")
	public void the_user_choise_one_blazer() throws InterruptedException {
		toclick(menpage.getBlazer_suit());
		Thread.sleep(5000);

	}
	
	@When("The user select for size")
	public void the_user_select_for_size() {
		windowhandaling();
		toclick(menpage.getBlaze_size());
	    
	}
	@Then("The user verified size is selected")
	public void the_user_verified_size_is_selected()  throws InterruptedException {
		Thread.sleep(5000);
	}

	@When("The user want to  know the size chart and click it")
	public void the_user_want_to_know_the_size_chart_and_click_it() throws InterruptedException {
		mouseclick(menpage.getMen_sample_click());
		Thread.sleep(5000);
		toclick(menpage.getMen_blazer_size_chart());
	    
	}
	@When("The user click the how to measure button")
	public void the_user_click_the_how_to_measure_button() throws InterruptedException {
		Thread.sleep(5000);
		toclick(menpage.getMen_how_to_measure());
	   
	}

	@Then("The user verify the measure ments")
	public void the_user_verify_the_measure_ments() throws InterruptedException {
		Thread.sleep(5000);
	}

	@When("The use click the add to bag button")
	public void the_use_click_the_add_to_bag_button() {
	    toclick(menpage.getMen_add_to_bag());
	}
	
	@When("The user click the go to bag button")
	public void the_user_click_the_go_to_bag_button() throws InterruptedException {
		Thread.sleep(5000);
		toclick(menpage.getMen_go_to_bag());
	  
	}
	@Then("The user verify the ordering page")
	public void the_user_verify_the_ordering_page() throws InterruptedException {
		Thread.sleep(5000);
	
	}

	@When("The user click the palce order button")
	public void the_user_click_the_palce_order_button() throws InterruptedException {
		mouseclick(menpage.getMen_place_order());
		Thread.sleep(5000);
		toclick(menpage.getMen_place_order());
		Thread.sleep(9000);
		driver.quit();

	}






	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




}
