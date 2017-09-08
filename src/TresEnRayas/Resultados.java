package TresEnRayas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Resultados extends JFrame{
	
	JButton Reanudar;
	Juego game;
	
	public Resultados(int perdedor, Image jug1, Image jug2){
		setTitle("Resultado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.decode("#0D47A1"));
		setBounds(500,300,400,600);
		
		Reanudar = new JButton("Reanudar");
		Reanudar.setBounds(100,450, 200,100);
		add(Reanudar);
		
		
		
		
		int perd = perdedor;
		int gan = -1;
		if(perd == 1){
			gan = 2;
		}
		else{
			gan = 1;
		}
		
		add(new panelresultados(perd, gan, jug1, jug2));
		
		Reanudar.addActionListener(new ActionListener(){
			

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				game.Resetear();
				setVisible(false);
				
			}
		});
		
		
		
		setVisible(true);
	}
	
	
	
	public class panelresultados extends JPanel{
		
		private int perd,  gan;
		private Image iganador,  iperdedor;
		
		public panelresultados(int perdedor, int ganador, Image jug1, Image jug2){
			
			setBackground(Color.BLACK);
			
			perd = perdedor;
			gan = ganador;
			
			if(ganador ==1){
				iganador = jug1;
				iperdedor = jug2;
			}
			else{
				iganador = jug2;
				iperdedor = jug1;
			}
			
			repaint();
			
		}
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			
			
			if(perd != 0){// alguien ha ganado
				Font myFont = new Font ("Courier New", 1, 30);
				
				g.setColor(Color.decode("#E53935"));
				g.fillRect(0, 0, 400, 200);
				g.drawImage(iganador,0,0,200,200,this);
				g.setColor(Color.black);
				g.setFont(myFont);
				g.drawString("Ganador", 200, 100);
				
				g.setColor(Color.decode("#8E24AA"));
				g.fillRect(0, 200, 400, 200);
				g.drawImage(iperdedor,0,200,200,200,this);
				g.setColor(Color.black);
				g.setFont(myFont);
				g.drawString("Perdedor", 200, 300);
				
				
			}
			
			else{
				Font myFont = new Font ("Courier New", 1, 30);
				g.setFont(myFont);
				g.setColor(Color.WHITE);
				g.drawString("Empate", 150, 200);
				
				
			}
		}
		
	}
	
	public void setJuego(Juego g){
		game=g;
		
	}

}
