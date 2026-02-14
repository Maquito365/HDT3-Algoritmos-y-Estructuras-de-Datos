package com.template;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        String nombreArchivo = "numeros.txt";

        int[] tamanos = {10, 100, 500, 1000, 2000, 3000};

        for (int tamano : tamanos) {

            System.out.println("\n===============================");
            System.out.println("Tamaño del arreglo: " + tamano);
            System.out.println("===============================");

            // 1️⃣ Generar archivo con números aleatorios
            FileManager.generateFile(nombreArchivo, tamano);

            // 2️⃣ Leer datos desde archivo
            Integer[] datos = FileManager.readFile(nombreArchivo);

            // 3️⃣ Ejecutar con datos desordenados
            System.out.println("---- Datos DESORDENADOS ----");
            ejecutarOrdenamientos(datos);

            // 4️⃣ Ejecutar con datos ya ordenados (mejor caso)
            Arrays.sort(datos);
            System.out.println("---- Datos ORDENADOS ----");
            ejecutarOrdenamientos(datos);
        }
    }

    private static void ejecutarOrdenamientos(Integer[] datosOriginales) {

        // QuickSort
        final Integer[] copiaQuick = Arrays.copyOf(datosOriginales, datosOriginales.length);
        long tiempoQuick = MedidorTiempo.medir(() -> QuickSort.sort(copiaQuick));
        System.out.println("QuickSort: " + tiempoQuick + " ns");

        // MergeSort
        final Integer[] copiaMerge = Arrays.copyOf(datosOriginales, datosOriginales.length);
        long tiempoMerge = MedidorTiempo.medir(() -> MergeSort.sort(copiaMerge));
        System.out.println("MergeSort: " + tiempoMerge + " ns");

        // GnomeSort
        final Integer[] copiaGnome = Arrays.copyOf(datosOriginales, datosOriginales.length);
        long tiempoGnome = MedidorTiempo.medir(() -> GnomeSort.sort(copiaGnome));
        System.out.println("GnomeSort: " + tiempoGnome + " ns");

        // InsertionSort
        final Integer[] copiaInsertion = Arrays.copyOf(datosOriginales, datosOriginales.length);
        long tiempoInsertion = MedidorTiempo.medir(() -> InsertionSort.sort(copiaInsertion));
        System.out.println("InsertionSort: " + tiempoInsertion + " ns");

        // RadixSort
        final Integer[] copiaRadix = Arrays.copyOf(datosOriginales, datosOriginales.length);
        long tiempoRadix = MedidorTiempo.medir(() -> RadixSort.sort(copiaRadix));
        System.out.println("RadixSort: " + tiempoRadix + " ns");
    }
}
