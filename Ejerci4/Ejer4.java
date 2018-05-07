package Ejerci4;

public class Ejer4 {

    private int i = 1;
    private int r = 5;
    
public void TablaDel5() {
    for (i = 1; i < 11; i++)
    {
      System.out.print("5x");
      System.out.print(i);
      System.out.print("=");
      System.out.print(r);
      System.out.print("\n");
      r += 5;
    }
}
 
public static void main(String[] ar){
	Ejer4 prueba1 = new Ejer4();
    prueba1.TablaDel5();
  }
}