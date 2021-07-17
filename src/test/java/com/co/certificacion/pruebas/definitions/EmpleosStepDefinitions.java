package com.co.certificacion.pruebas.definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pruebas.steps.EmpleoStep;

import static jxl.biff.BaseCellFeatures.logger;

public class EmpleosStepDefinitions {
    @Steps
    EmpleoStep empleoStep;
    private int cantEmpleoPruebas;

    @Given("que ingreso al portal de empleo de choucair")
    public void queIngresoAlPortalDeEmpleoDeChoucair() {
        empleoStep.AbrirPaginaEmpleo();

    }

    @When("consulto un empleo de pruebas  s")
    public void consultoUnEmpleoDePruebasS() {
        cantEmpleoPruebas=empleoStep.consultarEmpleosAnalistaPruebas();
    }

    @Then("debo encontrar almenos un empleo")
    public void deboEncontrarAlmenosUnEmpleo() {
        empleoStep.validarCantidadEmpleosPruebas(cantEmpleoPruebas);
    }

}
