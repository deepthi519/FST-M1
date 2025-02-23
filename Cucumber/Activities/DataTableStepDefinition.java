package stepDefinitions;

import java.util.List;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTableStepDefinition 
{

	WebDriverWait driver;
	WebDriverWait wait;

	@Given("User is completes the requirement")
	public void completereq() {
		System.out.println("Given activity completed");
	}

	@When("^User enters following username and password")
	public void user_enters_and(DataTable credemtials) 
	{
		List<List<String>> creds = credemtials.asLists();
		for(List<String> cred : creds){
			for(String credential : cred){
				System.out.println(credential);
			}
		}


	}
}

