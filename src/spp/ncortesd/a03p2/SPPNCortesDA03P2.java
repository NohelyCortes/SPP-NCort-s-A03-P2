/*
 *Uso de función Math.log
 */
package spp.ncortesd.a03p2;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class SPPNCortesDA03P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculadora de logaritmo natural");
        // Declaración de variables
        double N1, log;
        Scanner kb = new Scanner (System.in);
        System.out.println("Introduce el número");
        N1= kb.nextDouble();
        
        //Calculo del logarítmo
        log= Math.log(N1);
        
        //Mostrar resultado
        System.out.println("El logarítmo de (" + N1 + ") es =" + log);
        
        
        
    }
    
}
