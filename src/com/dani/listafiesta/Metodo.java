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
		System.out.println("¿Cuántos invitados habrá? (si desea volver a atrás pulse 0)");
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
	
	public void añadirInvitados(String persona)
	{
		System.out.println("¿Cuántas personas va a añadir? (si desea volver a atrás pulse 0)");
		int añadidos;
		añadidos = teclado.nextInt();
		if (añadidos > 0)
		{
			System.out.println("Escriba el nombre y apellidos de la persona/s que quiera añadir:");
	
			for (int i = 0; i <= añadidos; i++)
			{
				persona = teclado.nextLine();
				listaInvitados.add(persona);
			}
		}
	}
	
	public void eliminarInvitados(String persona)
	{
		System.out.println("¿Cuántas personas quiere eliminar? (si desea volver a atrás pulse 0)");
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
		System.out.println("Usted está cerrando el programa.");
		System.out.println("Si está seguro de cerrar el programa pulse 0.");
	}
	

}
