package com.template;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

/**
 * Unit tests for sorting algorithms and related utilities.
 * These tests verify the correctness of QuickSort, MergeSort, GnomeSort,
 * InsertionSort, and RadixSort implementations.
 */
public class MainTest {
    
    private Integer[] datos;
    private Integer[] datosVacios;
    private Integer[] datosUnElemento;
    private Integer[] datosOrdenados;
    private Integer[] datosInverso;
    
    @BeforeEach
    public void setUp() {
        // Array con datos desordenados
        datos = new Integer[]{64, 34, 25, 12, 22, 11, 90, 88};
        
        // Array vacío
        datosVacios = new Integer[]{};
        
        // Array con un elemento
        datosUnElemento = new Integer[]{42};
        
        // Array ya ordenado (mejor caso)
        datosOrdenados = new Integer[]{11, 12, 22, 25, 34, 64, 88, 90};
        
        // Array en orden inverso (peor caso)
        datosInverso = new Integer[]{90, 88, 64, 34, 25, 22, 12, 11};
    }
    
    // ==================== QuickSort Tests ====================
    @Test
    @DisplayName("QuickSort: Ordena array desordenado correctamente")
    public void testQuickSortUnordered() {
        Integer[] copia = Arrays.copyOf(datos, datos.length);
        QuickSort.sort(copia);
        assertArrayEquals(datosOrdenados, copia);
    }
    
    @Test
    @DisplayName("QuickSort: Maneja array vacío")
    public void testQuickSortEmpty() {
        Integer[] copia = Arrays.copyOf(datosVacios, datosVacios.length);
        assertDoesNotThrow(() -> QuickSort.sort(copia));
        assertArrayEquals(datosVacios, copia);
    }
    
    @Test
    @DisplayName("QuickSort: Maneja array con un elemento")
    public void testQuickSortSingleElement() {
        Integer[] copia = Arrays.copyOf(datosUnElemento, datosUnElemento.length);
        QuickSort.sort(copia);
        assertArrayEquals(datosUnElemento, copia);
    }
    
    @Test
    @DisplayName("QuickSort: Ordena array ya ordenado")
    public void testQuickSortAlreadySorted() {
        Integer[] copia = Arrays.copyOf(datosOrdenados, datosOrdenados.length);
        QuickSort.sort(copia);
        assertArrayEquals(datosOrdenados, copia);
    }
    
    @Test
    @DisplayName("QuickSort: Ordena array en orden inverso")
    public void testQuickSortReverse() {
        Integer[] copia = Arrays.copyOf(datosInverso, datosInverso.length);
        QuickSort.sort(copia);
        assertArrayEquals(datosOrdenados, copia);
    }
    
    // ==================== MergeSort Tests ====================
    @Test
    @DisplayName("MergeSort: Ordena array desordenado correctamente")
    public void testMergeSortUnordered() {
        Integer[] copia = Arrays.copyOf(datos, datos.length);
        MergeSort.sort(copia);
        assertArrayEquals(datosOrdenados, copia);
    }
    
    @Test
    @DisplayName("MergeSort: Maneja array vacío")
    public void testMergeSortEmpty() {
        Integer[] copia = Arrays.copyOf(datosVacios, datosVacios.length);
        assertDoesNotThrow(() -> MergeSort.sort(copia));
        assertArrayEquals(datosVacios, copia);
    }
    
    @Test
    @DisplayName("MergeSort: Maneja array con un elemento")
    public void testMergeSortSingleElement() {
        Integer[] copia = Arrays.copyOf(datosUnElemento, datosUnElemento.length);
        MergeSort.sort(copia);
        assertArrayEquals(datosUnElemento, copia);
    }
    
    @Test
    @DisplayName("MergeSort: Ordena array ya ordenado")
    public void testMergeSortAlreadySorted() {
        Integer[] copia = Arrays.copyOf(datosOrdenados, datosOrdenados.length);
        MergeSort.sort(copia);
        assertArrayEquals(datosOrdenados, copia);
    }
    
    @Test
    @DisplayName("MergeSort: Ordena array en orden inverso")
    public void testMergeSortReverse() {
        Integer[] copia = Arrays.copyOf(datosInverso, datosInverso.length);
        MergeSort.sort(copia);
        assertArrayEquals(datosOrdenados, copia);
    }
    
    // ==================== GnomeSort Tests ====================
    @Test
    @DisplayName("GnomeSort: Ordena array desordenado correctamente")
    public void testGnomeSortUnordered() {
        Integer[] copia = Arrays.copyOf(datos, datos.length);
        GnomeSort.sort(copia);
        assertArrayEquals(datosOrdenados, copia);
    }
    
    @Test
    @DisplayName("GnomeSort: Maneja array vacío")
    public void testGnomeSortEmpty() {
        Integer[] copia = Arrays.copyOf(datosVacios, datosVacios.length);
        assertDoesNotThrow(() -> GnomeSort.sort(copia));
        assertArrayEquals(datosVacios, copia);
    }
    
