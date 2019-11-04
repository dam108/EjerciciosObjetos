package ejerciciosobjetos;

public class Pistola {
    public static int contador = 1;
    public static double posicionBalaInicial;

    /* CONTRUCTOR */   
    Pistola (){
        posicionBalaInicial = Math.random()*6 + 1;
    }
    
    public static int getPosBalaInical(){
        int posBalaInicial = (int)posicionBalaInicial;
        return posBalaInicial;
    }
    
    public static boolean comprobarJugadorMuerto(){
        int pos = Pistola.getPosBalaInical();
        if (contador == pos){
            return true;
        }
        else {
            contador++;
            return false;
        }
    }
} //fin clase