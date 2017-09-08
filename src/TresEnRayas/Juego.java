package TresEnRayas;

import java.util.Random;

public class Juego {
	
	int tabla [][];
	int jugador_actual;
	PanelTablero tablero;
	
	
	public Juego(){
		
		Random rnd = new Random();
		jugador_actual = (int)(rnd.nextDouble() * 2 + 1);
		
		tabla = new int[3][3]; // 0 -> vacio   1 -> jugador 1    2 -> jugador 2
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				tabla[i][j] = 0;
			}
			
			
		}
		
	}
	
	public void setJugadorActual(int i){
		jugador_actual = i;
	}
	
	public int getJugadorActual(){
		return jugador_actual;
	}
	
	public void cambiarJugador(){
		if( jugador_actual == 1){
			jugador_actual = 2;
		}
		else{
			jugador_actual = 1;
		}
	}
	
	
	public int[][] getTabla(){
		return tabla;
	}
	
	

	public boolean comprobarJuego() {
		
		System.out.println("Comprobando juego ...");
		
		// Lineas horizontales
		
		if(((tabla[0][0] == 1)&&(tabla[0][1] == 1)&&(tabla[0][2] == 1)) || ((tabla[0][0] == 2)&&(tabla[0][1] == 2)&&(tabla[0][2] == 2))){
			System.out.println("Juego acabado linea horizontal ");
			tablero.p1.x = 20;
			tablero.p1.y = 100;
			tablero.p2.x = 680;
			tablero.p2.y = 100;
			
			
			return true;
		}
		
		if(((tabla[1][0] == 1)&&(tabla[1][1] == 1)&&(tabla[1][2] == 1)) || ((tabla[1][0] == 2)&&(tabla[1][1] == 2)&&(tabla[1][2] == 2))){
			System.out.println("Juego acabado linea horizontal");
			
			tablero.p1.x = 20;
			tablero.p1.y = 250;
			tablero.p2.x = 680;
			tablero.p2.y = 250;
			
			return true;
		}
		
		if(((tabla[2][0] == 1)&&(tabla[2][1] == 1)&&(tabla[2][2] == 1)) || ((tabla[2][0] == 2)&&(tabla[2][1] == 2)&&(tabla[2][2] == 2))){
			System.out.println("Juego acabado linea horizontal");
			
			tablero.p1.x = 20;
			tablero.p1.y = 450;
			tablero.p2.x = 680;
			tablero.p2.y = 450;
			
			return true;
		}
		
		//Lineas Verticales
		
		if(((tabla[0][0] == 1)&&(tabla[1][0] == 1)&&(tabla[2][0] == 1)) || ((tabla[0][0] == 2)&&(tabla[1][0] == 2)&&(tabla[2][0] == 2))){
			System.out.println("Juego acabado linea vertical");
			
			tablero.p1.x = 100;
			tablero.p1.y = 20;
			tablero.p2.x = 100;
			tablero.p2.y = 550;
			
			return true;
		}
		
		if(((tabla[0][1] == 1)&&(tabla[1][1] == 1)&&(tabla[2][1] == 1)) || ((tabla[0][1] == 2)&&(tabla[1][1] == 2)&&(tabla[2][1] == 2))){
			System.out.println("Juego acabado linea vertical");
			
			tablero.p1.x = 300;
			tablero.p1.y = 20;
			tablero.p2.x = 300;
			tablero.p2.y = 550;
			
			return true;
		}
		
		if(((tabla[0][2] == 1)&&(tabla[1][2] == 1)&&(tabla[2][2] == 1)) || ((tabla[0][2] == 2)&&(tabla[1][2] == 2)&&(tabla[2][2] == 2))){
			System.out.println("Juego acabado linea vertical");
			
			tablero.p1.x = 500;
			tablero.p1.y = 20;
			tablero.p2.x = 500;
			tablero.p2.y = 550;
			
			return true;
		}
		
		//Lineas Diagonales
		
		if(((tabla[0][0] == 1)&&(tabla[1][1] == 1)&&(tabla[2][2] == 1)) || ((tabla[0][0] == 2)&&(tabla[1][1] == 2)&&(tabla[2][2] == 2))){
			System.out.println("Juego acabado");
			
			tablero.p1.x = 20;
			tablero.p1.y = 20;
			tablero.p2.x = 650;
			tablero.p2.y = 500;
			
			return true;
		}
		
		if(((tabla[0][2] == 1)&&(tabla[1][1] == 1)&&(tabla[2][0] == 1)) || ((tabla[0][2] == 2)&&(tabla[1][1] == 2)&&(tabla[2][0] == 2))){
			System.out.println("Juego acabado");
			
			tablero.p1.x = 650;
			tablero.p1.y = 20;
			tablero.p2.x = 20;
			tablero.p2.y = 500;
			
			return true;
		}
		
		//Empate
		
		int vacio= 0;
		
		for(int i=0; i < 3; i++){
			for(int j=0; j < 3; j++){
				if(tabla[i][j] == 0){
					vacio++;
					
				}
			}
		}
		
		if(vacio == 0){
			System.out.println("Empate");
			setJugadorActual(0);
			return true;
		}
		
		
		
		return false;
		
		
		
	}

	public void setTablero(PanelTablero ptablero) {
		
		tablero = ptablero;
		
		
		
	}
	
	public PanelTablero getTablero(){
		return tablero;
	}
	
	public void Resetear(){
		Random rnd = new Random();
		jugador_actual = (int)(rnd.nextDouble() * 2 + 1);
		
		tablero.resetear();
		
		for(int i=0; i < 3; i++){
			for(int j=0; j < 3; j++){
				tabla[i][j] = 0;
					
				}
			}
		
		
		
	}

}
