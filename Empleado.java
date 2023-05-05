
package poo_3;

import java.util.Scanner;

public class Empleado extends Persona{


    protected Sueldo sueldo;

    public Empleado(String nombre,int edad , Sueldo sueldo) {
        super (nombre , edad );
        this.sueldo = sueldo;
    }

    

    public Sueldo getSueldo() {
        return sueldo;
    }

    public void setSueldo(Sueldo sueldo) {
        this.sueldo = sueldo;
    }
    
}
