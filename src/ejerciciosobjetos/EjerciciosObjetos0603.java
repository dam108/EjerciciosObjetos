package ejerciciosobjetos;
import java.util.Scanner;
public class EjerciciosObjetos0603 {
    public static CuentaCorriente cuenta1;
    public static CuentaCorriente cuenta2;
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        // creamos los dos objetos con las cuentas corrientes
        cuenta1 = new CuentaCorriente("ES1212341234120123456789");
        System.out.println("Se ha creado la Cuenta corriente numero 1 con el IBAN "+cuenta1.IBAN+ " con saldo "+cuenta1.getSaldo()+" EUROS");
        cuenta2 = new CuentaCorriente("ES1212341234120123456790");
        System.out.println("Se ha creado la Cuenta corriente numero 2 con el IBAN "+cuenta2.IBAN+ " con saldo "+cuenta2.getSaldo()+" EUROS");
        
        // creamos el loop del primer menu donde elegimos que cuenta usar
        do {
            // elegimos la cuenta a usar
            opcion = pedirOpcion();
            
            // si la opcion es igual a 1 ejecutamos caso 1 y si es igual a caso 2 ejecutamos caso 2
            getOperacion(opcion);
            
        } while (opcion != 0);
        
    } // fin de main
    
    public static int pedirOpcion(){
        System.out.println("Para trabajar con la primera cuenta pulsa 1");
        System.out.println("Para trabajar con la segunda cuenta pulsa 2");
        System.out.println("Para salir pulsa 0");
        return teclado.nextInt();
    }
    
    public static void getOperacion(int nn){
        int numMenu;
        do {
            System.out.println("¿Que quieres hacer con tu cuenta?");
            System.out.println("Pulsa 1 para ingresar");
            System.out.println("Pulsa 2 para retirar");
            System.out.println("Pulsa 3 para consultar Saldo");
            System.out.println("Pulsa 4 para salir");
            numMenu = teclado.nextInt();
            
            switch(numMenu){
                case 1: 
                    System.out.println("¿Cuanto quieres ingresar?");
                    if (nn == 1){
                        cuenta1.ingresar(teclado.nextFloat());
                        System.out.println("Tu saldo es: "+cuenta1.getSaldo());
                        break; 
                    }
                    else if (nn == 2){
                        cuenta2.ingresar(teclado.nextFloat());
                        System.out.println("Tu saldo es: "+cuenta2.getSaldo());
                        break;  
                    }
                case 2:
                    System.out.println("¿Cuanto quieres retirar?");
                    if (nn == 1){
                        cuenta1.retirar(teclado.nextFloat());
                        System.out.println("Tu saldo es: "+cuenta1.getSaldo());
                        break; 
                    }
                    else if (nn == 2){
                        cuenta2.retirar(teclado.nextFloat());
                        System.out.println("Tu saldo es: "+cuenta2.getSaldo());
                        break;  
                    }
                case 3:
                    if (nn == 1){
                        System.out.println("Tu saldo es: "+cuenta1.getSaldo());
                        break; 
                    }
                    else if (nn == 2){
                         System.out.println("Tu saldo es: "+cuenta2.getSaldo());
                        break;  
                    }
            }
        } while (numMenu != 4 );
    }
} // fin de class
