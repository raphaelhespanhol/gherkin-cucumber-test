package stepdefinition.create_product;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import domain.Product;

public class ProductCreatorSteps {

    private Product product = new Product();

    @Given("^que desejo criar uma produto para (.*)$")
    public void certificationName(String name) throws Throwable {
        product.setName(name);
    }

    @When("^com o cadastro via banco de dados retornando sucesso$")
    public void gotMarks() throws Throwable {

    }

    @When("^solicito a criação do produto$")
    public void gotMark() throws Throwable {

    }

    @Then("^recebo na criação do produto o código http (.+)$")
    public void certifiedYes(int status) throws Throwable {

    }

}
