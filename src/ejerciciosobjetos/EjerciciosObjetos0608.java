package ejerciciosobjetos;
import java.util.Scanner;
public class EjerciciosObjetos0608 {
    
    public static void main(String[] args) {
        boolean res;
        int numAdivinar;
        int numIntento;
        Scanner teclado = new Scanner(System.in);
        // pedimos numero otra vez mientras los numeros tengan repetidos
        do {
            // pedir un numero 
            System.out.println("Introduce un numero de 4 digitos:");
            numAdivinar = teclado.nextInt();
            // borrar pantalla 
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            // comprobar si los numeros tienen repetidos 
            res = NumeroAdivinar.comprobarRepetidos(numAdivinar);
        }while (res == true);

        // comprobamos si hay repetidos en el segundo numero
        do{
            System.out.println("Introduce un numero de 4 digitos para intentar adivinar el numero anterior");
            numIntento = teclado.nextInt();
            // comprobar si los numeros tienen repetidos 
            res = NumeroAdivinar.comprobarRepetidos(numIntento);
        }while (res == true);

        // crear un objeto numero
        NumeroAdivinar  MasterMind = new NumeroAdivinar (numAdivinar,numIntento);
        
        MasterMind.comprobarPosiciones();

        // pedir un numero para intentar adivnar el anterior (creamos objeto)
        // comprobar si un numero tiene conincidencias y donde estan si en el mismo sitio o en distintos
        

    }

    
}
