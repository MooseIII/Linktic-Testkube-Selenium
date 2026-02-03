package co.com.linktic.automation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registro_GAL.feature",
        glue = "co.com.linktic.automation.stepdefinition"
        // tags = "@regresion" <-- Coméntalo un momento
)
public class Registro {
}

