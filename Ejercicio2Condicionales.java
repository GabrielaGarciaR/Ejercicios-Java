public class Ejercicio2Condicionales {

    public static void main(String[] args) {

        System.out.println("/********Condicional IF ELSE****************/");

        int numeroif = -4;
        if (numeroif > 0) {
            System.out.println("El numero es positivo");
        } else if (numeroif < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es igual que 0");
        }

        System.out.println("/********Bucle WHILE****************/");

        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println("/********Bucle DO WHILE****************/");

        numeroWhile = 0;
        do {
            System.out.println(numeroWhile);
        } while (numeroWhile > 1);

        System.out.println("/********Bucle FOR***************/");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        System.out.println("/********SWITCH***************/");

        String estacion = "Primavera";

        switch (estacion) {
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("No es una estación del año");
        }
    }
}