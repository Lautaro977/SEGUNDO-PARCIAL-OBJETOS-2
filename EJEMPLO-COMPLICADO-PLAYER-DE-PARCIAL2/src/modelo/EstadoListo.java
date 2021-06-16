package modelo;

import ui.Player;

public class EstadoListo extends State {

	public EstadoListo(Player player) {
		super(player);
	}

	@Override
	public String detener() {
		player.cambianEstado(new EstadoBloqueado(player));
		return "Bloqueado...";
	}

	@Override
	public String iniciar() {
		String action = player.iniciarReproducción();
		player.cambianEstado(new EstadoReproducir(player));
		return action;
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
