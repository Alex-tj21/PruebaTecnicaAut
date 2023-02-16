package steps;


import groovy.lang.GString;
import net.thucydides.core.annotations.Steps;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.Keys;
import pages.Interactions.LoginInteraction;
import pages.Interactions.ProcesoCompraInteraction;
import pages.LoginPage;
import pages.ProcesoCompraPage;

import net.thucydides.core.annotations.Step;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import static org.openqa.selenium.Keys.*;

public class CompraStep {

	Robot robot= new Robot();
	@Steps
	ProcesoCompraInteraction procesoCompraInteraction;

	public CompraStep() throws AWTException {
	}

	@Step
	public void seleccionarCompra() {
		procesoCompraInteraction.seleccionarMenu();
		procesoCompraInteraction.seleccionarSubmenu();
		procesoCompraInteraction.seleccionarOpcion();
	}
	@Step
	public void seleccionarCliente(String cliente) {
		//procesoCompraInteraction.seleccionarCliente("Around the Horn");
		procesoCompraInteraction.seleccionarListaCliente();
		procesoCompraInteraction.diligenciarCliente(cliente);

	}

	@Step
	public void diligenciarFecha(String fecha) {
		procesoCompraInteraction.diligenciarFechaRequerida(fecha);

	}

	@Step
	public void seleccionarEmpleado(String empleado) {
		procesoCompraInteraction.seleccionarListaEmpleado();
		procesoCompraInteraction.diligenciarEmpleado(empleado);

	}

	@Step
	public void seleccionarOrdenProducto(){
		procesoCompraInteraction.seleccionarOpcionProducto();
	}

	@Step
	public void diligenciarProducto(String producto){
		procesoCompraInteraction.seleccionarProducto(producto);
	}
	@Step
	public void diligenciarCantidadProducto(String cantidad){
		procesoCompraInteraction.seleccionarNumeroProducto(cantidad);
		robot.mouseMove(300,350);
		robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK );

	}
	@Step
	public void guardarCompra(){
		robot.mouseMove(360,200);
		robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK );
	}

	@Step
	public void consultarCompra(String fechacompra){
		procesoCompraInteraction.consultarFecha(fechacompra);
	}
	@Step
	public void validarDatoCompra(String validacion){
		procesoCompraInteraction.validarcompra(validacion);
	}
}
