package ejerciciosobjetos;
import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.
import java.time.format.*; //Este paquete contiene DateTimeFormatter.
import java.util.*;
//import java.time.temporal.ChronoUnit; // Este paquete tiene los metodos con los que podemos calcular dias entre fechas
public class EjerciciosObjetos0611f {
    public static LocalDate fecha;
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

        //preguntamos el tipo del articulo
        int opcion = getOpcion();
        
        fecha = getFecha();
        
        boolean comprobar = comprobacion(fecha, opcion);
        
        if (comprobar) System.out.println("Si puedes devolver el articulo");
        else System.out.println("No puedes devolver el articulo");

    }
    
    public static int getOpcion(){
        System.out.println("Introduce el tipo de articulo: ");
        System.out.println("1 - perecedero, 2 - electronica, 3 - ropa");
        int opcion = teclado.nextInt();
        teclado.nextLine();
        return opcion;
    }
    
    public static LocalDate getFecha(){
        System.out.println("Introduce una fecha de la compra: (dd/MM/aaaa)");
        // creamos un instancia de un objeto que crea un patron para el formato de la fecha
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        // parseamos la fecha introducida con el formato anterior
        return LocalDate.parse( teclado.nextLine(), formatter);
    }
    
    public static boolean comprobacion(LocalDate f, int nn){
        switch (nn){
            case 1:
                // pedir la hora de la compra
                System.out.println("Introduce la hora de la compra por que este es un articulo perecedero: (hh:mm:ss)");
                String hora = teclado.nextLine();
                // pasamos la hora en formato String y las parseamos
                // primero guadamos la hora de la compra
                LocalTime time = LocalTime.parse(hora);
                // conseguimos la hora acutal
                LocalTime horaActual = LocalTime.now();
                // le sumamos 5 a la hora de la compra
                LocalTime horaLimite = time.plusHours(5);
                // comprobamos si la hora actual es menor a la hora limite y devolvemos true o false
                return horaActual.isBefore(horaLimite);
            case 2:
                // si es electronica comprobamos que la fecha sea menor a 6 meses hasta hoy 
                LocalDate fechaLimite = f.plusMonths(6);
                LocalDate fechaActual = LocalDate.now();
                /* DEBUG 
                System.out.println(fechaLimite+" "+fechaActual+" "+fechaLimite.isBefore(fechaActual));
                */
                // comprobamos si la fecha actual es menor a la fecha limite y devolvemos true o false
                return fechaActual.isBefore(fechaLimite);
            case 3:
                // si es ropa comprobamos que la fecha sea menor a 15 dias con la de hoy
               LocalDate fechaLimiteElec = f.plusDays(15);
               LocalDate fechaActualElect = LocalDate.now();
                // comprobamos si la fecha actual es menor a la fecha limite y devolvemos true o false
                return fechaActualElect.isBefore(fechaLimiteElec);
        }
        return false;
    }   
}    

