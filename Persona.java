package poo_3;

public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarDatos(){
        System.out.println("el nombre de la persona es: "+ nombre);
        System.out.println("su edad es: "+ edad);
    }
}
