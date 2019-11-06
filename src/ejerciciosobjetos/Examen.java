package ejerciciosobjetos;
//import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.
//import java.time.format.*; //  Este paquete contiene DateTimeFormatter.
//import java.util.*;
//import java.time.temporal.ChronoUnit; // Este paquete tiene los metodos con los que podemos calcular dias entre fechas
public class Examen {
    private int sinResponder, aciertos, fallos;
    private String respuestasExamen; 
    float notaAcierto;
    float notaFallo;
    


    
    /* CONTRUCTOR */   
    Examen (String rE ){
        respuestasExamen = rE;
        notaAcierto = 0.5f;
        notaFallo = 0.2f;
    }
    
    void comprobarAciertos(String cA){
        
        for (int i = 0; i < respuestasExamen.length(); i++) {
            if (cA.charAt(i) == 'z') sinResponder++;
            else if (cA.charAt(i) == respuestasExamen.charAt(i)) aciertos++;
            else fallos++;
        }
        
    } // fin comprobarAciertos
    
    int getAciertos(){
        return aciertos;
    }
    int getFallos(){
        return fallos;
    }
    int getSinResponder(){
        return sinResponder;
    }
    float getNota(){
        float bien = aciertos * notaAcierto;
        float mal = fallos * notaFallo;
        if (bien - mal < 0) return 0;
        else return bien - mal;
    }

} //fin clase