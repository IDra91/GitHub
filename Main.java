

package tarea3;
import java.util.Scanner;



public class Main {

    
    public static void main(String[] args) {
       int n=0;
       Scanner s= new Scanner(System.in);
       System.out.println("Por favor ingrese un número");
       n= s.nextInt();
       if (n%2 == 0){
           System.out.println("El número es par");
       }
        else
            System.out.println("El número es impar");
    }

}
