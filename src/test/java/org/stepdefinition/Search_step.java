package org.stepdefinition;

import org.Reusable.reusable;
import org.pages.search_page;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_step extends reusable {
	public search_page sepage;
	
	
	@When("To the enter prodect name in search box {string}")
	public void to_the_enter_prodect_name_in_search_box(String prodect) throws Exception {
		sepage = new search_page(driver);
		Thread.sleep(5000);
		toclick(sepage.getSearch_box());
		tosendkey(sepage.getSearch_box(), prodect);
		Thread.sleep(3000);
		enterkey();
	}
	
	@Then("The user validate the search prodect is appear in the page")
	public void the_user_validate_the_search_prodect_is_appear_in_the_page() throws InterruptedException {
		Thread.sleep(5000);
	}

	
	@When("The user select the categories for shoes")
	public void the_user_select_the_categories_for_shoes() throws InterruptedException {
	   toclick(sepage.getShoe_categories());
	   Thread.sleep(3000);
	}

	@When("The user select the brand and colur")
	public void the_user_select_the_brand_and_colur() throws InterruptedException {
		toclick(sepage.getShoe_brand());
		Thread.sleep(3000);
		toclick(sepage.getShoe_color());
		Thread.sleep(3000);
	   
	}

	@When("The user click the prodect for he want")
	public void the_user_click_the_prodect_for_he_want() {
		mouseclick(sepage.getShoe_prodect());
	   
	}
	@Then("The user verify the prodect page for shoes")
	public void the_user_verify_the_prodect_page_for_shoes() throws InterruptedException {
		Thread.sleep(3000);
		
	   
	}

	@When("The user choose the size for the shoe")
	public void the_user_choose_the_size_for_the_shoe() throws InterruptedException {
		windowhandaling();
		toclick(sepage.getShoe_size());
		Thread.sleep(3000);
	    
	}
	@When("The user click the add to bag button and bag icon for shoe")
	public void the_user_click_the_add_to_bag_button_and_bag_icon_for_shoe() throws InterruptedException {
		toclick(sepage.getShoe_add_to_bag());
		Thread.sleep(3000);
		toclick(sepage.getShoe_bag_icon());
		

	}

	@Then("The user validate the ordering page for shoe")
	public void the_user_validate_the_ordering_page_for_shoe() throws InterruptedException {
		Thread.sleep(3000);
		
	   
	}

	@When("The click click the place to order button")
	public void the_click_click_the_place_to_order_button() throws InterruptedException {
	    mouseclick(sepage.getShoe_place_order());
	    Thread.sleep(3000);
	    toclick(sepage.getShoe_place_order());
	    Thread.sleep(5000);
	    driver.quit();
	}





}
