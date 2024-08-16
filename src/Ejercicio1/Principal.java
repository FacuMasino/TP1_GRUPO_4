package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// Punto 8
		Empleado empleado1 = new Empleado();
		System.out.println(empleado1.toString());
		
		System.out.println("\nEl pr�ximo ID a asignar ser�: " + Empleado.devuelveProximoId() + "\n");
		
		Empleado empleado2 = new Empleado("Ana Clara", 34);
		System.out.println(empleado2.toString()); 
		
		System.out.println("\nEl pr�ximo ID a asignar ser�: " + Empleado.devuelveProximoId() + "\n");
		
		Empleado empleado3 = new Empleado();
		empleado3.setNombre("Maxi");
		empleado3.setEdad(30);
		System.out.println(empleado3.toString());
		
		Empleado empleado4 = new Empleado("Facu", 25);
		System.out.println(empleado4.toString());
		
		Empleado empleado5 = new Empleado();
		System.out.println(empleado5.toString());
	}

}
