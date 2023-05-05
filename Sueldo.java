package POO_3;

import java.util.Scanner;

public class Sueldo {
    Scanner teclado = new Scanner (System.in);
    
    double sueldo;
    double obraSocial;
    double jubilacion;
    double presentismo;
    

    
    public Sueldo(double sueldo, double obraSocial, double jubilacion, double presentismo, String genero) {
        this.sueldo = sueldo;
        this.obraSocial = obraSocial;
        this.jubilacion = jubilacion;
        this.presentismo = presentismo;
        this.genero = genero;
    }

    
    public double calcularSueldoBasicoNeto(){
        obraSocial = sueldo / 100 * 3;
        jubilacion = sueldo / 100 * 11;
        double sueldoNeto = sueldo - jubilacion - obraSocial; 
        System.out.println("tenes presentismo?  1-si    2-no");
        int opc = teclado.nextInt();
        if (opc == 1){
            presentismo = sueldo / 100 * 10;
            sueldoNeto = sueldoNeto + presentismo; 
        }
        return sueldoNeto;
    }
   
    
    public void emitirDetalle(){
        System.out.println("sueldo Basico: " + sueldoBasico());
        System.out.println("presentismo: " + presentismo);
        System.out.println("obra social: " + obraSocial);
        System.out.println("jubilación: " + jubilacion);

    }

    public String getCat() {
        return cat;
    }
    
    
    
}
