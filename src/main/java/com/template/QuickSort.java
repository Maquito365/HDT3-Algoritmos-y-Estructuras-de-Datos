package com.template;

public class QuickSort {
    
    public static <T extends Comparable<T>> void sort(T[]array){ //Se llama al método sort, que a su vez llama al método quickSort con los parámetros necesarios
        quickSort(array, 0, array.length-1);//El array se ordena desde el índice 0 hasta el índice array.length-1, que es el último elemento del array
    }

    private static <T extends Comparable<T>> void quickSort(T[]array, int low, int hight){ //El método quickSort es el que realiza la ordenación propiamente dicha, 
    // recibe el array a ordenar, el índice bajo y el índice alto
        if (low < hight){ //Si el índice bajo es menor que el índice alto, se procede a ordenar el array
            int pi = partition(array, low, hight); //Partition divide el array en 2
            quickSort(array, low, pi-1); //Ordena la parte izquierda del array
            quickSort(array, pi+1, hight); //Ordena la parte derecha del array
        }
    }

    private static <T extends Comparable<T>> int partition(T[]array, int low, int hight){ 
        T pivote = array[hight]; //El pivote es el último elemento del array
        int i = (low - 1); //Índice del elemento más pequeño

        for (int j = low; j < hight; j++) {
            if (array[j].compareTo(pivote) < 0) { //Si el elemento actual es menor que el pivote
                i++; //Incrementa el índice del elemento más pequeño
                swap(array, i, j); //Intercambia los elementos
            }
        }
        swap(array, i+1, hight); //Intercambia el pivote con el elemento siguiente al más pequeño
        return (i+1); //Devuelve el índice del pivote
    }

    private static <T extends Comparable<T>> void swap(T[]array, int i, int j){ //Método para intercambiar elementos en un array
        T temp = array[i]; //Guarda temporalmente el elemento en la posición i
        array[i] = array[j]; //Asigna el elemento en la posición j al lugar de i
        array[j] = temp; //Asigna el elemento temporal al lugar de j
    }
}
