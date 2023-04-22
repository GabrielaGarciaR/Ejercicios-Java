public class Ejercicio4Herencia {
   public static void main(String[] args) {
      Cliente cliente = new Cliente();
      cliente.setNombre("Ana Solis Carmona");
      cliente.setEdad(35);
      cliente.setTelefono(54637);
      cliente.setCredito(4567);
      System.out.println("Nombre cliente: " + cliente.getNombre()+ "\nEdad: " + cliente.getEdad() +
            "\nTelefono: " + cliente.getTelefono() + "\nSu credito es: " + cliente.getCredito());
   }
}

class Persona {

   private String nombre;
   private int edad;
   private int telefono;


   public String getNombre() {
      return this.nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public int getEdad() {
      return this.edad;
   }

   public void setEdad(int edad) {
      this.edad = edad;
   }

   public int getTelefono() {
      return this.telefono;
   }

   public void setTelefono(int telefono) {
      this.telefono = telefono;
   }

}

class Cliente extends Persona {

   private double credito;


   public double getCredito() {
      return this.credito;
   }

   public void setCredito(double credito) {
      this.credito = credito;
   }

}

class Trabajador extends Persona {
   double salario;
}