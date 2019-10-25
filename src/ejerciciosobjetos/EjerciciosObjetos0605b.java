package ejerciciosobjetos;
import java.util.Scanner;
public class EjerciciosObjetos0605b {
    public static Scanner teclado = new Scanner(System.in);
    //instanciamos consola y nim
    public static Consola consola = new Consola();
    public static Nim tablero = new Nim();
    
    /*  EN ESTA VERSION TENGO QUE INTENTAR GANRAR
        SEGUN LA WIKIPEDIA PARA QUE GANE EL JUGADOR UNO TIENE QUE EMPEZAR
        Y TIENE QUE HABER 16 PALILLOS, EN ESTA VERSION HAY SOLO 15
        OTRA COSA ES QUE TUVE QUE INVERTIR LAS BANDERAS CON RESPECTO AL ANTERIOR
        PARA QUE AQUI FUNCIONASE BIEN EL AVISO DE QUIEN GANÓ POR QUE EN LA VERSION ANTERIOR 
        EL JUGADOR HUMANO TIENE QUE COGER EL ULTIMO PALILLO PARA PERDER
        PERO EN ESTA VERSION EL JUGADOR MAQUINA NO COJE EL ULTIMO PALILLO , YA SABE QUE GANO
    */
    
    public static void main(String[] args) {
        int valor, fila, cantidad;
        boolean terminar = false;
        boolean humano = false;
        // llamamos al metodo Pintar Tablero y le pasamos el objeto tablero como parametro y nos pinta el tablero
        consola.PintarTablero(tablero);

        do {
            
            //juega el humano
            fila = pedirFila();
            cantidad = pedirCantidad();
            
            ejecucionPintar(fila, cantidad);
            humano = false;
            
            //juega maquina
            valor = tablero.Piensa();//sacar fila y palillo
            fila = valor /10;// obtenemos la fila diviendo el valor entre 10 
            cantidad = valor - fila*10;// obtenemos la cantidad de palillos , restandole al valor la fila x 10
            
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
