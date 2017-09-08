package TresEnRayas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelJugadores extends JPanel {
	
	int turno;
	Color desactivado, activado;
	Juego game;
	
	public PanelJugadores(){
		setBackground(Color.decode("#0097A7"));
		desactivado = Color.decode("#0097A7");
		activado = Color.decode("#6200EA");
	
	}
	
	public void cambiarturno(int i){
		
		turno = i;
		repaint();
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		System.out.println("paint component del panel de jugadores" + this.getPreferredSize());
		turno = game.getJugadorActual();
		
		Image j1,j2;
		j1 = game.getTablero().j1;
		j2 = game.getTablero().j2;
		
		
		
		if(turno == 1){
			g.setColor(activado);
			g.fillRect(30, 20, 320, 150);
			
			g.setColor(desactivado);
			g.fillRect(360, 20, 320, 150);
			
			g.drawImage(j1, 40, 30, 100,100,this);
		}
		
		if(turno ==2){
			
			g.setColor(desactivado);
			g.fillRect(30, 20, 320, 150);
			
			g.setColor(activado);
			g.fillRect(350, 20, 320, 150);
			
			g.drawImage(j2, 550, 30, 100,100,this);
			
		}
	}
	
	public void setJuego(Juego g){
		game = g;
	}

}
