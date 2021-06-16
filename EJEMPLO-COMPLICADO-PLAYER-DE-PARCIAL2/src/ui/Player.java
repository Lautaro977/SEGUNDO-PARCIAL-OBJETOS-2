package ui;

import java.util.ArrayList;
import java.util.List;

import modelo.EstadoListo;
import modelo.State;

public class Player {

	private State state;
	private boolean estadoReproduccion = false;
	private List<String> ListaReproduccion = new ArrayList<>();
	private int pistaActual = 0;

	public Player() {
		this.state = new EstadoListo(this);
		asignarEstadoDeReproduccion(true);
		for (int i = 1; i <= 12; i++) {
			ListaReproduccion.add("de la Pista " + i);
		}
	}

	public void cambianEstado(State state) {
		this.state = state;
	}

	public State obtenerEstado() {
		return state;
	}

	public void asignarEstadoDeReproduccion(boolean playing) {
		this.estadoReproduccion = playing;
	}

	public boolean estadoDeReproduccion() {
		return estadoReproduccion;
	}

	public String iniciarReproducción() {
		return "Reproducción " + ListaReproduccion.get(pistaActual);
	}

	public String siguientePista() {
		pistaActual++;
		if (pistaActual > ListaReproduccion.size() - 1) {
			pistaActual = 0;
		}
		return "Reproducción " + ListaReproduccion.get(pistaActual);
	}

	public String anteriorPista() {
		pistaActual--;
		if (pistaActual < 0) {
			pistaActual = ListaReproduccion.size() - 1;
		}
		return "Reproducción " + ListaReproduccion.get(pistaActual);
	}

	public void establecerPistaActualDespuésDeParada() {
		this.pistaActual = 0;
	}
}
