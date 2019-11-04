package ejerciciosobjetos;
import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.
//import java.time.format.*; //Este paquete contiene DateTimeFormatter.
//import java.util.*;
//import java.time.temporal.*; // Este paquete tiene los metodos con los que podemos calcular dias entre fechas
public class EjerciciosObjetos0612 {
    public static int year;
    public static int festivosDomingos = 0;
    public static void main(String[] args) {
        int domingos, dias, laborales; 
        final int festivos = 16;
        int festivosDomingos = 0;
        
        //Scanner teclado = new Scanner(System.in);
        LocalDate fechaActual = LocalDate.now(); 
        
        year = fechaActual.getYear();
        boolean bisiesto = fechaActual.isLeapYear();
        
        LocalDate primerDia = LocalDate.of(year, Month.JANUARY,1);
        DayOfWeek diaSemana = primerDia.getDayOfWeek();
        
        comprobarFestivosDomingos();
        
        if(bisiesto && diaSemana.getValue()==6){
            domingos = 53;
            dias = 366;
 
        } else if (diaSemana.getValue() == 7) {
            domingos = 53;
            dias = 365;
        } else {
            domingos = 52;
            dias = 365;
        }
        
        laborales = dias - domingos - (festivos - festivosDomingos );
        System.out.println("El año "+year+" tiene "+laborales+" dias laborales.");

    } //fin main
    public static void comprobarFestivosDomingos(){
        
        
        LocalDate unoEnero = LocalDate.of(year, Month.JANUARY, 1);
        LocalDate seisEnero = LocalDate.of(year, Month.JANUARY, 6);
        LocalDate dieciseisAbril = LocalDate.of(year, Month.APRIL, 16);
        LocalDate unoMayo = LocalDate.of(year, Month.MAY, 1);
        LocalDate quinceAgosto = LocalDate.of(year, Month.AUGUST, 15);
        LocalDate doceOctubre = LocalDate.of(year, Month.OCTOBER, 12);
        LocalDate unoNoviembre = LocalDate.of(year, Month.NOVEMBER, 1);
        LocalDate seisDiciembre = LocalDate.of(year, Month.DECEMBER, 6);
        LocalDate ochoDiciembre = LocalDate.of(year, Month.DECEMBER, 8);
        LocalDate veinticincoDiciembre = LocalDate.of(year, Month.DECEMBER, 25);
        LocalDate diecinueveMarzo = LocalDate.of(year, Month.MARCH, 19);
        LocalDate dieciochoAbril = LocalDate.of(year, Month.APRIL, 18);
        LocalDate diecisieteMayo = LocalDate.of(year, Month.MAY, 17);
        LocalDate veinticincoJulio = LocalDate.of(year, Month.JULY, 25);
        LocalDate cincoMarzo = LocalDate.of(year, Month.MARCH, 5);
        LocalDate veinticuatroJunio = LocalDate.of(year, Month.JUNE, 24);
        
        DayOfWeek diaunoEnero = unoEnero.getDayOfWeek();
        DayOfWeek diaseisEnero = seisEnero.getDayOfWeek();
        DayOfWeek diadieciseisAbril = dieciseisAbril.getDayOfWeek();
        DayOfWeek diaunoMayo = unoMayo.getDayOfWeek();
        DayOfWeek diaquinceAgosto = quinceAgosto.getDayOfWeek();
        DayOfWeek diadoceOctubre = doceOctubre.getDayOfWeek();
        DayOfWeek diaunoNoviembre = unoNoviembre.getDayOfWeek();
        DayOfWeek diaseisDiciembre = seisDiciembre.getDayOfWeek();
        DayOfWeek diaochoDiciembre = ochoDiciembre.getDayOfWeek();
        DayOfWeek diaveinticincoDiciembre = veinticincoDiciembre.getDayOfWeek();
        DayOfWeek diadiecinueveMarzo = diecinueveMarzo.getDayOfWeek();
        DayOfWeek diadieciochoAbril = dieciochoAbril.getDayOfWeek();
        DayOfWeek diadiecisieteMayo = diecisieteMayo.getDayOfWeek();
        DayOfWeek diaveinticincoJulio = veinticincoJulio.getDayOfWeek();
        DayOfWeek diacincoMarzo = cincoMarzo.getDayOfWeek();
        DayOfWeek diaveinticuatroJunio = veinticuatroJunio.getDayOfWeek();
        
        if( diaunoEnero.getValue() == 7 ) festivosDomingos++;
        if( diaseisEnero.getValue() == 7 ) festivosDomingos++;
        if( diadieciseisAbril.getValue() == 7 ) festivosDomingos++;
        if( diaunoMayo.getValue() == 7 ) festivosDomingos++;
        if( diaquinceAgosto.getValue() == 7 ) festivosDomingos++;
        if( diadoceOctubre.getValue() == 7 ) festivosDomingos++;
        if( diaunoNoviembre.getValue() == 7 ) festivosDomingos++;
        if( diaseisDiciembre.getValue() == 7 ) festivosDomingos++;
        if( diaochoDiciembre.getValue() == 7 ) festivosDomingos++;
        if( diaveinticincoDiciembre.getValue() == 7 ) festivosDomingos++;
        if( diadiecinueveMarzo.getValue() == 7 ) festivosDomingos++;
        if( diadieciochoAbril.getValue() == 7 ) festivosDomingos++;
        if( diadiecisieteMayo.getValue() == 7 ) festivosDomingos++;
        if( diaveinticincoJulio.getValue() == 7 ) festivosDomingos++;
        if( diacincoMarzo.getValue() == 7 ) festivosDomingos++;
        if( diaveinticuatroJunio.getValue() == 7 ) festivosDomingos++;

    }
} // fin class
