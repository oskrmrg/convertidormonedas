package com.alura.conversor;

public class NumeroNegativoException extends RuntimeException {

	/**
	 * Lanza excepci�n a numeros negativos en la operaci�n 
	 */
	private static final long serialVersionUID = 1L;

	public NumeroNegativoException() {
		super();
	}
	
	public NumeroNegativoException(String message) {
		super(message);
	}
	
}
