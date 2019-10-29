package ejerciciosobjetos;

public class Gato {
    public static double posIniFGato;
    public static double posIniCGato;
    /* CONTRUCTOR */   
    Gato (){
        posIniFGato = Math.floor(Math.random()*20);
        posIniCGato = Math.floor(Math.random()*20);
    }
    public void mover(){
        // conseguir la posicion del raton
        double filaRaton = Raton.getPosFilaRaton(); 
        double colRaton = Raton.getPosColRaton();
        // hacer el calculo para saber hacia donde moverse
        if (filaRaton < posIniFGato && colRaton > posIniCGato){
            posIniFGato--;
            posIniCGato++;
        }
        else if (filaRaton > posIniFGato && colRaton > posIniCGato){
            posIniFGato++;
            posIniCGato++;
        }
        else if (filaRaton > posIniFGato && colRaton < posIniCGato){
            posIniFGato++;
            posIniCGato--;
        }
        else if(filaRaton < posIniFGato && colRaton < posIniCGato){
            posIniFGato--;
            posIniCGato--;
        }
        else if (filaRaton < posIniFGato) posIniFGato--;
        else if (filaRaton > posIniFGato) posIniFGato++;
        else if (colRaton > posIniCGato) posIniCGato++;
        else if (colRaton < posIniCGato)posIniCGato--;
    }
    public static double getPosFilaGato(){
        return posIniFGato;
    }
    public static double getPosColGato(){
        return posIniCGato;
    }
} //fin clase