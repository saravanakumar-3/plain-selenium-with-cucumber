package com.automation.steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"com.automation.steps", "com.automation.utils"},
    plugin = {"json:target/cucumber-reports/Cucumber.json", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})
public class TestRunner {}
