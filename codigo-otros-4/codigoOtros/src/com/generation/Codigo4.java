package com.generation;

// El siguiente codigo es un juego de piedra, papel o tijera. Cada jugador tiene un turno donde debe elegir su movimiento escribiendolo en la consola y entonces se determinara al ganador

// Se importa Scanner
import java.util.Scanner;

public class Codigo4 {
	// Se coloca todo dentro de un método main
	 public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // Se añade System.in
	    
		// Se cambia .print -> .println para crear una nueva línea
		System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    // Se cambia .print -> .println para crear una nueva línea
	    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    // Se comenta la creación de un segundo Scanner
	    //Scanner s2 = new Scanner(); 
	    String j2 = s.nextLine();
	    
	    // Se elimina un parentesis ")" extra
	    // Se cambia j1 == j2 -> j1.equals(j2) para evaluar Strings
	    if (j1.equals(j2)) {
	      System.out.println("Empate");
	    } else {
	      int g;
	      switch(j1) {
	        case "piedra":
	        	// Se cambia lac comparacion "==" para datos númericos por .equals() que funciona en String
	          if (j2.equals("tijeras")) {
	            g = 1;
	          } // if piedra
	          break; // Se añade el break al case
	
	        case "papel":
	          if (j2.equals("piedra")) {
	            g = 1;
	          } // if
	          break; // Se añade el break al case
	          
	        // Se cambia "tijera" -> "tijeras"
	        case "tijeras":
	          if (j2.equals("papel")) {
	            g = 1;
	          } // if tijera
	          break; // Se cambia el break de lugar para que este dentro del case
	          
	        default:
	        	System.out.println("Se ingreso al menos un valor no valido. Intenta de nuevo");
	      } // switch
	      // Se comenta la siguiente linea
//	      System.out.println("Gana el jugador " + g);
	    } // else
	} // Main
} // Class Codigo4


