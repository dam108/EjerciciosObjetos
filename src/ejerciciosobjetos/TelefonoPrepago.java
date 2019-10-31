package ejerciciosobjetos;

public class TelefonoPrepago {
    private final int numeroTelefono;
    private final float establecimiento;
    private final float costeMinuto;
    private final float costeMegaByte;
    private float saldoTelefono;

    /* CONTRUCTOR */   
    TelefonoPrepago (int num, float eLl, float cLl, float cMB, float saldo){
        numeroTelefono = num;
        establecimiento = eLl;
        costeMinuto = cLl;
        costeMegaByte = cMB;
        saldoTelefono = saldo;
    }
    
    public float consultarSaldo(){
        return this.saldoTelefono;
    }
    
    public void efectuarLlamada(int segundos){
        float total = establecimiento + ((segundos/60f) * costeMinuto);
        saldoTelefono -= total;
    }
    
    public void navegar(int megas){
        float total = (float)megas * costeMegaByte;
        saldoTelefono -=  total;
    }

    public boolean recargar(int rr){
        if(rr %5 == 0){
           saldoTelefono += rr; 
          return true;
        }else return false;
    }
    
    public int consultarNumero(){
        return this.numeroTelefono;
    }
 
} //fin clase