    @Test
    @DisplayName("GnomeSort: Maneja array con un elemento")
    public void testGnomeSortSingleElement() {
        Integer[] copia = Arrays.copyOf(datosUnElemento, datosUnElemento.length);
        GnomeSort.sort(copia);
        assertArrayEquals(datosUnElemento, copia);
    }
    
    @Test
    @DisplayName("GnomeSort: Ordena array ya ordenado")
    public void testGnomeSortAlreadySorted() {
        Integer[] copia = Arrays.copyOf(datosOrdenados, datosOrdenados.length);
        GnomeSort.sort(copia);
        assertArrayEquals(datosOrdenados, copia);
    }
    
    // ==================== InsertionSort Tests ====================
    @Test
    @DisplayName("InsertionSort: Ordena array desordenado correctamente")
    public void testInsertionSortUnordered() {
        Integer[] copia = Arrays.copyOf(datos, datos.length);
        InsertionSort.sort(copia);
        assertArrayEquals(datosOrdenados, copia);
    }
    
    @Test
    @DisplayName("InsertionSort: Maneja array vacío")
    public void testInsertionSortEmpty() {
        Integer[] copia = Arrays.copyOf(datosVacios, datosVacios.length);
        assertDoesNotThrow(() -> InsertionSort.sort(copia));
        assertArrayEquals(datosVacios, copia);
    }
    
    @Test
    @DisplayName("InsertionSort: Maneja array con un elemento")
    public void testInsertionSortSingleElement() {
        Integer[] copia = Arrays.copyOf(datosUnElemento, datosUnElemento.length);
        InsertionSort.sort(copia);
        assertArrayEquals(datosUnElemento, copia);
    }
    
    @Test
    @DisplayName("InsertionSort: Ordena array ya ordenado")
    public void testInsertionSortAlreadySorted() {
        Integer[] copia = Arrays.copyOf(datosOrdenados, datosOrdenados.length);
        InsertionSort.sort(copia);
        assertArrayEquals(datosOrdenados, copia);
    }
    
    // ==================== RadixSort Tests ====================
    @Test
    @DisplayName("RadixSort: Ordena array desordenado correctamente")
    public void testRadixSortUnordered() {
        Integer[] copia = Arrays.copyOf(datos, datos.length);
        RadixSort.sort(copia);
        assertArrayEquals(datosOrdenados, copia);
    }
    
    @Test
    @DisplayName("RadixSort: Maneja array vacío")
    public void testRadixSortEmpty() {
        Integer[] copia = Arrays.copyOf(datosVacios, datosVacios.length);
        assertDoesNotThrow(() -> RadixSort.sort(copia));
        assertArrayEquals(datosVacios, copia);
    }
    
    @Test
    @DisplayName("RadixSort: Maneja array con un elemento")
    public void testRadixSortSingleElement() {
        Integer[] copia = Arrays.copyOf(datosUnElemento, datosUnElemento.length);
        RadixSort.sort(copia);
        assertArrayEquals(datosUnElemento, copia);
    }
    
    @Test
    @DisplayName("RadixSort: Ordena array ya ordenado")
    public void testRadixSortAlreadySorted() {
        Integer[] copia = Arrays.copyOf(datosOrdenados, datosOrdenados.length);
        RadixSort.sort(copia);
        assertArrayEquals(datosOrdenados, copia);
    }
    
    @Test
    @DisplayName("RadixSort: Ordena array en orden inverso")
    public void testRadixSortReverse() {
        Integer[] copia = Arrays.copyOf(datosInverso, datosInverso.length);
        RadixSort.sort(copia);
        assertArrayEquals(datosOrdenados, copia);
    }
    
    @Test
    @DisplayName("RadixSort: Ordena array con números grandes")
    public void testRadixSortLargeNumbers() {
        Integer[] numerosGrandes = new Integer[]{9999, 1234, 5678, 100, 42};
        Integer[] esperado = new Integer[]{100, 42, 1234, 5678, 9999};
        RadixSort.sort(numerosGrandes);
        assertArrayEquals(esperado, numerosGrandes);
    }
    
    // ==================== MedidorTiempo Tests ====================
    @Test
    @DisplayName("MedidorTiempo: Mide tiempo de ejecución correctamente")
    public void testMedidorTiempoPositivo() {
        long tiempo = MedidorTiempo.medir(() -> {
            // Simular trabajo que toma tiempo
            long suma = 0;
            for (int i = 0; i < 1000000; i++) {
                suma += i;
            }
        });
        assertTrue(tiempo > 0, "El tiempo medido debe ser positivo");
    }
    
    @Test
    @DisplayName("MedidorTiempo: Detecta diferencias de tiempo entre operaciones")
    public void testMedidorTiempoComparison() {
        long tiempoCorto = MedidorTiempo.medir(() -> {
            int x = 1 + 1;
        });
        
        long tiempoLargo = MedidorTiempo.medir(() -> {
            long suma = 0;
            for (int i = 0; i < 10000000; i++) {
                suma += i;
            }
        });
        
        assertTrue(tiempoLargo > tiempoCorto, 
            "La operación larga debe tomar más tiempo que la operación corta");
    }
}
