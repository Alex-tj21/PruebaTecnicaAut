package pages;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.PageObject;
@Getter
public class LoginPage extends PageObject {

	@FindBy(id="LoginPanel0_Username")
	private WebElementFacade txtUsuario;

	@FindBy(id="LoginPanel0_Password")
	private WebElementFacade txtContrasena;

	@FindBy(id="LoginPanel0_LoginButton")
	private WebElementFacade btnLogin;
	@FindBy(xpath="//*[@class=\"s-sidebar-band-icon fa fa-user\"]")
	private WebElementFacade btnUsuario;
	@FindBy(xpath="//p[@class=\"s-user-info fs-6 mb-1\"]")
	private WebElementFacade lblValidacionUsuario;


}
