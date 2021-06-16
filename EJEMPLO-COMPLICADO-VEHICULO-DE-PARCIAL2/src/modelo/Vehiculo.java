package modelo;

public class Vehiculo {
	private State estado; // Estado actual del vehiculo (apagado, parado, en marcha, sin combustible)
	private int velocidadActual = 0; // Velocidad actual del vehiculo
	private int combustibleActual = 0; // Cantidad de combustible restante

	public Vehiculo(int combustible) {
		this.combustibleActual = combustible;
		estado = new ApagadoState(this);
	}

	public State obtenerEstado() {
		return estado;
	}

	public void asignarEstado(State estado) {
		this.estado = estado;
	}

	public int obtenerVelocidadActual() {
		return velocidadActual;
	}

	public void asignarVelocidadActual(int valor) {
		this.velocidadActual = valor;
	}

	public int obtenerCombustibleActual() {
		return combustibleActual;
	}

	public void vehiculoAcelerar() {
		estado.acelerar();
		System.out.println("Velocidad actual: " + velocidadActual + ". Combustible restante: " + combustibleActual);

	}

	public void vehiculoFrenar() {
		estado.frenar();
	}

	public void vehiculoContacto() {
		estado.contacto();
	}

	public void ModificarVelocidad(int kmh) {
		velocidadActual += kmh;
	}

	public void ModificarCombustible(int decilitros) {
		combustibleActual += decilitros;
	}

}
