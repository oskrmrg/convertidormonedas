package com.alura.conversor;

import javax.swing.JOptionPane;

public abstract class Conversor {
	
	// 1.Menu de opciones
	public static String seleccionarItem( String message, String titulo, int display, String[] lista ) {
		String seleccionarItem = (String) JOptionPane.showInputDialog(null, message, titulo, display, null, lista, lista[0]);
		return seleccionarItem;
	}
	
	// 2.Solicitar dato de entrada
	public String solicitarDato(String message) {
		String entrada = JOptionPane.showInputDialog(message);		
		return entrada;
		
	}
	
	// 3.Escoger opciones de conversion
	public String seleccionarTipoCambio(String message, String titulo, int display, String[] lista) {
		String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, message, titulo, display, null, lista, lista[0]);
		return opcionSeleccionada;
	}
	
	
	// 4.Ventana de continuar
	public int continuarFinalizar(String message, String titulo, int display) {
		int confirmar = JOptionPane.showConfirmDialog(null, message, titulo, display);
		return confirmar;
	}
	
	// 5.Ventana de mostrar mensajes
	public void mostrarMensaje(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	// 6.Hacer conversion
	public void hacerConversion(String opcion, double valor) {
	//Implementar en clases hijas
	}
	
	// 7.Ventana de terminar programa
	public static int continuarFinalizar() {
		int confirmar = JOptionPane.showConfirmDialog(null, "¿desea continuar a un nuevo programa?",
				"Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);
		return confirmar;
	}

	// 8.Validar
	public static boolean validar(int valor) {
		if (valor != 0) {
			return false;
		}
		return true;
	}
	
	
}













