package modelo;

public class SinCombustibleState implements State {

	private Vehiculo v;

	public SinCombustibleState(Vehiculo v) {
		this.v = v;
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("ERROR: El vehiculo se encuentra sin combustible");

	}

	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		System.out.println("ERROR: El vehiculo se encuentra sin combustible");

	}

	@Override
	public void contacto() {
		// TODO Auto-generated method stub
		System.out.println("ERROR: El vehiculo se encuentra sin combustible");

	}

}
