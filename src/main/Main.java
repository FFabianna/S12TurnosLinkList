package main;

import java.util.Scanner;

import model.NodeTurn;
import model.List;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static List list = new List();
	
	public static void main(String[] args) {
		
	       
	       boolean salir = false;
	       int opcion; 
	       
	       while(!salir){
	    	   System.out.println("    MENU ");
	           System.out.println("1. Dar turno");
	           System.out.println("2. Mostrar turno");
	           System.out.println("3. Pasar turno");
	           System.out.println("4. Eliminar turno actual");
	           System.out.println("5. Salir");
	            
	           System.out.println("¿qué desea hacer?");
	           opcion = sc.nextInt();
	            
	           switch(opcion){
	               case 1:
	                   System.out.println("DAR TURNO");
	                   DarTurno();
	                   
	                   break;
	               case 2:
	                   System.out.println("MOSTRAR TURNO");
	                   MostrarTurno();
	                   break;
	                case 3:
	                   System.out.println("PASAR TURNO");
	                   PasarTurno();
	                   
	                   break;
	                case 4:
		               System.out.println("ELIMINAR TURNO");
		               EliminarTurno();
		                   
		                   break;
	                case 5:
	                   salir=true;
	                   break;
	                default:
	                   System.out.println("Solo números entre 1 y 5");
	           }
	            
	       }
	         
	    }
	

	private static void EliminarTurno() {
		boolean eliminar = list.delete();
		
		if(eliminar) {
			System.out.println("Se borro exitosamente\n");
		}else {
			System.out.println("error\n");
		}
		
	}


	private static void PasarTurno() {
		System.out.println("El turno se ha pasado\n");
		list.pass();
	}


	private static void MostrarTurno() {
		System.out.println("El turno siguiente es: \n");
		list.print();
	}


	private static void DarTurno() {
		list.add();
		System.out.println("Turno asignado\n");	
	}

}
