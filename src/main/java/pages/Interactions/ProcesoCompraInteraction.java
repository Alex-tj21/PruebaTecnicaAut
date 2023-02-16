package pages.Interactions;

import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.Keys;
import pages.ProcesoCompraPage;

public class ProcesoCompraInteraction {

    @Page
    ProcesoCompraPage procesoCompraPage;
    public void seleccionarMenu() {
        procesoCompraPage.getLstMenu().click();

    }
    public void seleccionarSubmenu() {

        procesoCompraPage.getLstSubMenu().click();

    }
    public void seleccionarOpcion() {
        procesoCompraPage.getBtnNewOrder().click();

    }
    public void seleccionarListaCliente(){
        procesoCompraPage.getLstCliente().click();

    }
    public void diligenciarCliente(String cliente){
        procesoCompraPage.getTxtCliente().sendKeys(cliente);
        procesoCompraPage.getTxtCliente().sendKeys(Keys.ENTER);

    }

    public void diligenciarFechaRequerida(String fecha){
        procesoCompraPage.getTxtFechaOrden().clear();
        procesoCompraPage.getTxtFechaOrden().sendKeys(fecha);

    }

    public void seleccionarListaEmpleado(){
        procesoCompraPage.getLstEmpleado().click();

    }
    public void diligenciarEmpleado(String empleado){
        procesoCompraPage.getTxtEmpleado().sendKeys(empleado);
        procesoCompraPage.getTxtEmpleado().sendKeys(Keys.ENTER);

    }
    public void seleccionarOpcionProducto(){
        procesoCompraPage.getBtnProducto().click();
    }
    public void seleccionarProducto(String producto){
        procesoCompraPage.getLstProducto().click();
        procesoCompraPage.getTxtProducto().sendKeys(producto);
        procesoCompraPage.getTxtProducto().sendKeys(Keys.ENTER);
    }

    public void seleccionarNumeroProducto(String cantidad){
        procesoCompraPage.getTxtCantidad().clear();
        procesoCompraPage.getTxtCantidad().sendKeys(cantidad);
    }

    public void consultarFecha(String consultaFecha){
        procesoCompraPage.getTxtConsultarFecha().sendKeys(consultaFecha);
        procesoCompraPage.getTxtConsultarFecha().sendKeys(Keys.ENTER);
    }

    public void validarcompra(String validacion){

        procesoCompraPage.getLblValidarCompra().getText().contains(validacion);
    }
}
