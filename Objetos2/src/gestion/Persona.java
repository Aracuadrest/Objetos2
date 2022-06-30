package gestion;

public class Persona {

	// Variables miembro/estado del objeto
	private String nombre;
	private String apellidos;
	private int edad;
	private String sexo; // Hombre o Mujer
	private double peso;
	private double altura;

	// constructores
	// tb se pueden dar valores inicializados
	public Persona() {
		edad = 0;
		nombre = "no inicializado";
	}

	/**
	 * Constructor de la clase que crea una persona dada su nombre y apellidos
	 * 
	 * @param n String nombre de la persona
	 * @param a String apellidos de la persona
	 */
	public Persona(String n, String a) {
		nombre = n;
		apellidos = a;
	}

	public Persona(String nombre, String apellidos, int edad, String sexo, double peso, double altura) {
		super();
		// this: referencia al propio objeto ej:p1
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	// Constructor de copia
	public Persona(Persona p) {
		this.nombre = p.nombre;
		this.apellidos = p.apellidos;
		this.edad = p.edad;
		this.sexo = p.sexo;
		this.peso = p.peso;
		this.altura = p.altura;

	}

	// Método imprimir datos
	public void mostrar() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Edad: " + edad);
		System.out.println("Sexo: " + sexo);
		System.out.println("Peso: " + this.peso);
		System.out.println("Altura: " + altura);
	}

	// Métodos getters y setters (de acceso y establecimiento)
	public int getEdad() {
		return this.edad;
	}

	/**
	 * Método de la clase que establece la edad de la persona Si la edad es negativa
	 * no se actualiza
	 * 
	 * @param edad int con el valor nuevo de edad
	 */
	public void setEdad(int edad) {
		if (edad >= 0) {
			this.edad = edad;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public boolean esMayorDeEdad() {
		if (this.edad >= 18) {
			return true;
		}
		return false;
		// return edad>=18;
	}

	public double calculaIMC() {
		double imc = this.peso / Math.pow(altura / 100, 2);
		return imc;

	}
	public String estadoPeso() {
		if (this.calculaIMC()<20) {
			return "Peso Bajo";			
		}else if (this.calculaIMC()>=20 && this.calculaIMC()<=25) {
			return "Peso Ideal";
		}else {
			return "Sobrepeso";
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", sexo=" + sexo
				+ ", peso=" + peso + ", altura=" + altura + "]";
	}
	
	
	
}
