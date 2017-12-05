package com.dani.listafiesta;

public class Personas 
{
	private String nombrecompleto;
	
	public Personas(String nombrecompleto)
	{
		this.nombrecompleto = nombrecompleto;
	}

	public String toString()
	{
		return nombrecompleto + ".";
	}
	
	public String getNombrecompleto() {
		return nombrecompleto;
	}

	public void setNombrecompleto(String nombrecompleto) {
		this.nombrecompleto = nombrecompleto;
	}

}
