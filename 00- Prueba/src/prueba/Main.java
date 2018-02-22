package prueba;

import java.util.Scanner;

public class Main 
{
	
    public static void main(String[] arg) 
    {
    	int numero1;
    	int numero2;
    	
    	
    	Scanner scan =new Scanner(System.in);
    	
    	System.out.println("prueba");
    	
    	System.out.println("Ingrese Numero 1:");
    	numero1=scan.nextInt();
    	
    	System.out.println("Ingrese Numero 2: ");
    	numero2=scan.nextInt();
    	
    	System.out.println("El Numero 1 es... "+numero1);
    	System.out.println("El Numero 2 es... "+numero2);
    	
    }

}
