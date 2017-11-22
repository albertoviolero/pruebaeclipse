package prueba;

import modelo.Persona;

public class App {

	public static void main(String[] args) {
		
		
		Persona p = new Persona("pepe","sanchez");
		
		System.out.println("El nombre es : "+ p.dameElNombre(p));
		System.out.println("El apellido es: " + p.getApellido());
	}

}
