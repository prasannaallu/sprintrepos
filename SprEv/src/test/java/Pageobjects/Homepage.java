package Pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class Homepage {
	WebDriver driver;
	private By search = By.xpath("//input[@name='search']");
	private By add = By.xpath("//button[@class='view-cart']");
	private By view = By.xpath("//*[@id='home-page-wrapper']/div[5]/app-cart-card/div/div[2]/button");
	private By count = By.xpath("//div[@class='item-count']");
	private By item1 =By.xpath("(//button[@class='btn primary-btn cursor-pointer'])[2]");
	private By item2 =By.xpath("(//button[@class='btn primary-btn cursor-pointer'])[6]");
	private By item3 =By.xpath("(//button[@class='btn primary-btn cursor-pointer'])[8]");
	private By text =By.xpath("//h2[@class='section-title']");
	public Homepage(WebDriver driver)
	{
	this.driver = driver;
	}
	 public void gettitle()
		{
		String s= driver.getTitle();
		System.out.println(s);
		}
	 public void verifytitle(){
		 String s= driver.getTitle();
	    	String s2 = "McDonald's - Order McDonald's Burger & Wraps online|McDelivery";
	    	Assert.assertEquals(s,s2);
	    	System.out.println(" Verified Successfully");
	 }
		public void typesearch(String item) throws InterruptedException
		{
		driver.findElement(search).sendKeys(item);
		   Thread.sleep(2000);
		}
		public void selectitem()
		{
			driver.findElement(item1).click();
			driver.findElement(add).click();
		}
		public void selectitem1()
		{
			driver.findElement(item2).click();
			driver.findElement(add).click();
	   WebElement r1=  driver.findElement(By.xpath("(//input[@type='text'])[3]"));	
	        r1.click();
	        r1.clear();
			r1.sendKeys("5");
			r1.sendKeys(Keys.ENTER);
			driver.findElement(add).click();
		}  
		public void typecustom()
		{
			driver.findElement(item3).click();
			driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[3]/div/label")).click();
			driver.findElement(add).click();
		}
		public void summary()
		{
		String str=	driver.findElement(text).getText();
		System.out.println(str);
		}
		public void typecount()
		{
		String str1=driver.findElement(count).getText();
		System.out.println(str1);
		}
		public void viewcart()
		{
			driver.findElement(view).click();
		}	
	
	}
 