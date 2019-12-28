package com.lamtech.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Resources/Feature",
        glue = {"com.lamtect.stepDefinition", "com.lamtect.cucumber"},
        format = {"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json"},
        monochrome = true,
        tags = {"@CreateAccount"})
public class TestRunner {
}
