package com.bdd.tests;

import org.junit.Assert;

import com.example.GenerateUID;

import cucumber.api.java.en.*;


public class StepDefs {
	
	String uniqueKey = "";
	public StepDefs() {
		
	}


	@Given("^I call API$")
	public void call1() throws Throwable {
		GenerateUID obj = new GenerateUID();
		uniqueKey = obj.generateUniqueKey();
	}

	@Then("^I get result$")
	public void call2() throws Throwable {
		if(uniqueKey.length() == 36) {
			System.out.println("I get result: completed successfully");
			return;
		}
		System.out.println("I get result: failed");
	}
}
