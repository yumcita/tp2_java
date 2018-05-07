package Ejerci1;

import java.util.Scanner;

	public class Ejer1 {
	private Scanner teclado;
    private int cantidad;
    private float precio;
    private float resultado;

public void Ingresos() {
    teclado = new Scanner(System.in);
    System.out.print("Ingrese la cantidad de productos: ");
    cantidad = teclado.nextInt();
    System.out.print("Ingrese el precio: ");
    precio = teclado.nextFloat();
    }
public void Calculo() {
    resultado = cantidad * precio;
    System.out.print("El cliente debe pagar: $" +resultado);
    }
public static void main(String[] ar){
	Ejer1 prueba1 = new Ejer1();
    prueba1.Ingresos();
    prueba1.Calculo();
    }
}
