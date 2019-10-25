package ejerciciosobjetos;
import java.util.Scanner;
public class Consola {  
      
public Consola (){}

public static int leerEntero (String texto, int limiteinferior, int limitesuperior) {
    int valor=-1;   
    boolean error = true;
    
    while (error) {   
       Scanner teclado = new Scanner(System.in);
        System.out.print(texto + " (" + limiteinferior + "-" + limitesuperior +"):");
        String txt = teclado.nextLine();
        txt = txt.replaceAll("\\s","");
        try {
          valor = Integer.parseInt(txt);
        }  catch( Exception e ) {}
        if (valor >= limiteinferior && valor <= limitesuperior) error = false; 
        else System.out.println("> Valor incorrecto.");
    }
    return valor;
}

public static void PintarTablero (Nim tablero){
    int i,j;
    
    System.out.println ("\n-------TABLERO-----------" );
    for (i=0;i<=2;i++) {
        System.out.print ("Fila " + (i+1) + "(" + tablero.palillos[i]+"):  " );
        for (j=1;j<=tablero.palillos[i];j++)System.out.print("O ");
        System.out.print ("\n");
    }
    System.out.println ("-------------------------\n" );
}

} //fin clase
