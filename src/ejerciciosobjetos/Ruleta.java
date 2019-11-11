package ejerciciosobjetos;
public class Ruleta {
    private static final int MAXnumRULETA = 36;
    
/* CONSTRUCTOR */
    Ruleta () {

    }// fin constuctor 
    
    public boolean apostar (int cantidad){
        int num = getResultado();
        if(Ruleta.esZero(num))return false;
        else if (Ruleta.esPar(num)) return true;
        return false;
    }
    private static int getResultado(){
        double res = Math.random() * MAXnumRULETA + 1;
        int num = (int)res;
        return num;
    }
    private static boolean esPar(int num){
        if (num % 2 == 0) return true;
        return false;
        
    }
    private static boolean esZero(int num){
        if (num == 0) return true;
        return false;
    }
    
} //fin clase