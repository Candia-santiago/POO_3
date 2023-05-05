package poo_3;


public class Cliente extends Persona {
    int telefono;

    
    public Cliente(String nombre, int edad, int telefono){
        super(nombre, edad);
        this.telefono = telefono;
        
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    @Override
     public void mostrarDatos(){
         super.mostrarDatos();
         System.out.println("El telefono es: "+telefono);
    
    
    }
}
