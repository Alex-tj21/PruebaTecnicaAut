package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistroCompra {

	private String nombreCliente;
	private String fechaOrden;
	private String empleado;
	private String producto;
	private String cantidad;


	public RegistroCompra(String nombreCliente, String fechaOrden, String empleado, String producto,
						  String cantidad) {
		this.nombreCliente = nombreCliente;
		this.fechaOrden = fechaOrden;
		this.empleado = empleado;
		this.producto = producto;
		this.cantidad = cantidad;

	}

	
	
}
