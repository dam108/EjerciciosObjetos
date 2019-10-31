package ejerciciosobjetos;
import java.time.*;
import java.util.Scanner;
import java.time.format.*;
public class EjerciciosObjetos0611e {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce una fecha: (dd/MM/aaaa)");
        // creamos un instancia de un objeto que crea un patron para el formato de la fecha
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        // parseamos la fecha introducida con el formato anterior
        LocalDate fecha = LocalDate.parse( teclado.nextLine(), formatter);
        // sacamos el dia de la semana que es
        DayOfWeek diaSemana = fecha.getDayOfWeek();
        
        System.out.println("El dia "+fecha+" fue "+diaSemana+".");

    } // fin de main
} // fin de class
