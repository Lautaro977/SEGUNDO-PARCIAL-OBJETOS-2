package modelo;

public class EnMarchaState implements State {

	private int VELOCIDAD_MAXIMA = 200;

	private Vehiculo v;

	public EnMarchaState(Vehiculo v) {
		this.v = v;
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		if (v.obtenerCombustibleActual() > 0) {
			if (v.obtenerVelocidadActual() >= VELOCIDAD_MAXIMA) {
				System.out.println("ERROR: El coche ha alcanzado su velocidad maxima");
				v.ModificarCombustible(-10);
			} else {
				v.ModificarVelocidad(10);
				v.ModificarCombustible(-10);
			}
		} else {
			v.asignarEstado(new SinCombustibleState(v));
			System.out.println("El vehiculo se ha quedado sin combustible");

		}
	}

	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		v.ModificarVelocidad(-10);
		if (v.obtenerVelocidadActual() <= 0) {
			v.asignarEstado(new ParadoState(v));
			System.out.println("El vehiculo se encuentra ahora PARADO");
		}
	}

	@Override
	public void contacto() {
		// TODO Auto-generated method stub
		System.out.println("ERROR: No se puede cortar el contacto en marcha!");

	}

}
