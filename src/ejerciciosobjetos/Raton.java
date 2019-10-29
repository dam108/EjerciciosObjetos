package ejerciciosobjetos;

public class Raton {
    public static double posIniFRaton;
    public static double posIniCRaton;
    
    /* CONTRUCTOR */   
    Raton (){
        posIniFRaton = Math.floor(Math.random()*20);
        posIniCRaton = Math.floor(Math.random()*20);
    }
    
    public int getFRatonPos(){
       int posFRaton = (int)posIniFRaton;
       return posFRaton;
    }
    public int getCRatonPos(){
       int posCRaton = (int)posIniCRaton;
       return posCRaton;
    }



} //fin clase
