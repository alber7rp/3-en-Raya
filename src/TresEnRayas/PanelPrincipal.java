package TresEnRayas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelPrincipal extends JPanel {
	
	public PanelPrincipal(){
		setLayout(new BorderLayout());
		setBackground(Color.decode("#00BCD4")); //Azul material desing
		
	
		
		PanelJugadores pjugadores = new PanelJugadores();
		PanelTablero ptablero = new PanelTablero();
		Juego game = new Juego();
		ptablero.setJuego(game);
		ptablero.setJugadores(pjugadores);
		game.setTablero(ptablero);
		pjugadores.setJuego(game);
		pjugadores.setPreferredSize(new Dimension(700,200)); //elijo la dimension preferida, para que tenga tamaño suficiente y los paneles no se superpongan
		
		
		
		add(BorderLayout.CENTER, ptablero);
		add( BorderLayout.SOUTH,pjugadores);
		repaint();
		
		
		
		
		
	}
	


}
