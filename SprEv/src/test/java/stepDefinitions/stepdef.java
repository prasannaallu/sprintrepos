package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pageobjects.Cartpage;
import Pageobjects.Homepage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class stepdef {
	WebDriver driver;
	Homepage hp;
	Cartpage cp;
	@Before
	public void setup()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Documents\\M4Path\\chromedriver.exe");
	driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.mcdelivery.co.in/");
	  hp = new Homepage(driver);
	  cp = new Cartpage(driver);
	}
	@After()
	public void teardown()
	{
	driver.close();
	}
	@Given("^user is on home page$")
    public void user_is_on_home_page() throws Throwable {
		 hp.gettitle();
		 hp.verifytitle();
    }

    @When("^user searches for an (.+)$")
    public void user_searches_for_an(String item) throws Throwable {
        hp.typesearch(item);
        Thread.sleep(1000);
        System.out.println("User searches from menu Successfully");
    }

    @When("^user selects an item and add$")
    public void user_selects_an_item_and_add() throws Throwable {
        hp.selectitem();
        Thread.sleep(500);
        hp.selectitem1();
        Thread.sleep(500);
        hp.typecustom();
        Thread.sleep(1000);
        hp.summary();
        hp.typecount();
        hp.viewcart();
        Thread.sleep(3000);
        System.out.println("Items added successfully");
    }

    @And("^user adds the quantity of item$")
    public void user_adds_the_quantity_of_item() throws Throwable {
       cp.typeadd();
       System.out.println("user adds quantity Successfully");
    }

    @And("^user removes the quantity of item$")
    public void user_removes_the_quantity_of_item() throws Throwable {
        cp.typeremove();
        System.out.println("User removes item from cart");
    }

    @And("^user selects customizations$")
    public void user_selects_customizations() throws Throwable {
    	cp.typegettext();
    	cp.gettext();
       cp.custom();
       Thread.sleep(3000);
       cp.removecustom();
       System.out.println("user adds customaizations successfully");
    }

    @And("^user can add the recommendations$")
    public void user_can_add_the_recommendations() throws Throwable {
    	Thread.sleep(3000);
        cp.typerecommend();
        cp.rectext();
        System.out.println("user adds recommendations Successfully");
    }

}

