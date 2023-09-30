package com.cmc.directorio.entidades;

public class AdminContactos {
	public Contacto buscarMasPesado(Contacto contacto1, Contacto contacto2) {
		
		//Telefono telf1 = new Telefono(1, "movi", "0987777712");
		//Telefono telf2 = new Telefono(1, "movi", "0987777712");
		if(contacto1.getPeso()>contacto2.getPeso()) {
			return contacto1;
		}else {
			return contacto2;
		}
		
	}
	
	public boolean compararOperadoras(Contacto contacto1, Contacto contacto2) {
		
		if(contacto1.getTelefono().getOperadora() == contacto2.getTelefono().getOperadora()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public void activarUsuario (Contacto contacto1) {
		//coloca activo en true si el usuario tiene whatsapp
		Telefono t1 = new Telefono(43,"movi", "0984682389");
		
		if(t1.isTieneWhatsapp()==true) {
			contacto1.setActivo(true);	
		}
	}
}
