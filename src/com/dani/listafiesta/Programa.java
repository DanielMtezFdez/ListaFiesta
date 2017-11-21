package com.dani.listafiesta;
import java.util.Scanner;

public class Programa 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		Metodo invitado = new Metodo();
		
		int respuesta = 1;
		while (respuesta  == 1)
		{
			//Pantalla principal en la que seleccionar el camino.
			System.out.println("Teclee el n�mero para seleccionar una opci�n: ");
			System.out.println("Para crear una nueva lista de invitados: 1");
			System.out.println("Para visualizar la lista de invitados: 2");
			System.out.println("Para a�adir personas a la lista de invitados: 3");
			System.out.println("Para eliminar personas de la lista de invitados: 4");
			System.out.println("Para cerrar el programa: 0");
			
			int seleccion = teclado.nextInt();
			
			switch (seleccion)
			{
			case 0:
			{
				invitado.cerrarPrograma();
				break;
			}
			
			case 1:
			{
				invitado.crearListaInvitados("");
				System.out.println("Si desea hacer algo m�s pulse 1.");
				System.out.println("Si quiere cerrar el programa pulse 0.");
				break;
			}
			case 2:
			{
				invitado.visualizarLista();
				System.out.println("Si desea hacer algo m�s pulse 1.");
				System.out.println("Si quiere cerrar el programa pulse 0.");
				break;
			}
			case 3:
			{
				invitado.a�adirInvitados("");
				System.out.println("Si desea hacer algo m�s pulse 1.");
				System.out.println("Si quiere cerrar el programa pulse 0.");
				break;
			}
			case 4:
			{
				invitado.eliminarInvitados("");
				System.out.println("Si desea hacer algo m�s pulse 1.");
				System.out.println("Si quiere cerrar el programa pulse 0.");
			}
			}
			
			respuesta = teclado.nextInt();	
		}
		
		System.out.println("El programa se ha cerrado");
		teclado.close();
	}

}
