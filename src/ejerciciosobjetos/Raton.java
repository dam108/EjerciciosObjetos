package ejerciciosobjetos;

public class Raton {
    public static double posIniFRaton;
    public static double posIniCRaton;
    /* CONTRUCTOR */   
    Raton (){
        posIniFRaton = Math.floor(Math.random()*20);
        posIniCRaton = Math.floor(Math.random()*20);
    }
    public void mover(){
        /* DEBUG
        System.out.println("fila raton antes :"+ posIniFRaton);
        System.out.println("columna raton antes:"+ posIniCRaton);
        */
        // guardo las posiciones por si se sale del tablero poder hacer un rollback
        double posProbF = posIniFRaton;
        double posProbC = posIniCRaton;
        do{
            // elegir una direccion hacia la que moverse
            getDireccion();
            /* DEBUG
            System.out.println("fila raton despues dentro del while:"+ posIniFRaton);
            System.out.println("columna raton despues dentro del while:"+ posIniCRaton);
            */
            // si esos pasos mueven al raton fuera del tablero , volver a elegir direccion
            if (posIniFRaton < 0 || posIniFRaton > 19 || posIniCRaton <0 || posIniCRaton >19){
                posIniFRaton = posProbF;
                posIniCRaton = posProbC;
                getDireccion();
            }
        }
        while(posIniFRaton < 0 || posIniFRaton > 19 || posIniCRaton <0 || posIniCRaton >19 );
        /* DEBUG
        System.out.println("fila raton despues fuera del while :"+ posIniFRaton);
        System.out.println("columna raton despues fuera del while:"+ posIniCRaton);
        */
    }
    public void getDireccion(){
        double direccion;
        // calcular dos pasos en esa direccion
        direccion = Math.floor(Math.random()*8+1);
        //mover raton
        switch((int)direccion){
                case 1:posIniFRaton -= 2;break;
                case 2:posIniFRaton -= 2;posIniCRaton += 2;break;
                case 3:posIniCRaton +=2; break;
                case 4:posIniFRaton += 2;posIniCRaton += 2;break;
                case 5:posIniFRaton += 2;break;
                case 6:posIniFRaton += 2;posIniCRaton -= 2;break;
                case 7:posIniCRaton -= 2;break;
                case 8:posIniFRaton -= 2;posIniCRaton -= 2;break;
            }
    }
    public static double getPosFilaRaton(){
        return posIniFRaton;
    }
    public static double getPosColRaton(){
        return posIniCRaton;
    }
} //fin clase
