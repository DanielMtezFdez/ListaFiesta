package com.dani.listafiesta;
import java.util.Scanner;

import javax.jws.soap.SOAPBinding;

public class Programa 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		Metodo listainvitados = new Metodo();
		
		int respuesta = 1;
		do
		{
			//Pantalla principal en la que seleccionar el camino.
			System.out.println(" ==================================================");
			System.out.println("|================ ELIJA UNA OPCION ================|");
			System.out.println("|==================================================|");
			System.out.println("|--------------------------------------------------|");
			System.out.println("| 1 -> Crear una nueva lista de invitados          |");
			System.out.println("|--------------------------------------------------|");
			System.out.println("| 2 -> Visualizar la lista de invitados            |");
			System.out.println("|--------------------------------------------------|");
			System.out.println("| 3 -> Añadir personas a la lista de invitados     |");
			System.out.println("|--------------------------------------------------|");
			System.out.println("| 4 -> Eliminar personas de la lista de invitados  |");
			System.out.println("|--------------------------------------------------|");
			System.out.println("| 0 -> Cerrar el programa                          | ");
			System.out.println(" ==================================================");
			
			int seleccion = teclado.nextInt();
			String nada = teclado.nextLine();
			
			switch (seleccion)
			{
			case 0:
			{
				listainvitados.cerrarPrograma();
				break;
			}
			
			case 1:
			{
				listainvitados.crearListaInvitados();
				break;
			}
			case 2:
			{
				listainvitados.visualizarLista();
				break;
			}
			case 3:
			{
				listainvitados.añadirInvitados();
				break;
			}
			case 4:
			{
				listainvitados.eliminarInvitados();
			}
			}
				
		}while (respuesta != 0);
		
		System.out.println("El programa se ha cerrado");
		teclado.close();
	}

}
