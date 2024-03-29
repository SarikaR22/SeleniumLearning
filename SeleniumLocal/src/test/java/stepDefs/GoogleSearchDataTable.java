/*
 * package stepDefs; import java.util.List; import org.openqa.selenium.By;
 * import org.openqa.selenium.Keys; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * io.cucumber.datatable.DataTable; import io.cucumber.java.en.Given; import
 * io.cucumber.java.en.Then; import io.cucumber.java.en.When; public class
 * GoogleSearchDataTable {
 * 
 * WebDriver driver = new ChromeDriver();
 * 
 * @Given("I am on the Google search page to search multiple data") public void
 * i_am_on_the_google_search_page() { driver.get("https://www.google.com"); //
 * driver.get("https://www.google.com");
 * driver.navigate().to("https://www.google.com"); }
 * 
 * @When("I search for the following set of terms") public void
 * i_search_for_the_following_terms(DataTable dataTable) { List<String>
 * searchTerms = dataTable.asList(String.class); for (String term : searchTerms)
 * { searchOnGoogle(term); } }
 * 
 * @Then("I should see search results for each term as expected") public void
 * i_should_see_search_results_for_each_term() { // Assertion logic to verify
 * search results for each term System.out.println(driver.getTitle());
 * driver.quit(); }
 * 
 * private void searchOnGoogle(String searchTerm) {
 * driver.findElement(By.name("q")).clear();
 * driver.findElement(By.name("q")).sendKeys(searchTerm);
 * driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
 * driver.navigate().back(); }
 * 
 * }
 */