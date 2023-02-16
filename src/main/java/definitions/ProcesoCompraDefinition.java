package definitions;

import models.RegistroCompra;
import steps.CompraStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import java.util.List;

public class ProcesoCompraDefinition {

	@Steps
	CompraStep compraStep;
	@Cuando("^realizo la compra del producto$")
	public void realizarCompraProducto(List<RegistroCompra> datos) throws InterruptedException {
	    compraStep.seleccionarCompra();
		compraStep.seleccionarCliente(datos.get(0).getNombreCliente());
		compraStep.diligenciarFecha(datos.get(0).getFechaOrden());
		compraStep.seleccionarEmpleado(datos.get(0).getEmpleado());
		compraStep.seleccionarOrdenProducto();
		compraStep.diligenciarProducto(datos.get(0).getProducto());
		compraStep.diligenciarCantidadProducto(datos.get(0).getCantidad());
		compraStep.guardarCompra();
		compraStep.consultarCompra(datos.get(0).getFechaOrden());
	}


	@Entonces("^valido que aparezca la aprobacion de la compra$")
	public void validarRegistroCompra(List<RegistroCompra> validacion) {
	   compraStep.validarDatoCompra(validacion.get(0).getFechaOrden());

	}
	
}
