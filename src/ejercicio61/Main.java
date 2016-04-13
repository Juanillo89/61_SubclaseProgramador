package ejercicio61;

import java.util.Scanner;
import ejercicio55.Empleado;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Empleado[] trabajadores = new Empleado[2];
		String nombre;
		String telefono;
		String[] lenguajes;
		int numLenguajes = 0;
		for (int i = 0; i < trabajadores.length; i++)
		{
			System.out.print("Nombre del trabajador: ");
			nombre = sc.nextLine();
			System.out.print("Telefono: ");
			telefono = sc.nextLine();
			System.out.print("¿Cuántos lenguajes de programación conoce?: ");
			numLenguajes = Integer.parseInt(sc.nextLine());
			if(numLenguajes <= 0)
			{
				trabajadores[i] = new Empleado(nombre, telefono);
			}
			else
			{
				lenguajes = new String[numLenguajes];
				for (int j = 0; j < lenguajes.length; j++)
				{
					System.out.print("Lenguaje " + (j + 1) + ": ");
					lenguajes[j] = sc.nextLine();
				}
				trabajadores[i] = new Programador(nombre, telefono, lenguajes);
			}
		}
		sc.close();
		System.out.println("               Trabajadores");
		System.out.println("------------------------------------------");
		System.out.println("Nombre\tTelefono\tLenguajes");
		for (int i = 0; i < trabajadores.length; i++)
		{
			// ¿El trabajador en la posicion i es un programador?
			if(!(trabajadores[i] instanceof Programador))
			{
				System.out.println(trabajadores[i].getNombre() + "\t" + trabajadores[i].getTelefono());
			}
			else
			{
				System.out.print(trabajadores[i].getNombre() + "\t" + trabajadores[i].getTelefono());
				System.out.print("\t");
				for (int j = 0; j < ((Programador) trabajadores[i]).getLenguajes().length; j++)
				{
					System.out.print(((Programador) trabajadores[i]).getLenguajes()[j] + " ");
				}
				System.out.println();
			}
		}           
	}
}
