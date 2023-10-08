package com.krakedev.evaluacion;

public class Direccion {
	private String callePrincipal;
	private String calleSecundaria;
	
	//COSNTRUCTOR
	public Direccion(String callePrincipal, String calleSecundaria) {
		this.callePrincipal = callePrincipal;
		this.calleSecundaria = calleSecundaria;
	}
	
	
	//GETTERS Y SETTERS
	/**
	 * @return the callePrincipal
	 */
	public String getCallePrincipal() {
		return callePrincipal;
	}
	/**
	 * @param callePrincipal the callePrincipal to set
	 */
	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}
	/**
	 * @return the calleSecundaria
	 */
	public String getCalleSecundaria() {
		return calleSecundaria;
	}
	/**
	 * @param calleSecundaria the calleSecundaria to set
	 */
	public void setCalleSecundaria(String calleSecundaria) {
		this.calleSecundaria = calleSecundaria;
	}
	
	
}
