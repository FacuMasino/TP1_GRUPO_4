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
		
	
	}

}
