package ejerciciosobjetos;
import java.util.Scanner;
public class EjerciciosObjetos0601 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        MovilPrepago movil = new MovilPrepago(605308712, 0.35f, 0.05f, 0.10f, 10);
        
        float saldo = movil.consultarSaldo();
        System.out.println("Tu movil tiene : " +saldo+ " euros.");
        
        // hacer una llamada
        movil.efectuarLlamada(300);
        System.out.println("has realizado una llamada de 5 minutos.");
        saldo = movil.consultarSaldo();
        System.out.println("tu movil ahora tiene: "+saldo+" euros");
        // hacer una navegacion
        movil.navegar(20);
        saldo = movil.consultarSaldo();
        System.out.println("Has gastado 20 megas ahora tu saldo es : "+saldo+" euros");
        // hacer una recarga
        movil.recargar(5);
        System.out.println("has recargado 5 euros");
        saldo = movil.consultarSaldo();
        // consultar sadldo
        System.out.println("tu movil ahora tiene: "+saldo+" euros.");
    }
    
    
}