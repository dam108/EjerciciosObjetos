package ejerciciosobjetos;
import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.
import java.time.format.*; //  Este paquete contiene DateTimeFormatter.
//import java.util.*;
//import java.time.temporal.ChronoUnit; // Este paquete tiene los metodos con los que podemos calcular dias entre fechas
public class Alumno {
    private String nombre;
    private String DNI;
    private String fechaNac;
    private static String nomEscuela;

    
    /* CONTRUCTOR */   
    Alumno (String nomb, String dni, String fec){
        nombre = nomb;
        DNI = dni;
        fechaNac = fec;
        nomEscuela = "Ies As Mariñas";
    }
    
    public static boolean esMayor(Alumno a, Alumno b){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate alumnoA = LocalDate.parse (a.fechaNac, formatter);
        LocalDate alumnoB = LocalDate.parse (b.fechaNac, formatter);

        return alumnoB.isBefore(alumnoA);
    }
    public static boolean esDuplicado (Alumno a, Alumno b){
        return a.equals(b);
    }
    
    public boolean mayorEdad(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate nacimiento = LocalDate.parse (this.fechaNac, formatter);
        LocalDate diaActual = LocalDate.now();
        LocalDate fechaMayorEdad = nacimiento.plusYears(18);
        return diaActual.isAfter(fechaMayorEdad);
    }
    
    public String getAlumnoNom () {
        return this.nombre;
    }
    public String getAlumnoDni () {
        return this.DNI;
    }
    public String getAlumnoFec () {
        return this.fechaNac;
    }
    public String getAlumnoNomEscuela () {
        return this.nomEscuela;
    }
    public void setAlumnoNom (String nom) {
        this.nombre = nom;
    }
    public void setAlumnoDni (String dni) {
        this.DNI = dni;
    }
    public void setAlumnoFec (String fec) {
        this.fechaNac = fec;
    }
    public static void setAlumnoNomEscuela (String nEscuela) {
        nomEscuela = nEscuela;
    }
    
} //fin clase