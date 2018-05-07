package Ejerci5;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        int suma,valor;
        suma=0;
        do {
            System.out.print("Ingrese un valor numerico: ");
            valor=teclado.nextInt();
            if (valor!=9999) {
                suma=suma+valor;
            }
        }while (valor!=9999);
        System.out.print("El valor total es: ");
        System.out.print(suma);
        System.out.print(". \n");
        if (suma==0) {
            System.out.print(suma); 
            System.out.print(" el valor da cero.");
        } else {
            if (suma>0) {
                System.out.print(suma); 
                System.out.print(" es un numero positivo.");
            } else {
                System.out.print(suma); 
                System.out.print(" es un numero negativo.");
            }
        }
        teclado.close();}
}
