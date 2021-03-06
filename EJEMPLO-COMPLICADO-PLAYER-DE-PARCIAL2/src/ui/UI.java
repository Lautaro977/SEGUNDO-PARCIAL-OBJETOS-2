package ui;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UI {
	private Player player;
	private static JTextField textField = new JTextField();

	public UI(Player player) {
		this.player = player;
	}

	public void init() {
		JFrame frame = new JFrame("Test player");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel context = new JPanel();
		context.setLayout(new BoxLayout(context, BoxLayout.Y_AXIS));
		frame.getContentPane().add(context);
		JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
		context.add(textField);
		context.add(buttons);

		JButton play = new JButton("Play");
		play.addActionListener(e -> textField.setText(player.obtenerEstado().iniciar()));
		JButton stop = new JButton("Stop");
		stop.addActionListener(e -> textField.setText(player.obtenerEstado().detener()));
		JButton next = new JButton("Next");
		next.addActionListener(e -> textField.setText(player.obtenerEstado().siguiente()));
		JButton prev = new JButton("Prev");
		prev.addActionListener(e -> textField.setText(player.obtenerEstado().anterior()));
		frame.setVisible(true);
		frame.setSize(300, 100);
		buttons.add(play);
		buttons.add(stop);
		buttons.add(next);
		buttons.add(prev);
	}
}
