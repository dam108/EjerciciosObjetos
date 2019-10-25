package ejerciciosobjetos;
import java.util.Scanner;
public class EjerciciosObjetos0605 {
    public static Scanner teclado = new Scanner(System.in);
    //instanciamos consola y nim
    public static Consola consola = new Consola();
    public static Nim tablero = new Nim();
    
    public static void main(String[] args) {
        int valor, fila, cantidad;
        boolean terminar = false;
        boolean humano = true;
        // llamamos al metodo Pintar Tablero y le pasamos el objeto tablero como parametro y nos pinta el tablero
        consola.PintarTablero(tablero);

        do {
            
            //juega maquina
            valor = tablero.Piensa();//sacar fila y palillo
            fila = valor /10;// obtenemos la fila diviendo el valor entre 10 
            cantidad = valor - fila*10;// obtenemos la cantidad de palillos , restandole al valor la fila x 10
            
            ejecucionPintar(fila, cantidad);
            humano = false;
            //juega el humano
            fila = pedirFila();
            cantidad = pedirCantidad();
            
            ejecucionPintar(fila, cantidad);
            humano = true;

            terminar = tablero.Fin();
            
        }while (!terminar);
        if (humano) System.out.println("you lose!");
        else System.out.println("le has ganado a la maquian Fenomeno , fiera, maestro , pantera");
        

    } // fin main
    
    public static void ejecucionPintar(int ff, int cc){
        tablero.Juega(ff, cc);
        consola.PintarTablero(tablero);
    }
    
    public static int pedirFila(){
        int ff;
        
        System.out.println("Introduce la fila:");
        ff = teclado.nextInt();
        return ff;
    }
    public static int pedirCantidad(){
        int cc;
        System.out.println("Introcue la cantidad de palillos a quitar");;
        cc = teclado.nextInt();
        return cc;
    }
    
} // fin class
