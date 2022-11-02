package Pages;

import org.openqa.selenium.By;
import Utilities.CommMethods;
import org.openqa.selenium.WebDriver;

public class My_Quote_pages {
	
	WebDriver driver;
	private By prod_health_ins=By.xpath("//div//img[@src='../../../assets/images/Health_Hospi_ICON.svg']");
	private By prod_endowment_ins=By.xpath("//div//img[@src='../../../assets/images/Savings Traditional_ICON.svg']");
	private By prod_critical_illness=By.xpath("//div//img[@src='../../../assets/images/Critical_illness_ICON.svg']");	
	
	
	public My_Quote_pages(WebDriver driver) {
		this.driver=driver;
		//PageFactory.initElements(driver, this);
		
	}
	
	public void Open_LOB_Health() throws Exception {
		CommMethods.scrollIntoView(driver, prod_health_ins);
		CommMethods.clickElement(driver, prod_health_ins, 5);
		
		
	}

}
