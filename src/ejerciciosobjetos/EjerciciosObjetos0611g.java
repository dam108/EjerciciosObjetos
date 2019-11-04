package ejerciciosobjetos;
import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.
import java.time.format.*; //Este paquete contiene DateTimeFormatter.
import java.util.*;
import java.time.temporal.*; // Este paquete tiene los metodos con los que podemos calcular dias entre fechas
public class EjerciciosObjetos0611g {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // introducir un año
        System.out.println("Introduce un año: ");
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendPattern("yyyy").parseDefaulting(ChronoField.MONTH_OF_YEAR, 1).parseDefaulting(ChronoField.DAY_OF_MONTH, 1).toFormatter();
        // parseamos la fecha introducida con el formato anterior
        LocalDate fecha  = LocalDate.parse(teclado.nextLine(), formatter);
        //Guardamos una variable con el año
        int year = fecha.getYear();

        LocalDate primerDia = LocalDate.of(year, 1, 1);
        DayOfWeek diaSemana = primerDia.getDayOfWeek();
        
        // Si el año es bisiesto y empiza en sabado o si el año no es bisiesto pero empieza en domingo tiene 53 domingos el resto tiene 52
        if (fecha.isLeapYear() && diaSemana.getValue()== 6)System.out.println("El año tiene 53 domingos");
        else if (fecha.isLeapYear() == false && diaSemana.getValue()== 7) System.out.println("El año tiene 53 domingos");
        else System.out.println("El año tiene 52 domingos");
        
    } // fin main
}  // fin class  

        /*  TOCHO QUE HACE LO MISMO QUE LAS 5 LINEAS ANTERIORES
        int contadorDomingos = 0;
        //comprobar si es bisiesto o no
        if (fecha.isLeapYear()){
         //recorrer los meses
         // segun el mes que sea recorrer los dias
         // preguntar que dia de la semana es y si es domingo aumentar contador de domingos
            for (int i = 1; i <= 12; i++) {
               switch(i){
                   case 1:
                   case 3:
                   case 5:
                   case 7:
                   case 8:
                   case 10:
                   case 12: 
                    for(int j = 1; j <= 31;j++){
                       LocalDate actualDate = LocalDate.of(year, i, j);
                       DayOfWeek diaSemana = actualDate.getDayOfWeek();
                       if (diaSemana.getValue()== 7)contadorDomingos++;
                    }
                    break;
                   case 4:
                   case 6:
                   case 9:
                   case 11:
                    for(int j = 1; j <= 30;j++){
                       LocalDate actualDate = LocalDate.of(year,i, j);
                       DayOfWeek diaSemana = actualDate.getDayOfWeek();
                       if (diaSemana.getValue()== 7)contadorDomingos++;
                    }
                    break;
                   case 2:
                    for(int j = 1; j <= 29;j++){
                       LocalDate actualDate = LocalDate.of(year,i, j);
                       DayOfWeek diaSemana = actualDate.getDayOfWeek();
                       if (diaSemana.getValue()== 7)contadorDomingos++;
                    }
                    break;
                }
            }
        }
        else{
           for (int i = 1; i <= 12; i++) {
               switch(i){
                   case 1:
                   case 3:
                   case 5:
                   case 7:
                   case 8:
                   case 10:
                   case 12: 
                    for(int j = 1; j <= 31;j++){
                       LocalDate actualDate = LocalDate.of(year, i, j);
                       DayOfWeek diaSemana = actualDate.getDayOfWeek();
                       if (diaSemana.getValue()== 7)contadorDomingos++;
                    }
                    break;                    
                   case 4:
                   case 6:
                   case 9:
                   case 11:
                    for(int j = 1; j <= 30;j++){
                       LocalDate actualDate = LocalDate.of(year,i, j);
                       DayOfWeek diaSemana = actualDate.getDayOfWeek();
                       if (diaSemana.getValue()== 7)contadorDomingos++;
                    }
                    break;
                   case 2:
                    for(int j = 1; j <= 28;j++){
                       LocalDate actualDate = LocalDate.of(year,i, j);
                       DayOfWeek diaSemana = actualDate.getDayOfWeek();
                       if (diaSemana.getValue()== 7)contadorDomingos++;
                    }
                    break;
                }
            }
        }
         System.out.println("El año "+year+" tiene "+contadorDomingos+" domingos"   );
        */ 