package ejerciciosobjetos;
import java.util.Scanner;
public class EjercicioObjetos0601 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        MovilPrepago movil = new MovilPrepago(605308712, 0.35f, 0.05f, 0.10f, 10);
        
        // hacer una llamada
        movil.consultarSaldo();
        // hacer una navegacion
        // hacer una recarga
        // consultar sadldo
    }
    
    
}