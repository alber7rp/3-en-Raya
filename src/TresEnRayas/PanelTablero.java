package TresEnRayas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelTablero extends JPanel {
	
	Juego G;
	
	public Image j1, j2;
	private Vector<Image> imagenes;
	private Vector<Integer> X;
	private Vector<Integer> Y;
	private PanelJugadores pj;
	public Point p1,p2; //Puntos para crear la raya cuando haya resultado
	
	
	
	
	public PanelTablero(){
		setBackground(Color.decode("#00BCD4"));
		System.out.println("Panel creado de tama�o " + this.getWidth() + " " + this.getHeight() );
		cargarimagenes();
		
		imagenes = new Vector<Image>();
		X = new Vector<Integer>();
		Y = new Vector<Integer>();
		
		this.addMouseListener(new MouseListener(){
			public void mouseClicked(MouseEvent e){
				
				System.out.println("Clicked on " + e.getX() + " " + e.getY());
				
				DepurarEventoClicked(e);
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		p1 = new Point(0,0);
		p2 = new Point(0,0);
		
		
	}
	
	public void DepurarEventoClicked(MouseEvent e){
		
		int x = e.getX();
		int y = e.getY();
		boolean jugado = false; //auxiliar para evitar que un jugador cambie la ficha en una posicion ya ocupada
		
		if(((0 < x) && (x < 250)) && ((0 < y) && (y < 200)) && (G.getTabla()[0][0] == 0)){
			jugado=true;
			G.getTabla()[0][0] = G.getJugadorActual();
			if(G.getJugadorActual()==1){
				imagenes.add(j1);
			}
			else{
				imagenes.addElement(j2);
			}
			X.add(50);
			Y.add(50);
			G.cambiarJugador();
			
		}
		
		if(((250 < x) && (x < 450)) && ((0 < y) && (y < 200))&& (G.getTabla()[0][1] == 0)){
			jugado=true;
			G.getTabla()[0][1] = G.getJugadorActual();

			if(G.getJugadorActual()==1){
				imagenes.add(j1);
			}
			else{
				imagenes.addElement(j2);
			}
			X.add(250);
			Y.add(50);
			
			G.cambiarJugador();
			
		}
		
		if(((450 < x) ) && ((0 < y) && (y < 200))&&(G.getTabla()[0][2] == 0)){
			jugado=true;
			G.getTabla()[0][2] = G.getJugadorActual();
			
			if(G.getJugadorActual()==1){
				imagenes.add(j1);
			}
			else{
				imagenes.addElement(j2);
			}
			X.add(450);
			Y.add(50);
			
			G.cambiarJugador();
			
		}
		
		if(((0 < x) && (x < 250)) && ((200 < y) && (y < 350))&& (G.getTabla()[1][0] == 0)){
			jugado=true;
			G.getTabla()[1][0] = G.getJugadorActual();
			
			if(G.getJugadorActual()==1){
				imagenes.add(j1);
			}
			else{
				imagenes.addElement(j2);
			}
			X.add(50);
			Y.add(200);
			
			G.cambiarJugador();
			
		}
		
		if(((250 < x) && (x < 450)) && ((200 < y) && (y < 350))&& (G.getTabla()[1][1] == 0)){
			jugado=true;
			G.getTabla()[1][1] = G.getJugadorActual();
			
			if(G.getJugadorActual()==1){
				imagenes.add(j1);
			}
			else{
				imagenes.addElement(j2);
			}
			X.add(250);
			Y.add(200);
			
			G.cambiarJugador();
			
		}
		
		if(((450 < x)) && ((200 < y) && (y < 350))&& (G.getTabla()[1][2] == 0)){
			jugado=true;
			G.getTabla()[1][2] = G.getJugadorActual();
			
			if(G.getJugadorActual()==1){
				imagenes.add(j1);
			}
			else{
				imagenes.addElement(j2);
			}
			X.add(450);
			Y.add(200);
			
			G.cambiarJugador();
			
		}
		
		if(((0 < x) && (x < 250)) && ((350 < y) )&& (G.getTabla()[2][0] == 0)){
			jugado=true;
			G.getTabla()[2][0] = G.getJugadorActual();
			
			if(G.getJugadorActual()==1){
				imagenes.add(j1);
			}
			else{
				imagenes.addElement(j2);
			}
			X.add(50);
			Y.add(350);
			
			G.cambiarJugador();
			
		}
		
		if(((250 < x) && (x < 450)) && ((350 < y) )&& (G.getTabla()[2][1] == 0)){
			jugado=true;
			G.getTabla()[2][1] = G.getJugadorActual();
			
			if(G.getJugadorActual()==1){
				imagenes.add(j1);
			}
			else{
				imagenes.addElement(j2);
			}
			X.add(250);
			Y.add(350);
			
			G.cambiarJugador();
			
		}
		
		if(((450 < x)) && ((350 < y) )&& (G.getTabla()[2][2] == 0)){
			
			jugado=true;
			
			G.getTabla()[2][2] = G.getJugadorActual();
			
			if(G.getJugadorActual()==1){
				imagenes.add(j1);
			}
			else{
				imagenes.addElement(j2);
			}
			X.add(450);
			Y.add(350);
			
			G.cambiarJugador();
			
		}
		
		if( jugado == true){
		
		pj.cambiarturno(G.getJugadorActual()); //cambia turno y repinta el panel de los jugadores
		repaint(); //llamamos a repaint de este panel, el del tablero para pintar imagenes y lineas necesarias
		
		
		
		
		imprimirtabla();
		
		if(G.comprobarJuego() == true){
			Resultados Re = new Resultados(G.jugador_actual, j1, j2);
			Re.setJuego(G);
			repaint(); //para crear la linea
		}
		
		}
		
		
		
		
		
		
		
		
		
	}
	
	public void imprimirtabla(){
		System.out.println();
		
		for(int i=0; i < 3; i++){
			for(int j=0; j<3; j++){
				System.out.print(G.getTabla()[i][j]);
			}
			System.out.println();
		}
	}
	
	public void setJuego(Juego juego){
		
		G = juego;
		
	} 
	
	public void paintComponent(Graphics g){
		super.paintComponent(g); //el metodo super es para que se pinte otros objetos de la clase padre, como por ejemplo el background
		System.out.println("Llamando a metodo paint del tablero" + this.getPreferredSize());

		pintarlineas(g);
		pintarimagenes(g);
		pintarRectaFinal(g);
		
	}
	
	
	public void pintarRectaFinal(Graphics g){
		g.setColor(Color.WHITE);
		g.drawLine(p1.x, p1.y, p2.x, p2.y);
	}
	
	public void pintarlineas(Graphics g){
		

		g.setColor(Color.decode("#3F51B5"));
		
		//Verticales
		g.drawLine(250, 50, 250, 500);
		g.drawLine(450, 50, 450, 500);
		
		//Horizontales
		g.drawLine(50, 200, 650, 200);
		g.drawLine(50, 350, 650, 350);
	}
	
	public void pintarimagenes(Graphics g){
		
		for(int i=0; i<imagenes.size(); i++){
			g.drawImage(imagenes.get(i), X.get(i), Y.get(i), 200, 150, this);
		}
	}
	
	
	public void setJugadores(PanelJugadores j){
		pj = j;
	}
	
	
	
	public void cargarimagenes(){
		j1 = new ImageIcon(getClass().getResource("Homer.jpg")).getImage();
		j2 = new ImageIcon(getClass().getResource("Mario-Pixel.jpg")).getImage();
		
		System.out.println("Im�genes cargadas");
	}

	public void resetear() {
		imagenes = new Vector<Image>();
		X = new Vector<Integer>();
		Y = new Vector<Integer>();
		pj.cambiarturno(G.getJugadorActual());
		p1 = new Point(0,0);
		p2 = new Point(0,0);
		repaint(); //restauramos la pantalla con los nuevos valores
	}

}
