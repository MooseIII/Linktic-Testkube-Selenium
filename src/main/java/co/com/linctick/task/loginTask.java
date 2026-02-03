package co.com.linctick.task; // Asegúrate de que este paquete coincida con tu carpeta

import co.com.linctick.userInterfaces.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.linctick.userInterfaces.Login.DIGITAR_USUARIO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class loginTask implements Task {

    private final String name;

    public loginTask(String name) {
        this.name = name;
    }

    // Este es el método que llamarás desde el StepDefinition
    public static loginTask conElNombre(String name) {
        return Tasks.instrumented(loginTask.class, name);
    }

    @Override
       public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Login.CAMPO_USUARIO),
                Click.on(Login.OPCION_INTERNO),
                Click.on(Login.TIPO_DOCUMENTO),
                Click.on(Login.SELECCION_DOCUMENTO),
                WaitUntil.the(Login.DIGITAR_USUARIO, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue("1013581485").into(Login.DIGITAR_USUARIO),
                Enter.theValue("Prueba13.").into(Login.CAMPO_PASSWORD),
                Click.on((Login.INICIAR_SESION))
        );
    }
}






