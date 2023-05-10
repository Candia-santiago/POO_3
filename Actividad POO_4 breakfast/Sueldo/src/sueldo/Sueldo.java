package sueldo;

import java.util.Scanner;

public class Sueldo extends Empleado{
    Scanner teclado = new Scanner (System.in);
    
    double sueldoBasico;

    
    public void Sueldo(double sueldo) {
        this.sueldoBasico = sueldoBasico;
    }

    
    public double calcularSueldoNeto(){
        double obraSocial = sueldoBasico / 100 * 3;
        double jubilacion = sueldoBasico / 100 * 11;
        double sueldoNeto = sueldoBasico - jubilacion - obraSocial; 
        System.out.println("tenes presentismo?  1-si    2-no");
        int opc = teclado.nextInt();
        if (opc == 1){
            double presentismo = sueldoBasico / 100 * 10;
            sueldoNeto = sueldoNeto + presentismo; 
        }
        return sueldoNeto;
    }   
}
