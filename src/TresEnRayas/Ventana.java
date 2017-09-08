package TresEnRayas;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class Ventana extends JFrame {
	
	public Ventana(){
		setBounds(300,50,700,800);
		setTitle("				3 en Raya");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1,1));
		
		
		add(new PanelPrincipal());
		
		
		
		setVisible(true);
	}

}
