package ejerciciosobjetos;
import java.util.Scanner;
public class EjerciciosObjetos0615 {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int ContadorTiradas = 0;
        int dineroTotal = 10000;
        final int cantidadApostar = 1;

        boolean apostar;
        
        Ruleta ruleta = new Ruleta();

        
        for (int i = 0; i < 10000; i++) {
            
            if (dineroTotal > 0) {
                apostar  = ruleta.apostar(cantidadApostar);
            } else break;
            
            if (apostar) dineroTotal += cantidadApostar;
            else dineroTotal -= cantidadApostar;
            
            ContadorTiradas++;

        }
        
        System.out.println("Despues de "+ContadorTiradas+" apuestas al par tenemos "+dineroTotal+" euros");
       
    }////// fin main
}///////// fin class
