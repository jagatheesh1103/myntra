package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue="org.stepdefinition",dryRun=false, monochrome=true,
        plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")


public class myntra_runner {
	
	
	

}
 
