package ejerciciosobjetos;
import java.util.Scanner;
public class EjerciciosObjetos0607 {
    public static void main(String[] args) {
       // Scanner teclado = new Scanner(System.in);
       int fRatonPos,cRatonPos,fGatoPos,cGatoPos; 
       
        TableroGatoRaton juego = new TableroGatoRaton();
        Raton raton = new Raton();
        Gato gato = new Gato();
        
        juego.pintarTablero();
        
        //Guardo la posicion inicial del Raton para luego trabajar con ella.
        fRatonPos = raton.getFRatonPos();
        cRatonPos = raton.getCRatonPos();
        fGatoPos = gato.getFGatoPos();
        cGatoPos = gato.getCGatoPos();
        
        System.out.println("FilaRaton"+fRatonPos);
        System.out.println("ColumnaRaton"+cRatonPos);
        System.out.println("FilaGato"+fGatoPos);
        System.out.println("ColumnaGato"+cGatoPos);
    }
    
}
