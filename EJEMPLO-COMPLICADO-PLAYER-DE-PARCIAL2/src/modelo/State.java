package modelo;

import ui.Player;

public abstract class State {

	public Player player;

	State(Player player) {
		this.player = player;
	}

	public abstract String detener();

	public abstract String iniciar();

	public abstract String siguiente();

	public abstract String anterior();

}
