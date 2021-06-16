package modelo;

public class ParadoState implements State {

	private Vehiculo v;

	public ParadoState(Vehiculo v) {
		this.v = v;
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		if (v.obtenerCombustibleActual() > 0) {
			v.asignarEstado(new EnMarchaState(v));
			System.out.println("El vehiculo se encuentra ahora EN MARCHA");

			v.ModificarVelocidad(10);
			v.ModificarCombustible(-10);
		} else {
			v.asignarEstado(new SinCombustibleState(v));
			System.out.println("El vehiculo se encuentra ahora SIN COMBUSTIBLE");
		}
	}

	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		System.out.println("ERROR: El vehiculo ya se encuentra detenido");

	}

	@Override
	public void contacto() {
		// TODO Auto-generated method stub
		v.asignarEstado(new ApagadoState(v));
		System.out.println("El vehiculo se encuentra ahora APAGADO");

	}

}
