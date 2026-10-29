//El ejemplo trata de ordenar una lista de números usando el metodo burbuja
// el programa revisa números vecinos, intercambia los que están en orden incorrecto y repite
// el proceso hasta ordenar toda la lista.

import java.util.Arrays;

        public static void main(String[] args) {
        // Creamos un arreglo (una lista fija) con cinco numeros desordenados.
        int[] numeros = {5, 3, 8, 4, 2};

        // Mostramos un titulo en la consola.
        System.out.println("--- METODO BURBUJA ---");

        // Mostramos los numeros antes de ordenarlos: [5, 3, 8, 4, 2].
        System.out.println("Arreglo inicial: " + Arrays.toString(numeros));

        // Llamamos al metodo que ordena el arreglo de menor a mayor.
        ordenarBurbuja(numeros);

        // Mostramos el resultado final: [2, 3, 4, 5, 8].
        System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));
    }

    // Este metodo recibe el arreglo y lo ordena con el metodo burbuja.
    public static void ordenarBurbuja(int[] numeros) {
        // Repetimos los recorridos necesarios. Si hay 5 numeros, se requieren como maximo 4 recorridos.
        for (int recorrido = 0; recorrido < numeros.length - 1; recorrido++) {
            // Suponemos inicialmente que en este recorrido no se cambiara ningun numero.
            boolean huboIntercambio = false;

            // Informamos cual recorrido se esta realizando. Se suma 1 porque las personas cuentan desde 1.
            System.out.println("\nRecorrido " + (recorrido + 1) + ":");

            // Comparamos numeros vecinos. Restamos 'recorrido' porque al final ya van quedando numeros ordenados.
            for (int posicion = 0; posicion < numeros.length - 1 - recorrido; posicion++) {
                // Preguntamos si el numero de la izquierda es mayor que el de la derecha.
                // Ejemplo: en 5 y 3, preguntamos si 5 > 3. La respuesta es verdadera.
                if (numeros[posicion] > numeros[posicion + 1]) {
                    // Guardamos temporalmente el numero de la izquierda para no perderlo.
                    int temporal = numeros[posicion];

                    // Movemos el numero menor hacia la izquierda. En el ejemplo, ponemos el 3 donde estaba el 5.
                    numeros[posicion] = numeros[posicion + 1];

                    // Ponemos el numero guardado a la derecha. En el ejemplo, ponemos el 5 donde estaba el 3.
                    numeros[posicion + 1] = temporal;

                    // Registramos que si se hizo al menos un cambio en este recorrido.
                    huboIntercambio = true;

                    // Mostramos los dos numeros intercambiados y como quedo el arreglo despues del cambio.
                    System.out.println("  Se intercambian " + numeros[posicion + 1]
                            + " y " + numeros[posicion] + ": " + Arrays.toString(numeros));
                }
            }

            // Si no hubo cambios, significa que los numeros ya estaban ordenados.
            if (!huboIntercambio) {
                // Explicamos en pantalla por que terminamos antes de completar todos los recorridos.
                System.out.println("  No hubo intercambios: el arreglo ya esta ordenado.");

                // Terminamos el ciclo externo porque no hace falta seguir comparando.
                break;
            }
        }
    }

