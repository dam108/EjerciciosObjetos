package ejerciciosobjetos;

public class Gato {
    public static double posIniFGato;
    public static double posIniCGato;
    
    /* CONTRUCTOR */   
    Gato (){
        posIniFGato = Math.floor(Math.random()*20);
        posIniCGato = Math.floor(Math.random()*20);
    }
    
    public int getFGatoPos(){
       int posFGato = (int)posIniFGato;
       return posFGato;
    }
    public int getCGatoPos(){
       int posCGato = (int)posIniCGato;
       return posCGato;
    }




} //fin clase
