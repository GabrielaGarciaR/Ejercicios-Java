public class Ejercicio1Funciones {
    public static void main(String[] args) {
        System.out.println(suma(1, 2, 3));

        Coche miCoche = new Coche();
        miCoche.sumarPuertas(4);
        System.out.println(miCoche.puertas);

    }

    public static int suma(int a, int b, int c) {
        int suma = a + b + c;
        return suma;
    }
}

class Coche {

    int puertas;

    public void sumarPuertas(int puerta) {
        puertas = puertas + puerta;
    }
}