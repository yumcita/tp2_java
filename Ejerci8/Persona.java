package Ejerci8;

import java.util.Scanner;

public class Persona {
		protected Scanner teclado;
	    protected String nombre;
	    protected int edad;
	    public Persona() {
	        teclado=new Scanner(System.in);
	    }
	    
	    public void Cargar_Datos_Personales() {
	        System.out.print("Ingrese el nombre:");
	        nombre=teclado.next();
	        System.out.print("Ingrese edad:");
	        edad=teclado.nextInt();
	    }
	    
	    public void Imprimir_Datos_Personales() {
	        System.out.println("Nombre:"+nombre);
	        System.out.println("Edad:"+edad);
	    }
}
