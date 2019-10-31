package ejerciciosobjetos;
import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.
//import java.time.format.*;   //Este paquete contiene DateTimeFormatter.
import java.util.*;
//import java.time.temporal.ChronoUnit; // Este paquete tiene los metodos con los que podemos hacer calculos entre fechas o horas
public class EjerciciosObjetos0611d {
    public static void main(String[] args) {
        long actualYear;
        int counter = 0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el año en el que estamos");
        actualYear = teclado.nextInt();
        
        // creamos un bucle quer recorra todos los años desde el 1 hasta el actual
        for (int i = 1; i <= actualYear; i++) {
            // instanciamos el objeto año con el valor de i en cada momento
            Year year = Year.of(i);
            // si el año es bisiesto aumentamos el contador.
            if (year.isLeap())counter++;
        }
        System.out.println("Desde el año 1 hasta el año "+actualYear+" hubo "+counter+" años bisiestos.");
    }
}