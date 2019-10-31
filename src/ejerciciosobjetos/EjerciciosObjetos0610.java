package ejerciciosobjetos;
import java.util.Scanner;
public class EjerciciosObjetos0610 {
    public static int numMenu = 0; 
    public static CuentaBanco cuenta1;
    public static CuentaBanco cuenta2;
    public static CuentaBanco cuentaActiva;
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        // creamos los dos objetos con las cuentas corrientes
        cuenta1 = new CuentaBanco("ES1212341234120123456789");
        System.out.println("Se ha creado la Cuenta corriente numero 1 con el IBAN "+cuenta1.IBAN+ " con saldo "+cuenta1.getSaldo()+" EUROS");
        cuenta2 = new CuentaBanco("ES1212341234120123456790");
        System.out.println("Se ha creado la Cuenta corriente numero 2 con el IBAN "+cuenta2.IBAN+ " con saldo "+cuenta2.getSaldo()+" EUROS");

        //establecemos para todas las cuentas porcentaje de comision a un 0.1% y una comision minima de 0.03 centimos de euro
        CuentaBanco.setComision(0.1f, 0.03f);
        
        // elegimos la cuenta a usar
        pedirOpcion();
        // creamos el loop del primer menu donde elegimos que cuenta usar
        do {
            // trabajamos con ella
            getOperacion();
        } while (numMenu != 5);
        
    } // fin de main
    
    public static void getOperacion(){
            System.out.println("¿Que quieres hacer con tu cuenta?");
            System.out.println("Pulsa 1 para ingresar");
            System.out.println("Pulsa 2 para retirar");
            System.out.println("Pulsa 3 para consultar Saldo");
            System.out.println("Pulsa 4 para cambiar de cuenta");
            System.out.println("Pulsa 5 para salir");
            numMenu = teclado.nextInt();
            
            switch(numMenu){
                case 1: 
                    System.out.println("¿Cuanto quieres ingresar?");
                    cuentaActiva.ingresar(teclado.nextFloat());
                    System.out.println("Tu saldo es: "+cuentaActiva.getSaldo());
                    break; 
                case 2:
                    System.out.println("¿Cuanto quieres retirar?");
                    boolean retirada = cuentaActiva.retirar(teclado.nextFloat());
                    if (retirada)System.out.println("Se ha efectuado la retirada con exito");
                    else System.out.println("no se ha podido realizar la retirada");                    
                    System.out.println("Tu saldo es: "+cuentaActiva.getSaldo());
                    break;
                case 3:
                    System.out.println("Tu saldo es: "+cuentaActiva.getSaldo());
                    break;
                case 4: pedirOpcion(); break;
            }
    }
    
    public static void pedirOpcion(){
        System.out.println("Para trabajar con la primera cuenta pulsa 1");
        System.out.println("Para trabajar con la segunda cuenta pulsa 2");
        if ( teclado.nextInt()== 1) cuentaActiva = cuenta1;
        else cuentaActiva = cuenta2;
    }
} // fin de class
