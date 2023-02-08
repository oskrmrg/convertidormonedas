package com.alura.conversor;

public class Temperatura extends Conversor {

	@Override
	public void hacerConversion(String opcion, double valor) {
		double kelvin = 0;
		double centigrados = 0;
		double fahrenheit = 0;
		double rankine = 0;
		
		switch(opcion) {
		
			case "De grados Centigrados a Fahrenheit": {
				fahrenheit = (valor * 1.8) + 32;
				super.mostrarMensaje(valor + " °C equivalen a " + fahrenheit + " °F");
				break;
				//ºF = ºC x 1.8 + 32
			}
			case "De grados Centigrados a Kelvin": {
				kelvin = valor + 273.15;
				super.mostrarMensaje(valor + " °C equivalen a " + kelvin + " °K");
				break;
				//°k = °C + 273.15;
			}
			case "De grados Centigrados a Rankine": {
				rankine = (valor * 1.8) + 491.67;
				super.mostrarMensaje(valor + " °C equivalen a " + rankine + " °R");
				break;
				//°K = °C × 9/5 + 491.67
			}
			case "De grados Fahrenheit a Centigrados": {
				centigrados = (valor - 32) / 1.8;
				super.mostrarMensaje(valor + " °F equivalen a " + centigrados + " °C");
				break;
				 //ºC = (ºF-32) ÷ 1.8.
			}
			case "De grados kelvin a centigrados": {
				centigrados = valor - 373.15;
				super.mostrarMensaje(valor + " °K equivalen a " + centigrados + " °C");
				break;
				//°C = °K - 273.15;
			}
			case "De de grados Rankine a Centigrados": {
				centigrados = (valor - 491.67) / 1.8;
				super.mostrarMensaje(valor + " °R equivalen a " + centigrados + " °C");
				break;
				 //ºC = (ºR-491.67) ÷ 1.8.
			}		
		
		}
	}
	
	
}











