package co.com.linktic.automation.stepdefinition;

import co.com.linctick.task.loginTask;
import co.com.linctick.userInterfaces.Login;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

public class RegistroStepDefinitions {

    Actor user=new Actor("User");

    @Managed(driver="chrome")
    WebDriver driver;

    @Before
    public void config(){
        user.can(BrowseTheWeb.with(driver));
    }

    @Dado("que estoy en la página de login")
    public void que_estoy_en_la_página_de_login() {
        // Configura el driver automáticamente
        WebDriverManager.chromedriver().setup();
        // Prepara el escenario y el actor
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Actor").wasAbleTo(
                Open.url("https://gal-back-qa.linktic.com/login")
        );
        // --- ESPERA PARA VER EL NAVEGADOR ---
        try {
            System.out.println("Esperando 5 segundos para visualizar la carga...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Cuando("ingreso mis credenciales")
    public void ingreso_mis_credenciales() {
        System.out.println("Paso: Selecciona si es Interno o Externo");
        OnStage.theActorInTheSpotlight().attemptsTo(
                // Llamamos a la TASK (loginTask), no a la UserInterface (Login)
                loginTask.conElNombre("nombre")
                );
        try {
            System.out.println("Esperando 2 segundos para visualizar la carga...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Entonces("debería ver el panel principal")
    public void debería_ver_el_panel_principal() {
        // Aquí irán las validaciones

        System.out.println("Paso: Verifico el panel principal");
    }
}