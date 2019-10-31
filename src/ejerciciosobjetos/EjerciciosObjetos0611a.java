package ejerciciosobjetos;
import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.
//import java.time.format.*;   Este paquete contiene DateTimeFormatter.
import java.util.*;
import java.time.temporal.ChronoUnit; // Este paquete tiene los metodos con los que podemos calcular dias entre fechas
public class EjerciciosObjetos0611a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes , year;

        System.out.println("Introduce tu año de nacimiento: ");
        year = teclado.nextInt();
        System.out.println("Introduce tu mes de nacimiento: ");
        mes = teclado.nextInt();
        System.out.println("Introduce tu dia de nacimiento: ");
        dia = teclado.nextInt();
        // creamos una instacia con la fecha de nacimiento
        LocalDate nacimiento = LocalDate.of(year,mes, dia);
        // creamos una instancia con la fecha de hoy
        LocalDate hoy = LocalDate.now();

        // utlizamos el metodo DAYS.between de la clase ChronoUnit
        long diasEntreFechas = ChronoUnit.DAYS.between(nacimiento, hoy);
        
        System.out.println("desde el dia de tu nacimiento hasta hoy pasaron "+diasEntreFechas+" dias." );
    }
}
