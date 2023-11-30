package org.stepdefinition;

import java.awt.AWTException;

import org.Reusable.reusable;
import org.pages.women_things_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class women_thing_step extends reusable {
	
	public women_things_pages wmnpage;
	
	@When("The user mouse cursor hold in the women option")
	public void the_user_mouse_cursor_hold_in_the_women_option() throws InterruptedException, AWTException {
		wmnpage = new women_things_pages(driver);
		Thread.sleep(5000);
		women_mouse_holder(wmnpage.getWomen_option_myntra());
}
	@When("The user choose the tops option")
	public void the_user_choose_the_tops_option() throws InterruptedException {
		Thread.sleep(5000);
		toclick(wmnpage.getWomen_tops());
	}
	@Then("The user verify the tops thinks option page")
	public void the_user_verify_the_tops_thinks_option_page() throws InterruptedException {
		Thread.sleep(5000);
		
	   
	}

	@When("The user click the women sector in top page")
	public void the_user_click_the_women_sector_in_top_page() throws InterruptedException {
		toclick(wmnpage.getTops_women_option());
		Thread.sleep(5000);
	   
	}

	@When("The user select the categories for tops")
	public void the_user_select_the_categories_for_tops() throws InterruptedException {
		toclick(wmnpage.getTops_tops_option());
		Thread.sleep(5000);
	    
	}

	@When("The user choose the barnd and color")
	public void the_user_choose_the_barnd_and_color() throws InterruptedException {
		toclick(wmnpage.getTops_brand_women());
		Thread.sleep(5000);
	    toclick(wmnpage.getTops_color_women());
	}
	
	@Then("The user verify the correct fiter prodect")
	public void the_user_verify_the_correct_fiter_prodect() throws InterruptedException {
		Thread.sleep(5000);

	   
	}

	@When("The user click the prodect for they want")
	public void the_user_click_the_prodect_for_they_want() throws InterruptedException {
		toclick(wmnpage.getWomen_tops_tops_pitcher());
		Thread.sleep(5000);
	   
	}

	@Then("The user verify the prodect pagefor tops")
	public void the_user_verify_the_prodect_pagefor_tops() {
		windowhandaling();
	   
	}

	@When("The user choose the size")
	public void the_user_choose_the_size() throws InterruptedException {
		toclick(wmnpage.getWomen_top_size());
		Thread.sleep(5000);
	   
	}

	@When("The user click the add to bag button and bag icon")
	public void the_user_click_the_add_to_bag_button_and_bag_icon() throws InterruptedException {
		toclick(wmnpage.getWomen_add_to_bag());
		Thread.sleep(5000);
		toclick(wmnpage.getWomen_add_to_bag_icon());
	   
	}
	@Then("The user verify  the ordering page for womens tops page")
	public void the_user_verify_the_ordering_page_for_womens_tops_page() throws InterruptedException {
		Thread.sleep(5000);
	    
	}

	@When("the user click the place to order for women tops page")
	public void the_user_click_the_place_to_order_for_women_tops_page() throws InterruptedException {
		
		mouseclick(wmnpage.getWomen_place_to_order());
		Thread.sleep(5000);
		toclick(wmnpage.getWomen_place_to_order());
		Thread.sleep(8000);
		driver.quit();


	}






	
	
	
	
	
}