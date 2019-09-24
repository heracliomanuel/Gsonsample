import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Persona {
	String nombre,apellidos;
	Integer edad;
	
/*public static void main(String[] args) {
		
		Persona p = new Persona();
}*/
	
	public Persona() {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Dame el nombre de la persona  ");
		nombre=entrada.nextLine();
		
		System.out.print("Dame el apellido de la persona  ");
		apellidos=entrada.nextLine();
		
	
		System.out.print("Dame la edad de la persona  ");
		edad=(int)entrada.nextInt();
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String nombrej = gson.toJson(nombre);
		System.out.println("Nombre "+nombrej);
		Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
		String apellidosj = gson.toJson(apellidos);
		System.out.println("Apellidos: "+apellidosj);
		Gson gson3 = new GsonBuilder().setPrettyPrinting().create();
		String edadj = gson.toJson( edad);
		System.out.println("Edad "+edadj);

		

		
	}
	
}
