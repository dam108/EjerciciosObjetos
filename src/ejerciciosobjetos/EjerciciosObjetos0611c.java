package ejerciciosobjetos;
import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.
//import java.time.format.*;   //Este paquete contiene DateTimeFormatter.
import java.util.*;
import java.time.temporal.ChronoUnit; // Este paquete tiene los metodos con los que podemos hacer calculos entre fechas o horas
public class EjerciciosObjetos0611c {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String hora1, hora2;
        
        System.out.println("Introduce una hora con este formato (hh:mm:ss): ");
        hora1 = teclado.nextLine();
        System.out.println("Introduce otra hora con este formato (hh:mm:ss): ");
        hora2 = teclado.nextLine();
        
        // pasamos dos horas en formato String y las parseamos
        LocalTime time1 = LocalTime.parse(hora1);
        LocalTime time2 = LocalTime.parse(hora2);
        
        // con el metodo ChronoUnit sacamos los milisegundos entre las dos horas
        long millis = ChronoUnit.MILLIS.between(time1, time2);
        // pasamos milisegundos a segundos
        long seconds = Math.round(millis /1000);
        // si el numero es negativo lo pasamos a positivo
        if (seconds < 0 ) seconds *= -1;
        
        System.out.println("Hay una diferencia de "+seconds+" segundos entre las dos horas introducidas.");
    }
}