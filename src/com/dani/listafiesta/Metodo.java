package com.dani.listafiesta;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Metodo
{
	Scanner teclado = new Scanner(System.in);
	
	private ArrayList<Personas> listado;
	private String nada; //variable para usar despu�s de los nextInt
	
	public Metodo()
	{
		listado = new ArrayList<Personas>();
	}
	
	public void crearListaInvitados()
	{
		System.out.println("�Cu�ntos invitados habr�? (si desea volver a atr�s pulse 0)");
		int totalinvitados;
		totalinvitados = teclado.nextInt();
		nada = teclado.nextLine();
		if (totalinvitados > 0)
		{
			System.out.println("Escriba el nombre y los apellidos de los invitados: ");
			listado.clear();
			for (int i = 0; i < totalinvitados; i++)
			{
				Personas persona = new Personas (teclado.nextLine());
				listado.add(persona);
			}
		}
	}
	
	public void visualizarLista()
	{
		//iterator
		Iterator<Personas> iterador = listado.iterator();
		int i = 1;
	
		while (iterador.hasNext())
		{
			System.out.println("C�digo "+ i + ": " + iterador.next().toString());
			i++;
		}
		
		
	}
	
	public void a�adirInvitados()
	{
		System.out.println("�Cu�ntas personas va a a�adir? (si desea volver a atr�s pulse 0)");
		int a�adidos;
		a�adidos = teclado.nextInt();
		if (a�adidos > 0)
		{
			System.out.println("Escriba el nombre y apellidos de la persona/s que quiera a�adir: ");
	
			for (int i = 0; i < a�adidos; i++)
			{
				Personas persona = new Personas(teclado.nextLine());
				listado.add(persona);
			}
		}
	}
	
	public void eliminarInvitados()
	{
		int eliminar;
		System.out.println("Escriba el c�digo de invitado de la persona que desea eliminar ");
		System.out.println("Cuando desee volver a atr�s pulse 0 ");
		do
		{
			eliminar = teclado.nextInt();
			listado.remove(0);
		}
		while(eliminar != 0);
	}
	
	public void cerrarPrograma()
	{
		System.out.println("Cerrando...");
		System.out.println("El programa se ha cerrado");
		System.exit(0);
	}
	

}
