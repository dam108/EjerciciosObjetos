package ejerciciosobjetos;
import java.util.Scanner;
public class EjerciciosObjetos0607 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        String pause;
        boolean fin = false;
        TableroGatoRaton juego = new TableroGatoRaton();
        Raton raton = new Raton();
        Gato gato = new Gato();
 
        while (!fin){
            System.out.println("---------- SE MUEVE EL RATON ----------");
            raton.mover();
           // try {Thread.sleep(1000);} catch (InterruptedException e) {}
            juego.pintarTablero();
            pause = teclado.nextLine();
            System.out.println("--------- SE MUEVE EL GATO ----------");
            gato.mover();
            //try {Thread.sleep(1000);} catch (InterruptedException e) {}
             juego.pintarTablero();
             pause = teclado.nextLine();
             fin = juego.fin();
        }
        System.out.println("---------- EL GATO PILLO AL RATON ---------");
    }
    
}