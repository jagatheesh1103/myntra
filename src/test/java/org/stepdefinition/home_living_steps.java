package org.stepdefinition;

import org.Reusable.reusable;
import org.pages.home_living_page;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class home_living_steps extends reusable {
	
	public home_living_page hompage;

	
	@When("The user choose the home and living option")
	public void the_user_choose_the_home_and_living_option() throws InterruptedException {
		hompage = new home_living_page(driver);
		Thread.sleep(5000);
		mouse_holder(hompage.getHome_living_option());
	
	}

	@When("The user click the pillow option")
	public void the_user_click_the_pillow_option() throws InterruptedException {
		Thread.sleep(5000);
		toclick(hompage.getHome_living_pillow());
		
	}
	@Then("The user verify the pillow page")
	public void the_user_verify_the_pillow_page() throws InterruptedException {
		Thread.sleep(5000);
	    
	}

	@When("The user select the pillow for men")
	public void the_user_select_the_pillow_for_men() throws InterruptedException {
		toclick(hompage.getHome_pillow_men());
		Thread.sleep(5000);
	    
	}

	@When("The user choose the brand and color")
	public void the_user_choose_the_brand_and_color() throws InterruptedException {
		toclick(hompage.getPillow_brand());
		Thread.sleep(3000);
		toclick(hompage.getPillow_color());
		Thread.sleep(5000);
	   
	}

	@When("The user the select the prodect for pillow")
	public void the_user_the_select_the_prodect_for_pillow() {
		toclick(hompage.getPillow_prodect());
	   
	}
	@Then("The user verify the selecrt prodect page")
	public void the_user_verify_the_selecrt_prodect_page() throws InterruptedException {
		Thread.sleep(5000);
	}

	@When("THe user select the size for pillow")
	public void the_user_select_the_size_for_pillow() throws InterruptedException {
		windowhandaling();
	    toclick(hompage.getPillow_size());
	    Thread.sleep(3000);
	}

	@When("The user click the add to bag button in pillow page")
	public void the_user_click_the_add_to_bag_button_in_pillow_page() throws InterruptedException {
	  toclick(hompage.getPillow_add_to_bag());
	  Thread.sleep(3000);
	}

	@When("The user click the bag icon for pillow prodect page")
	public void the_user_click_the_bag_icon_for_pillow_prodect_page() {
		toclick(hompage.getPillow_bag_icon());
		
	}

	@Then("The user validate the ordering  page for pillow")
	public void the_user_validate_the_ordering_page_for_pillow() throws InterruptedException {
		Thread.sleep(5000);
	}

	@When("The user click the place to order button on order page")
	public void the_user_click_the_place_to_order_button_on_order_page() throws InterruptedException {
	   mouseclick(hompage.getPillow_place_order());
	   Thread.sleep(3000);
	   toclick(hompage.getPillow_place_order());
	   Thread.sleep(5000);
	   driver.quit();
	}




}
