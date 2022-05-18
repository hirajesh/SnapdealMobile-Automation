package com.steps;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import com.Utilities.TestHarness;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Snapdeal extends TestHarness {

	@Given("Open Snapdeal")
	public void open_snapdeal() throws MalformedURLException, InterruptedException {
		StartAndroiDriver();
		androiddriver.launchApp();
		resetApp();
		Thread.sleep(10000);

	}

	@Then("Choose Language and click apply")
	public void choose_language_and_click_apply() throws InterruptedException {
		Thread.sleep(9000);
		androiddriver.findElement(By.xpath("//*[@text='English']")).click();
		androiddriver.findElement(By.xpath("//*[@text='Apply']")).click();

	}

	@Then("Search The Product")
	public void search_the_product() throws InterruptedException {
		Thread.sleep(3000);
		androiddriver.findElement(By.xpath("//*[@text='OK']")).click();
		androiddriver.findElement(By.xpath("//*[@resource-id='com.snapdeal.main:id/search_text_view']")).click();

		androiddriver.findElement(By.xpath("//*[@resource-id='com.snapdeal.main:id/search_edit_text']"))
				.sendKeys("Shirt");

	}

	@Then("Choose The Product From The List")
	public void choose_the_product_from_the_list() throws InterruptedException {
		Thread.sleep(3000);
		androiddriver.findElement(By.xpath("//*[@text='shirt men']")).click();
		androiddriver.findElement(By.xpath("//*[@resource-id='com.snapdeal.main:id/positiveBtnView']")).click();
		androiddriver.findElement(By.xpath(
				"//*[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']"))
				.click();

	}

}
