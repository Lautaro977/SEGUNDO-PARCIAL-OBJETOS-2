package main;

import modelo.Vehiculo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo v = new Vehiculo(20);

		v.vehiculoAcelerar();// ApagadoState acelerar
		v.vehiculoContacto();// ApagadoState contacto cambia a ParadoState
		v.vehiculoAcelerar();// ParadoState acelerar cambia a EnMarchaState
		v.vehiculoAcelerar();// EnMarchaState acelerar
		v.vehiculoAcelerar();// EnMarchaState acelerar cambia a SinCombustibleState
		v.vehiculoFrenar();// EnMarchaState frenar
		v.vehiculoFrenar();// EnMarchaState frenar
		v.vehiculoFrenar();// EnMarchaState frenar
		v.vehiculoFrenar();// EnMarchaState frenar

	}

}
