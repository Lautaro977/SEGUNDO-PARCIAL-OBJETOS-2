package modelo;

import ui.Player;

public class EstadoBloqueado extends State {

	EstadoBloqueado(Player player) {
		super(player);
		player.asignarEstadoDeReproduccion(false);
	}

	@Override
	public String detener() {
		if (player.estadoDeReproduccion()) {
			player.cambianEstado(new EstadoListo(player));
			return "Detener reproduccion";
		} else {
			return "Bloqueado...";
		}
	}

	@Override
	public String iniciar() {
		player.cambianEstado(new EstadoListo(player));
		return "Listo";
	}

	@Override
	public String siguiente() {
		return "Bloqueado...";
	}

	@Override
	public String anterior() {
		return "Bloqueado...";
	}
}
