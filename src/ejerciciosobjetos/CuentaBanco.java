package ejerciciosobjetos;
//import java.util.Scanner;
public class CuentaBanco {
    public String IBAN;
    private float saldo;
    private int contadorIngresos;
    private static float porcentajeComision;
    private static float minimoComision;
    
    CuentaBanco (String iban){
        IBAN = iban;
        saldo = 0;
        contadorIngresos = 0;
    
    }
    public static void setComision(float pC, float mC){
        porcentajeComision = pC;
        minimoComision = mC;
    }
    // incresar
    public void ingresar( float cantidad ){
        this.saldo += cantidad;
        contadorIngresos++;
        if (contadorIngresos ==  3){
            this.saldo += 0.7f;
            contadorIngresos = 0;
        }
    }
    // retirar
    public boolean retirar(float cantidad){
        float comisionAplicar;
        // calcular la comision dependiendo de la cantidad a retirar si es porcentual o el minimo
        if (cantidad * porcentajeComision < minimoComision ) comisionAplicar = minimoComision;
        else comisionAplicar = porcentajeComision;
        // comprobar si la cantidad es > 0
        if (this.saldo > 0) {
            // comprobar si la cantidad a retirar + la comision es < saldo
            if(cantidad + comisionAplicar < this.saldo){
                // efecturar la retirarda 
                this.saldo -= ( cantidad  + comisionAplicar );
                // resetear contadorIngresos
                contadorIngresos = 0;
                 // devolver true
                return true;
              // en caso contrario de cualquier caso anterior backup al saldo y devolvemos false  
            } else return false; 
        } // en caso de que el saldo sea menor que 0 devolver falso
        else return false;
    }
    // consultar saldo
    public float getSaldo(){
        return saldo;
    }
}