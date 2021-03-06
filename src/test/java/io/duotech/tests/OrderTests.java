package io.duotech.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.duotech.pages.ListOfAllOrdersPage;
import io.duotech.pages.LoginPage;
import io.duotech.pages.OrderPage;

public class OrderTests extends TestBase{
	
	@BeforeMethod // Subclass's @Before methods  will be executed after supercalsses' methods have finished executing
	
	public void loginAndGoToOrderPage() {
		LoginPage l = new LoginPage(driver);
		l.positiveLogin();
		Assert.assertTrue(driver.getTitle().contains("Web Orders"));
		ListOfAllOrdersPage allOrders = new ListOfAllOrdersPage(driver);
		allOrders.orderLink.click();
	}
		

	
	
	@Test
	public void verifyQuantityErrorMessage() {
		OrderPage orderPage = new OrderPage(driver);
		orderPage.processButton.click();
		String expected = "Quantity must be greater than zero.";
		String actual = orderPage.quantityErrMessage.getText();
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void verifyQuantityErrorMessage2() {
		OrderPage orderPage = new OrderPage(driver);
		orderPage.processButton.click();
		String expected = "Quantity must be greater than zero.";
		String actual = orderPage.quantityErrMessage.getText();
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void verifyQuantityErrorMessage3() {
		OrderPage orderPage = new OrderPage(driver);
		orderPage.processButton.click();
		String expected = "Quantity must be greater than zero.";
		String actual = orderPage.quantityErrMessage.getText();
		Assert.assertEquals(actual, expected);
	}
	
	

}
