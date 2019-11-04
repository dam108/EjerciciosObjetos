package ejerciciosobjetos;
import java.util.Scanner;
public class EjerciciosObjetos0614 {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        String jugador1 = "Jose Angel Doval";
        String jugador2 = "Dani Dipas";
        String jugador;
        int posInicial;
        boolean jugadorMuerto;
        
        Pistola pistola = new Pistola();
        posInicial = pistola.getPosBalaInical();
        
        do {
            System.out.println("Es el turno del "+jugador1);
            jugador = jugador1;
            jugadorMuerto = disparar();
            
            System.out.println("Es el turno del "+jugador2);
            jugador = jugador2;
            jugadorMuerto = disparar();

        } while(!jugadorMuerto);
        
        if (jugadorMuerto) System.out.println("El jugador "+jugador+" ha muerto por que la bala estaba en la posicion "+posInicial);        
    }  // fin main
    
    public static boolean disparar(){
        System.out.println("Presiona intro para dispararte en la cabeza.");
        teclado.nextLine();
        return Pistola.comprobarJugadorMuerto();
        
    }
}      // fin class
