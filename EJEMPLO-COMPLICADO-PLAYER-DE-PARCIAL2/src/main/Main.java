package main;

import ui.Player;
import ui.UI;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player player = new Player();
		UI ui = new UI(player);
		ui.init();

	}

}
