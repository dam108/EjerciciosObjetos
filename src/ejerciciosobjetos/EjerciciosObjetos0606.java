package ejerciciosobjetos;
import java.util.Scanner;
public class EjerciciosObjetos0606 {
    public static int opcion = 0;
    public static Circulo Circulo;
    public static Scanner teclado;
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        
        System.out.println("Introduce el radio del circulo: ");
        int radio = teclado.nextInt();
        
        Circulo = new Circulo(radio);        

        do{
            System.out.println("Para saber el radio del circulo pulsa 1");
            System.out.println("Para cambiar el radio del circulo pulsa 2");
            System.out.println("Para calcular el diametro del circulo pulsa 3");
            System.out.println("Para calcular la circunferencia pulsa 4");
            System.out.println("Para calcular el area del circulo pulsa 5");
            System.out.println("Para salir pulsa 6");
            
            opcion = teclado.nextInt();
            
            getOpcion(opcion);
            
        }while(opcion != 6);
        
    }
    public static void getOpcion(int nn){
        
        switch(nn){
            case 1: 
                Circulo.getRadio();
                break;
            case 2: 
                System.out.println("Introduce el radio nuevo: ");
                int rr = teclado.nextInt();
                Circulo.setRadio(rr);
                Circulo.getRadio();
                break;
            case 3: 
                System.out.println("El Diametro del circulo es "+Circulo.calcularDiametro());
                break;
            case 4: 
                System.out.println("La circunferencia es de "+Circulo.calcularCircunferencia());
                break;
            case 5: 
                System.out.println("La supercicie del circulo "+Circulo.calcularSuperficie());
                break;
        }        
    }
}
