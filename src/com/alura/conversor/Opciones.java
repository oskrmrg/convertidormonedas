package com.alura.conversor;

public class Opciones {

	private String mensaje;
	private String tipoOpcion;
	private String titulo;
	private String[] posibilidades;	

	public Opciones(String mensaje, String tipoOpcion, String titulo, String[] posibilidades) {
		this.mensaje = mensaje;
		this.tipoOpcion = tipoOpcion;
		this.titulo = titulo;
		this.posibilidades = posibilidades;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTipoOpcion() {
		return tipoOpcion;
	}

	public void setTipoOpcion(String tipoOpcion) {
		this.tipoOpcion = tipoOpcion;
	}
	
	public String[] getPosibilidades() {
		return posibilidades;
	}
	
}
