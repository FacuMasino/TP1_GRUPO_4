package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// Punto 5
		Empleado empleado1 = new Empleado();
		System.out.println(empleado1.toString());
		System.out.println("\nEl pr�ximo ID a asignar ser�: " + Empleado.devuelveProximoId() + "\n");
	}

}
