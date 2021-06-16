package modelo;

import ui.Player;

public class EstadoReproducir extends State {

	EstadoReproducir(Player player) {
		super(player);
	}

	@Override
	public String detener() {
		player.cambianEstado(new EstadoBloqueado(player));
		player.establecerPistaActualDespuésDeParada();
		return "Detener reproduccion";
	}

	@Override
	public String iniciar() {
		player.cambianEstado(new EstadoListo(player));
		return "Pausa...";
	}

	@Override
	public String siguiente() {
		return player.siguientePista();
	}

	@Override
	public String anterior() {
		return player.anteriorPista();
	}

}
