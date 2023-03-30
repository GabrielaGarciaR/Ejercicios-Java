public class Ejercicio3Encapsulacion {
    
    public static void main(String[]args){

        Persona persona=new Persona();
        persona.setNombre("Maria");
        System.out.println("Nombre: " + persona.getNombre());
        persona.setEdad(25);
        System.out.println("Edad: " + persona.getEdad());
        persona.setTelefono(2224517);
        System.out.println("Telefono: " + persona.getTelefono());

    }
}

class Persona{

    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }

}
