package me3x;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@participant",
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber/cucumber.json"})
public class CukesRunner {

}
