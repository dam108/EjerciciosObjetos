package ejerciciosobjetos;

public class NumeroAdivinar {
    private static int numero;
    private static int intento;


    /* CONTRUCTOR */   
    NumeroAdivinar (int num, int num2){
        numero = num;
        intento = num2;

    }
    public static boolean comprobarRepetidos(int cadena){
        char caracter;
        int pos;
        String cad = String.valueOf(cadena);
        for (int i = 0; i < cad.length()-1; i++){
               caracter = cad.charAt(i);
               pos = cad.indexOf(caracter, i + 1);
               if( pos != -1 ) return true;
        }
        return false;
    }
    
    public void comprobarPosiciones(){
        String cad1 = String.valueOf(numero);
        String cad2 = String.valueOf(intento);
        char caracter, caracter2;
        int misma = 0;
        int coincidencias = 0;
        for (int i = 0; i <cad1.length(); i++) {
            caracter  = cad1.charAt(i);
            caracter2 = cad2.charAt(i);
            if ( caracter == caracter2) misma++; 
            else {
               for (int j = 0; j < cad2.length(); j++) {
                caracter2 = cad2.charAt(j);
                if (caracter2 == caracter) coincidencias++; 
                }
            }
        }
        System.out.println("coinciden en el mismo stio: "+misma+" numeros");
        System.out.println("Coinciden sin ser el mismo sitio: "+coincidencias+" numeros");
    }
    
    

} //fin clase 