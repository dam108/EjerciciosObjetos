
package ejerciciosobjetos;
import java.util.Scanner;
public class EjerciciosObjetos0616 {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        String cadena ="";
        String respuestaExamen;
        char letra;
        
        System.out.println("Intoduce las respuestas del examen");
        respuestaExamen = teclado.nextLine();
        
        for (int i = 1; i <= 20; i++) {
            System.out.println("Introduce la respuesta numero "+i+" del alumno:");
            letra = teclado.nextLine().charAt(0);
            cadena += letra;
        }
        
        Examen examen = new Examen(respuestaExamen);
        //Examen examen = new Examen('a','c','d','d','b','a','c','a','d','b','d','a','d','b','d','b','c','a','c','b');
        examen.comprobarAciertos(cadena);
        
        System.out.println("El alumno ha acertado "+examen.getAciertos()+" y "+examen.getFallos()+" fallos, con lo cual ha sacado un "+examen.getNota()+" sobre 10");
        
    }////// fin main
}///////// fin class
