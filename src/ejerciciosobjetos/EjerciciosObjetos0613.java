package ejerciciosobjetos;
import java.util.Scanner;
public class EjerciciosObjetos0613 {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        String nombreA;
        String nombreB;
        
        // creamos dos alumnos 
        Alumno alumno1 = crearAlumno();
        Alumno alumno2 = crearAlumno();
        
        // comprobamos si son iguales 
        boolean duplicado = Alumno.esDuplicado(alumno1, alumno2);
        if(duplicado) System.out.println("Si estan duplicados");
        else System.out.println("No estan duplicados");
        
        //comprobamos si son mayores de edad
        nombreA = alumno1.getAlumnoNom();
        
        if(alumno1.mayorEdad())System.out.println(nombreA+" es mayor de edad");
        else System.out.println(nombreA+" no es mayor de edad");
        
        nombreB = alumno2.getAlumnoNom();
        if(alumno2.mayorEdad())System.out.println(nombreB+" es mayor de edad");
        else System.out.println(nombreB+" no es mayor de edad");
        
        //comprobamos si alumno 1 es mayor que alumno 2 y viceversa
        if(Alumno.esMayor(alumno1, alumno2)) System.out.println(nombreB+" es mayor que "+nombreA);
        else System.out.println(nombreA+" es mayor que "+nombreB);
        
        //Cambiamos el nombre de la escuela de los alumnos
        alumno1.setAlumnoNomEscuela("Liceo");
        alumno2.setAlumnoNomEscuela("Fernando Wirtz");
        
        System.out.println("La escuela de "+nombreA+" es "+alumno1.getAlumnoNomEscuela());
        System.out.println("La escuela de "+nombreB+" es "+alumno2.getAlumnoNomEscuela());
        
    } //fin main
    
    public static Alumno crearAlumno(){
        System.out.println("Introduce el nombre completo del Alumno:");
        String nombre = teclado.nextLine();
        System.out.println("Introduce el DNI del alumno:");
        String dni = teclado.nextLine();
        System.out.println("Introduce la fecha de nacimiento del Alumno:");
        String fecha = teclado.nextLine();
        System.out.println("Introduce el nombre de la Escuela:");
        String nombreEscuela = teclado.nextLine();
        
        return new Alumno(nombre, dni, fecha, nombreEscuela); 
    }
    
} //fin class
