package ejerciciosobjetos;
import java.util.Scanner;
public class EjerciciosObjetos0604 {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        // pedir si se quiere jugar con pista o sin pista 

        
        // creamos el objeto con la opcion que se nos pasa
       do{
            System.out.println("Vamos a jugar al ahoracado!");
            System.out.println("Si quieres jugar normal pulsa 1.");
            System.out.println("Si quieres una pista pulsa 2 .");
            System.out.println("Pulsa 0 para salir .");
            opcion = teclado.nextInt();
           if (opcion !=0) getOpcion(opcion);
           
       }while(opcion != 0);

        
        
        

        
    
    }// fin de main
    
    public static void getOpcion(int nn){
        
            switch(nn){
                case 1: 
                    teclado.nextLine();
                    System.out.println("Introduce la palabra a adivinar");
                    String palabra1 = teclado.nextLine();
                    jugar(palabra1, "");
                    break;
                case 2:
                    teclado.nextLine();
                    System.out.println("Introduce la palabra a adivinar");
                    String palabra2 = teclado.nextLine();
                    System.out.println("Introduce una pista");
                    String pista = teclado.nextLine();
                    jugar(palabra2, pista);
                    break; 
            }
    }// fin get opcion
    public static void jugar(String ss, String ss2){
        Ahorcado juego = new Ahorcado(ss, ss2);
        
        if ( ss2.length() != 0 ){
            System.out.println("la pista es: "+ss2);
        }
        
        do{
            // pedimos letra
            char letra = juego.leerLetra();
            // comprobamos si la letra esta en la palabra a adivinar        
            if (juego.probarLetra(letra)) System.out.println("Has acertado la letra");
            else System.out.println("No has acertado la letra");
            // pintamos tablero
            juego.pintar();
            
            if (juego.adivinada() == true){
                System.out.println("Has adivinado la frase");
            }
            
        } while(juego.perdio() != true && juego.adivinada() == false);
       
        if (juego.perdio()){
            System.out.println("has perdido");
           
        }
   }
    
} // fin de class