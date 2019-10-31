package ejerciciosobjetos;
import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.
//import java.time.format.*;   //Este paquete contiene DateTimeFormatter.
import java.util.*;
//import java.time.temporal.ChronoUnit; // Este paquete tiene los metodos con los que podemos calcular dias entre fechas
public class EjerciciosObjetos0611b {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes , year;
        long dias;

        System.out.println("Introduce un año: ");
        year = teclado.nextInt();
        System.out.println("Introduce un mes: ");
        mes = teclado.nextInt();
        System.out.println("Introduce un dia: ");
        dia = teclado.nextInt();
        // creamos una instacia con la fecha
        LocalDate fecha = LocalDate.of(year,mes, dia);
        
        System.out.println("Introduce la cantidad de dias a añadir: ");
        dias = teclado.nextInt();
        
        //creamos una instancia con la nueva fecha ( antigua mas los dias que le pasemos)
        LocalDate newFecha = fecha.plusDays(dias);
        
        // imprimimos la nueva fecha
        System.out.println(newFecha);
    }
}
