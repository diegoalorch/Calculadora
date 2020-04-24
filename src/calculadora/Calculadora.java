package calculadora;

import java.util.Scanner;

class Calculadora {
	public static Scanner teclado = new Scanner(System.in);
	
	public static void suma() {
		int a;
		int b;
		int valor;
		
		System.out.print("Ingrese primer número: ");
		a = teclado.nextInt();
		System.out.print("Ingrese segundo número: ");
		b = teclado.nextInt();
		
		valor = a + b;
		
		System.out.println("La suma total de: " + a + "+" + b + "=" + valor);
	}
	
	public static void resta() {
		int a;
		int b;
		int valor;
		
		System.out.print("Ingrese primer número: ");
		a = teclado.nextInt();
		System.out.print("Ingrese segundo número: ");
		b = teclado.nextInt();
		
		valor = a - b;
		
		System.out.println("La resta total de: " + a + "-" + b + "=" + valor);
	}
	
	public static void multiplicacion() {
		int a;
		int b;
		int valor;
		
		System.out.print("Ingrese primer número: ");
		a = teclado.nextInt();
		System.out.print("Ingrese segundo número: ");
		b = teclado.nextInt();
		
		valor = a * b;
		
		System.out.println("La multiplicación total de: " + a + "x" + b + "=" + valor);
	}
	
	public static void division() {
		int a;
		int b;
		float valor;
		
		System.out.print("Ingrese primer número: ");
		a = teclado.nextInt();
		System.out.print("Ingrese segundo número: ");
		b = teclado.nextInt();
		
		valor = a / b;
		
		System.out.println("La multiplicación total de: " + a + "/" + b + "=" + valor);
	}
	
	public static void salir() {
		System.out.println("Gracias por su visita Ingeniero Reyna");
	}
	
	public static void error() {
		System.out.println("Error 404");
	}
	
	public static void menu() {
		System.out.println("**** CALCULADORA ****");
		System.out.println("[1] Suma");
		System.out.println("[2] Resta");
		System.out.println("[3] Multiplicación");
		System.out.println("[4] División");
		System.out.println("[5] Salir");
		System.out.print("Ingrese opción del [1-5]: ");
	}
	
	public static void main(String [] args) {
		int opcion;
		do {
			menu();
			opcion=teclado.nextInt();
			
			switch (opcion) {
			case 1:
				suma();
				break;
			case 2:
				resta();
				break;
			case 3:
				multiplicacion();
				break;
			case 4:
				division();
				break;
			case 5:
				salir();
				break;
			default:
				error();
				break;
			}
		} while (opcion!=5);
	}
}
