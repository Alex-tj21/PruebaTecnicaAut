package pages.Interactions;

import org.fluentlenium.core.annotation.Page;
import pages.LoginPage;

public class LoginInteraction {
    @Page
    LoginPage loginPages;

    public void diligenciarUsuario(String usuario) {
        loginPages.getTxtUsuario().clear();
        loginPages.getTxtUsuario().sendKeys(usuario);


    }
    public void diligenciarContrasena(String contrasena) {
        loginPages.getTxtContrasena().clear();
        loginPages.getTxtContrasena().sendKeys(contrasena);


    }
    public void seleccionarBotonLogin() {
        loginPages.getBtnLogin().click();
    }
    public void seleccionarBotonUsuario() {
        loginPages.getBtnUsuario().click();
    }
    public void validarUsuarioLogin(String validacion){

        loginPages.getLblValidacionUsuario().getText().contains(validacion);
    }
}
