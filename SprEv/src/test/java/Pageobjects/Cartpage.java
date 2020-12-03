package Pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Cartpage {
	WebDriver driver;
	private By view = By.xpath("//*[@id='home-page-wrapper']/div[5]/app-cart-card/div/div[2]/button");
	private By h1= By.xpath("//div[@class='d-flex cart-header']");
	private By h2= By.className("heading");
	private By add = By.xpath("//button[@class='view-cart']");
	private By recom1 = By.xpath("(//button[@class='btn primary-btn cursor-pointer'])[1]");
	private By recom2 = By.xpath("(//button[@class='btn primary-btn cursor-pointer'])[2]");
	private By rtxt = By.xpath("(//div[@class='heading'])[2]");
	private By cust = By.xpath("(//div[@class='change-option space-left'])[1]");
	private By rcustom = By.xpath("(//div[@class='change-option space-left'])[2]");
	public Cartpage(WebDriver driver)
	{
	this.driver = driver;
	}
	public void viewcart()
	{
		driver.findElement(view).click();
	}	
	public void gettext() throws InterruptedException
	{
	System.out.println(driver.findElement(h1).getText());
	}
	public void typegettext() throws InterruptedException
	{
		System.out.println(driver.findElement(h2).getText());
	}
	public void typeadd() throws InterruptedException
	{
	
		WebElement a=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		Thread.sleep(1000);
		a.click();
		a.clear();
			a.sendKeys("4");
			a.sendKeys(Keys.ENTER);
	}
	public void typeremove() throws InterruptedException
	{
		driver.findElement(By.xpath("(//button[@class='minus'])[2]")).click();	
		  Thread.sleep(3000);
		WebElement r= driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		r.click();
		   Thread.sleep(1000);
		r.clear();
		r.sendKeys("0");
		r.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@type='button']")).click();
	}
  public void custom() throws InterruptedException 
  {
	  driver.findElement(cust).click();
	  driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/div/div/div[1]/div[1]/div/div[2]/div/p[2]")).click();
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[4]/div/label")).click();
		driver.findElement(add).click();  
  }
	public void removecustom() throws InterruptedException
	{
		 driver.findElement(rcustom).click();
		 driver.findElement(By.xpath("(//p[@class='remove'])[1]")).click();
		 driver.findElement(add).click(); 
	}
	public void typerecommend() throws InterruptedException
	{
		driver.findElement(recom1).click();
		driver.findElement(recom2).click();
	}
	public void rectext()
	{
		String txt=driver.findElement(rtxt).getText();
		System.out.println(txt);
	}
	
}


