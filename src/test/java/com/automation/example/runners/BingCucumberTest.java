package com.automation.example.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber", "junit:target/cucumber.xml"},
        features = "src/test/resources/com/automation/example/features",
        glue = {"com.automation.example.stepdefs"})
public class BingCucumberTest {
}
