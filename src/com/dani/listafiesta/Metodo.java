package com.dani.listafiesta;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Metodo
{
	Scanner teclado = new Scanner(System.in);
	
	private ArrayList<Personas> listado;
	private String nada; //variable para usar después de los nextInt
	
	public Metodo()
	{
		listado = new ArrayList<Personas>();
	}
	
	public void crearListaInvitados()
	{
		System.out.println("¿Cuántos invitados habrá? (si desea volver a atrás pulse 0)");
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
			System.out.println("Código "+ i + ": " + iterador.next().toString());
			i++;
		}
		
		
	}
	
	public void añadirInvitados()
	{
		System.out.println("¿Cuántas personas va a añadir? (si desea volver a atrás pulse 0)");
		int añadidos;
		añadidos = teclado.nextInt();
		if (añadidos > 0)
		{
			System.out.println("Escriba el nombre y apellidos de la persona/s que quiera añadir: ");
	
			for (int i = 0; i < añadidos; i++)
			{
				Personas persona = new Personas(teclado.nextLine());
				listado.add(persona);
			}
		}
	}
	
	public void eliminarInvitados()
	{
		int eliminar;
		System.out.println("Escriba el código de invitado de la persona que desea eliminar ");
		System.out.println("Cuando desee volver a atrás pulse 0 ");
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
