package ejerciciosobjetos;

public class TableroGatoRaton {
    private final int cantidadFilas = 20;
    private final int cantidadColumnas = 20;

    
    /* CONTRUCTOR */   
    TableroGatoRaton (){
    }

    public void pintarTablero(){
        for (int i = 0; i < cantidadFilas ; i++) {
                for (int j = 0; j < cantidadColumnas; j++) {
                    if (i == Gato.posIniFGato && j == Gato.posCGato)  System.out.print(" G ");
                    else if (i == Raton.posIniFRaton && j == Raton.posCRaton) System.out.print(" R ");
                    else System.out.print(" . ");
                }
                System.out.println();

        }
    }

} //fin clase
