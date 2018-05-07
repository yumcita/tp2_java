package Ejerci2;

import java.util.Scanner;

public class Ejer2 {
	private Scanner teclado;
    private int num;

public void IngreseNumero() {
    teclado = new Scanner(System.in);
    System.out.print("Ingresar un numero: ");
    num = teclado.nextInt();
}
public void CalculoDeNumero() {
    if (num < 10) {
        System.out.println(num);
        System.out.println("tiene un solo dígito.");
    }
    else if ((num >= 10) && (num < 100))
    {
      System.out.println(num);
      System.out.println("tiene dos dígitos.");
    }
    else
    {
      System.out.println(num);
      System.out.println("tiene tres o más dígitos.");
    }
}
public static void main(String[] ar){
	Ejer2 prueba1 = new Ejer2();
    prueba1.IngreseNumero();
    prueba1.CalculoDeNumero();
  }
}
