package com.dani.listafiesta;
import java.util.ArrayList;
import java.util.Scanner;

public class Metodo 
{
	Scanner teclado = new Scanner(System.in);
	
	private ArrayList<String> listaInvitados;
	
	public Metodo()
	{
		listaInvitados = new ArrayList<String>();
	}
	
	public void crearListaInvitados(String persona)
	{
		System.out.println("�Cu�ntos invitados habr�? (si desea volver a atr�s pulse 0)");
		int totalInvitados;
		totalInvitados = teclado.nextInt();
		if (totalInvitados > 0)
		{
			System.out.println("Escriba el nombre y los apellidos de los invitados:");
			listaInvitados.clear();
			for (int i = 0; i <= totalInvitados; i++)
			{
				persona = teclado.nextLine();
				listaInvitados.add(persona);
			}
		}
	}
	
	public void visualizarLista()
	{
		System.out.println("Lista de invitados:");
		for (int i = 1; i < listaInvitados.size(); i++)
		{
			System.out.println("- " + listaInvitados.get(i));
		}
	}
	
	public void a�adirInvitados(String persona)
	{
		System.out.println("�Cu�ntas personas va a a�adir? (si desea volver a atr�s pulse 0)");
		int a�adidos;
		a�adidos = teclado.nextInt();
		if (a�adidos > 0)
		{
			System.out.println("Escriba el nombre y apellidos de la persona/s que quiera a�adir:");
	
			for (int i = 0; i <= a�adidos; i++)
			{
				persona = teclado.nextLine();
				listaInvitados.add(persona);
			}
		}
	}
	
	public void eliminarInvitados(String persona)
	{
		System.out.println("�Cu�ntas personas quiere eliminar? (si desea volver a atr�s pulse 0)");
		int eliminados;
		eliminados = teclado.nextInt();
		if (eliminados > 0)
		{
			System.out.println("Escriba el nombre y apellidos de la persona/s que quiera eliminar");
			for (int i = 0; i <= eliminados; i++)
			{
				persona = teclado.nextLine();
				listaInvitados.remove(persona);
			}
		}	
	}
	
	public void cerrarPrograma()
	{
		System.out.println("Usted est� cerrando el programa.");
		System.out.println("Si est� seguro de cerrar el programa pulse 0.");
	}
	

}
