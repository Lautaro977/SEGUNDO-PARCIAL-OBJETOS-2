package modelo;

public class ApagadoState implements State {

	private Vehiculo v;

	public ApagadoState(Vehiculo v) {
		this.v = v;
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("ERROR: El vehiculo esta apagado. Efectue el contacto para iniciar");
	}

	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		System.out.println("ERROR: El vehiculo esta apagado. Efectue el contacto para iniciar");
	}

	@Override
	public void contacto() {
		// TODO Auto-generated method stub
		if (v.obtenerCombustibleActual() > 0) {
			v.asignarEstado(new ParadoState(v));
			System.out.println("El vehiculo se encuentra ahora PARADO");
			v.asignarVelocidadActual(0);
		} else {
			v.asignarEstado(new SinCombustibleState(v));
			System.out.println("El vehiculo se encuentra sin combustible");

		}
	}

}
