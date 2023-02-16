package definitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import models.Login;
import net.thucydides.core.annotations.Steps;
import steps.LoginStep;
import java.util.List;

public class LoginDefinition {

    @Steps
    LoginStep loginStep;
    @Dado("^que ingreso a la pagina serenity demo$")
    public void ingresarPaginaSerenityDemo() {
     loginStep.abrirAplicacion();
    }


    @Cuando("^realizo el login con los datos requeridos$")
    public void ingresarDatosRequeridos(List<Login> datos) {
        loginStep.loginUsuario(datos.get(0).getUsuario());
        loginStep.loginContrasena(datos.get(0).getContrasena());
    }

    @Cuando("^doy click en iniciar sesion$")
    public void doy_click_en_iniciar_sesion() {
        loginStep.seleccionarLogin();
    }

    @Entonces("^valido que aparezca mi nombre de usuario$")
    public void valido_que_aparezca_mi_nombre_de_usuario(List<Login> validacion) {
        loginStep.seleccionarUsuario();
        loginStep.validacionUsuario(validacion.get(0).getUsuario());

    }

}
