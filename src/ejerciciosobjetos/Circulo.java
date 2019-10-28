package ejerciciosobjetos;
public class Circulo {
    private int radio;
    
    Circulo (int rr){
        radio = rr;
    }
    
    public void setRadio(int nn){
        radio = nn;
    }
    public void getRadio(){
        System.out.println("el radio del circulo es: "+radio);
    }
    public int calcularDiametro() {
    return 2 * radio;
    }
    public double calcularCircunferencia(){
        return (2*radio)* Math.PI;
    }
    public double calcularSuperficie(){
        return Math.PI * Math.pow(radio, 2);
    }
    
}
