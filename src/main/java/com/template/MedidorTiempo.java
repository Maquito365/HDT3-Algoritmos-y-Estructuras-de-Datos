package com.template;

public class MedidorTiempo {

    public static long medir(Runnable metodoOrdenamiento) { // El método recibe un Runnable que representa el método de ordenamiento a medir
        long inicio = System.nanoTime(); // Se obtiene el tiempo actual antes de ejecutar el método de ordenamiento
        metodoOrdenamiento.run(); // Se ejecuta el método de ordenamiento
        long fin = System.nanoTime(); // Se obtiene el tiempo actual después de ejecutar el método de ordenamiento
        return fin - inicio; //Se devuelve la diferencia
    }
}
