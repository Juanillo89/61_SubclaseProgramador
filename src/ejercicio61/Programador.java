package ejercicio61;

import ejercicio55.Empleado;

public class Programador extends Empleado
{
	private String[] lenguajes;

	public Programador(String nombre, String telefono, String ... lenguajes)
	{
		super(nombre, telefono);
		this.lenguajes = lenguajes;
	}

	public String[] getLenguajes()
	{
		return lenguajes;
	}
}