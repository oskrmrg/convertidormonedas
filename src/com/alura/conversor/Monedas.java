package com.alura.conversor;

import java.math.BigDecimal;
import java.text.DecimalFormat;


public class Monedas extends Conversor {
	
	private static double dolar = 3772.33;
	private static double euro = 4209.69;
	private static double libra = 4953.76;
	private static double yen = 30.85;
	private static double won = 3.12;
	
	public String convierteOtraDivisaPeso(double valor, double tazaDeCambio) {		
		DecimalFormat f = new DecimalFormat();
		return f.format(valor * tazaDeCambio);
	}
	
	public String conviertePesoOtraDivisa(double valor, double tazaDeCambio) {
		DecimalFormat f = new DecimalFormat();
		return f.format(valor / tazaDeCambio);
	}
	
	@Override	
	public void hacerConversion(String opcion, double valor) {
				
		String resultado;
		String message = "No puede hacer operaciones con valores negativos";

		//Lanza excepcion para números negativos
		if (valor < 0) {
			super.mostrarMensaje(message);
			throw new NumeroNegativoException(message);
		}
		
		switch (opcion) {

			case "De Pesos a Dolar": {
				resultado = this.conviertePesoOtraDivisa(valor, dolar);	
				super.mostrarMensaje("Tienes $" + resultado + " dolares");
				break;
			}
			case "De Pesos a Euros": {
				resultado = this.conviertePesoOtraDivisa(valor, euro);
				super.mostrarMensaje("Tienes $" + resultado + " euros");
				break;
			}
			case "De Pesos a Libras": {
				resultado = this.conviertePesoOtraDivisa(valor, libra);
				super.mostrarMensaje("Tienes $" + resultado + " libras");
				break;
			}
			case "De Pesos a Yen": {
				resultado = this.conviertePesoOtraDivisa(valor, yen);
				super.mostrarMensaje("Tienes $" + resultado + " yen");
				break;
			}
			case "De Pesos a Won coreano": {
				resultado = this.conviertePesoOtraDivisa(valor, won);
				super.mostrarMensaje("Tienes $" + resultado + " won coreano");
				break;
			}
			case "De Dolar a Pesos": {
				resultado = this.convierteOtraDivisaPeso(valor, dolar);
				super.mostrarMensaje("Tienes $" + resultado + " pesos");
				break;
			}
			case "De Euros a Pesos": {
				resultado = this.convierteOtraDivisaPeso(valor, euro);
				super.mostrarMensaje("Tienes $" + resultado + " pesos");
				break;
			}
			case "De libras a Pesos": {
				resultado = this.convierteOtraDivisaPeso(valor, libra);
				super.mostrarMensaje("Tienes $" + resultado + " pesos");
				break;
			}
			case "De Yen a Pesos": {
				resultado = this.convierteOtraDivisaPeso(valor, yen);
				super.mostrarMensaje("Tienes $" + resultado + " pesos");
				break;
			}
			case "De Won coreano a Pesos": {
				resultado = this.convierteOtraDivisaPeso(valor, won);
				super.mostrarMensaje("Tienes $" + resultado + " pesos");
				break;
			}
		}
		
	
	}

}
