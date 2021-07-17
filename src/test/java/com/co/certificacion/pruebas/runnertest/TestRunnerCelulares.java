package com.co.certificacion.pruebas.runnertest;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/choucairEmpleos.feature",
        glue = "com.co.certificacion.pruebas.definitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class TestRunnerCelulares {
}
