package com.template;

public class MergeSort {
    
    public static <T extends Comparable<T>> void sort(T[]array){
        mergeSort(array, 0, array.length-1);
    }

    private static <T extends Comparable<T>> void mergeSort(T[] array, int left, int right){
        if (left < right){
            int mid = left + (right - left) /2; //Se calcula el punto medio del array para dividirlo en dos mitades
            mergeSort(array, left, mid); //Se ordena la primera mitad del array
            mergeSort(array, mid+1, right); //Se ordena la segunda mitad del array
            merge(array, left, mid, right); //Se fusionan las dos mitades ordenadas del array
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Comparable<T>> void merge(T[] array, int left, int mid, int right){
        int n1 = mid - left + 1; //Se calcula el tamaño de la primera mitad del array
        int n2 = right - mid; //Se calcula el tamaño de la segunda mitad del array

        T[] leftArray = (T[]) new Comparable[n1]; //Se crea un array temporal para la primera mitad
        T[] rightArray = (T[]) new Comparable[n2]; //Se crea un array temporal para la segunda mitad

        for (int i = 0; i < n1; i++){
            leftArray[i] = array[left + i]; //Se copian los elementos de la primera mitad al array temporal
        }
        for (int j = 0; j < n2; j++){
            rightArray[j] = array[mid + 1 + j]; //Se copian los elementos de la segunda mitad al array temporal
        }

        int i = 0, j = 0, k = left; //Índices para recorrer los arrays temporales y el array original

        while (i < n1 && j < n2){ //Mientras haya elementos en ambos arrays temporales
            if (leftArray[i].compareTo(rightArray[j]) <= 0){ //Si el elemento de la primera mitad es menor o igual al elemento de la segunda mitad
                array[k] = (T) leftArray[i]; //Se coloca el elemento de la primera mitad en el array original
                i++; //Se avanza en el array temporal de la primera mitad
            } else {
                array[k] = (T) rightArray[j]; //Se coloca el elemento de la segunda mitad en el array original
                j++; //Se avanza en el array temporal de la segunda mitad
            }
            k++; //Se avanza en el array original
        }

        while (i < n1){ //Si quedan elementos en la primera mitad, se copian al array original
            array[k] = (T) leftArray[i];
            i++;
            k++;
        }

        while (j < n2){ //Si quedan elementos en la segunda mitad, se copian al array original
            array[k] = (T) rightArray[j];
            j++;
            k++;
        }
    }
}
