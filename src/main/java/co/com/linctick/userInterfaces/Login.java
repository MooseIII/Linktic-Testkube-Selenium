package co.com.linctick.userInterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By; // <--- ESTA ES LA IMPORTACIÓN QUE TE FALTA

public class Login {
    // Ejemplo de cómo definir un campo de texto (Usuario)
    public static final Target CAMPO_USUARIO = Target.the("Campo para ingresar el usuario")
            .located(By.xpath("//*[@id='q-app']/div[2]/main/section/div[1]/form/div[1]/div/label/div/div[1]/div[3]/i"));
    public static final Target OPCION_INTERNO = Target.the("Opción INTERNO")
            .located(By.xpath("//div[contains(@class, 'q-item') and contains(., 'Interno')]"));
    public static final Target TIPO_DOCUMENTO = Target.the("Campo para seleccionar el tipo de documento")
            .located(By.xpath("//*[@id='q-app']/div[2]/main/section/div[1]/form/div[2]/div[1]/label/div/div[1]/div[3]/i"));
    public static final Target SELECCION_DOCUMENTO = Target.the("Opción Cédula de Ciudadanía")
            .located(By.xpath("//div[contains(@class, 'q-item')]//*[contains(text(), 'Cedula') or contains(text(), 'CC')]"));
    public static final Target DIGITAR_USUARIO = Target.the("Ingreso de usuario")
            .located(By.cssSelector("input[type='text']"));
    public static final Target CAMPO_PASSWORD = Target.the("Campo contraseña")
            .located(By.cssSelector("input[type='password']"));
    public static final Target INICIAR_SESION = Target.the("Iniciar Sesion")
            .located(By.xpath("//*[@id='q-app']/div[2]/main/section/div[1]/form/button/span[2]/span"));

}


