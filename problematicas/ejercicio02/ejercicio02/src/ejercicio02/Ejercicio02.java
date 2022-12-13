package ejercicio02;

/*
   @author cbhas
*/

public class Ejercicio02 {

    public static void main(String[] args) {
        int numero;
        int[] multiplicacion = {1, 2, 3, 4};

        System.out.println("N°" + "\t" + "x2" + "\t" + "x3" + "\t" + "x4");
        for (numero = 25; numero > 0; numero--) {

            System.out.println(numero * multiplicacion[0] + "\t" + numero
                    * multiplicacion[1] + "\t" + numero * multiplicacion[2]
                    + "\t" + numero * multiplicacion[3] + "\t");

        }
    }
}