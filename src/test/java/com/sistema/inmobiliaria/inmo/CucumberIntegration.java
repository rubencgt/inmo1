package com.sistema.inmobiliaria.inmo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", plugin = {"pretty", "junit:target/junit-report.xml"})
public class CucumberIntegration {
}
