package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Login {
	private String usuario;
	private String contrasena;


	public Login(String usuario, String contrasena) {
		super();
		this.usuario = usuario;
		this.contrasena = contrasena;
	}

	
	
	
}
