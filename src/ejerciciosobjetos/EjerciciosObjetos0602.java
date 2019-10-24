package ejerciciosobjetos;
import java.util.Scanner;
public class EjerciciosObjetos0602 {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int alta, opcion;
        long nM; 
        float cEL = 0.15f, cML = 0.05f, cMB = 0.03f, saldo;
        
        System.out.println("Pulsa cualquer numero para dar de alta un movil nuevo, 0 para salir.");
        alta = teclado.nextInt();
        
        while ( alta != 0 ){

            System.out.println("Introduce el numero de telefono: ");
            nM = teclado.nextLong();
            System.out.println("Introduce el saldo inicial: ");
            saldo = teclado.nextFloat();
            
            MovilPrepago movil = new MovilPrepago(nM, cEL, cML, cMB, saldo);
            
            System.out.println("Tu movil "+nM+ " ha sido dado de alta con "+saldo+ " euros.");
            
            do {
                opcion = pedirOpcion();
                
                switch (opcion){
                    case 1: 
                        System.out.println("¿Cuantos segundos ha durado la llamda?");
                        movil.efectuarLlamada(teclado.nextInt());
                        System.out.println("Despues de la llamada tu saldo es de: " +movil.consultarSaldo());
                        break;
                    case 2:
                        System.out.println("¿Cuantos megas quieres gastar navegando?");
                        movil.navegar(teclado.nextInt());
                        System.out.println("Despues de navegar tu saldo es de: " +movil.consultarSaldo());
                        break;
                    case 3:
                        System.out.println("Introduce la cantidad en euros que quieres recargar a tu saldo: ");
                        boolean recarga = movil.recargar(teclado.nextInt());
                        if (recarga) System.out.println("Despues de recargar tu saldo es de: " +movil.consultarSaldo()); 
                        else System.out.println("No se ha podido recargar, la proxima vez introduce multiplos de 5.");
                        break;
                    case 4:
                        System.out.println("tu saldo es de: " +movil.consultarSaldo());
                        break;
                }// fin switch
                
            } while (opcion != 5);   
            
            System.out.println("Pulsa cualquer numero para dar de alta un movil nuevo, 0 para salir.");
            alta = teclado.nextInt();

        } // fin while
    } // fin de main
    
    public static int pedirOpcion(){
        System.out.println("Si quieres realizar una llamada pulsa 1");
        System.out.println("Si quieres navegar pulsa 2");
        System.out.println("Para recargar el saldo pulsa 3");
        System.out.println("Para consultar el saldo pulsa 4");
        System.out.println("Para salir pulsa 5");
        return teclado.nextInt();
    } // fin pedirOpcion
} // fin de class
