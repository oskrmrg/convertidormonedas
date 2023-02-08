package com.alura.conversor;

public class NumeroNegativoException extends RuntimeException {

	/**
	 * Lanza excepción a numeros negativos en la operación 
	 */
	private static final long serialVersionUID = 1L;

	public NumeroNegativoException() {
		super();
	}
	
	public NumeroNegativoException(String message) {
		super(message);
	}
	
}
