package ejercicio03;

/*
   @author cbhas
*/

public class Ejercicio03 {

    public static void main(String[] args) {
        double numero;
        double operacion;
        double numerador = 5;
        double denominador = 9;
        String mensaje = "";

        for (numero = 20; numero < 84; numero += 4) {
            operacion = (numerador / denominador) * (numero - 32);
            mensaje = String.format("%s %.0f °F = %.2f °C\n",
                    mensaje,
                    numero,
                    operacion);

        }
        System.out.println(mensaje);

    }
}
