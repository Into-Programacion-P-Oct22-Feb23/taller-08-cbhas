package ejercicio01;

import java.util.Locale;
import java.util.Scanner;

/*
 * @author cbhas
*/

public class Ejercicio01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String listadoEdades = "";
        String mensaje = "";
        String nombreJugador[];
        String posicionJugador[];
        double estaturaJugador[];
        double sumaEstaturas = 0;
        double totalEstaturas;
        int edad[];
        double sumaEdades = 0;
        double totalEdades;
        int indice;
        int limite;
        int contador = 1;

        System.out.println("Ingrese la cantidad de jugadores que desea ingresar: ");
        limite = entrada.nextInt();
        nombreJugador = new String[limite];
        posicionJugador = new String[limite];
        edad = new int[limite];
        estaturaJugador = new double[limite];

        for (indice = 0; indice < limite; indice++) {
            entrada.nextLine();

            System.out.println("Ingrese el nombre del jugador: ");
            nombreJugador[indice] = entrada.nextLine();

            System.out.println("Ingrese la posición del jugador: ");
            posicionJugador[indice] = entrada.nextLine();

            System.out.println("Ingrese la edad del jugador: ");
            edad[indice] = entrada.nextInt();

            System.out.println("Ingrese la estatura del jugador: ");
            estaturaJugador[indice] = entrada.nextDouble();

            mensaje = String.format("%s%d. %s -%s-, edad %d, estatura %.2f\n",
                    mensaje,
                    contador,
                    nombreJugador[indice],
                    posicionJugador[indice],
                    edad[indice],
                    estaturaJugador[indice]);

            contador = contador + 1;

            sumaEdades = sumaEdades + edad[indice];
            sumaEstaturas = sumaEstaturas + estaturaJugador[indice];

            listadoEdades = String.format("%s %d",
                    listadoEdades,
                    edad[indice]);
        }
        totalEdades = sumaEdades / limite;
        totalEstaturas = sumaEstaturas / limite;

        mensaje = String.format("Listado de Jugadores\n\n%sListado de "
                + "Edades %s\nPromedio de edades: %.1f\nPromedio de estaturas: "
                + "%.2f",
                mensaje,
                listadoEdades,
                totalEdades,
                totalEstaturas);

        System.out.println(mensaje);

    }
}