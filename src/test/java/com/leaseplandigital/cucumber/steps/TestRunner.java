package com.leaseplandigital.cucumber.steps;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/",
glue="com.leaseplandigital.cucumber.serenity",
dryRun= false, 
strict=false,
monochrome=true,
tags= {"@GetRestrictList"}
)
public class TestRunner {

}
