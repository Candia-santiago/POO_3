/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_3;

import java.util.Scanner;
public class Directivo extends Empleado{
    // falta el atributo ArrayList para empleados subordinados
    String cat;

    public Directivo(String cat,String nombre,int edad , Sueldo sueldo) {
        super (nombre , edad, sueldo );
        this.cat = cat;
  
    }

    public double sueldoBasicoDirectivo(){
    //    System.out.println("¿qué categoria es el directivo? ");
    //    String cat = teclado.next(); Ya tiene una categoría, la recibe en el constructor y la guarda en su variable this.cat
        if ("A".equals(cat)){ 
            sueldo = sueldo + sueldo *3/100;
        }
        else{
            if("B".equals(cat)){
                sueldo = sueldo + sueldo *5/100;
            }
            else{
                if("C".equals(cat)){
                    sueldo = sueldo + sueldo *10/100;
                }
            }
        }
       
        return sueldo;
    }
       
}
