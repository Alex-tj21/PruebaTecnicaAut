package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fluentlenium.core.annotation.Page;
import pages.Interactions.LoginInteraction;
import pages.LoginPage;

public class LoginStep {
    @Page
    LoginPage loginPage;
    @Steps
    LoginInteraction loginInteraction;

    @Step
    public void abrirAplicacion(){
        loginPage.open();
    }

    @Step
    public void loginUsuario(String usuario){

        loginInteraction.diligenciarUsuario(usuario);

    }
    @Step
    public void loginContrasena(String contrasena){
        loginInteraction.diligenciarContrasena(contrasena);


    }
    @Step
    public void seleccionarLogin(){
        loginInteraction.seleccionarBotonLogin();
    }
    @Step
    public void seleccionarUsuario(){
        loginInteraction.seleccionarBotonUsuario();
    }

    @Step
    public void validacionUsuario(String validarUsuario){
        loginInteraction.validarUsuarioLogin(validarUsuario);
    }
}
