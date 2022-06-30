package gestion;

public class Principal {

	public static void main(String[] args) {

		// declarar persona e instanciar:
		Persona p1 = new Persona();

		Persona p2; // declaro
		p2 = new Persona("María", "Sánchez", 27, "Mujer", 65, 170);// instancio

		Persona p3 = p2; // Referencio p3 a p2, son iguales y si se modifica uno el otro tb.

		Persona copia = new Persona(p2);

		System.out.println("La persona 2 es: ");
		p2.mostrar();

		System.out.println("La edad de p3 es: " + p3.getEdad());

		p3.setEdad(24);

		System.out.println("La edad de p3 es: " + p3.getEdad());

		p3.setEdad(-34);

		System.out.println("La edad de p3 es: " + p3.getEdad());

		if (p3.esMayorDeEdad()) {
			System.out.println(p3.getNombre() + " es mayor de edad");
		} else {
			System.out.println(p3.getNombre() + " no es mayor de edad");
		}

	}

}
