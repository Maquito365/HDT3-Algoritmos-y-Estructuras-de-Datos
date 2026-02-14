package com.template;

import java.io.*;
import java.util.*;
public class FileManager {
    
    public static void generateFile (String filename, int size) throws IOException { //genera un archivo con números aleatorios
        Random random = new Random();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) { //se crea un BufferedWriter para escribir en el archivo
            for (int i = 0; i < size; i++) {
                int number = random.nextInt(1000); //genera un número aleatorio entre 0 y 999
                writer.newLine();
            }
            writer.close();
        }
    }

    public static Integer[] readFile(String filename) throws IOException{ //lee un archivo y devuelve un array de Integer con los números leídos
        List<Integer> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) { //se crea un BufferedReader para leer el archivo
            String line;
            while ((line = reader.readLine()) != null) { //
                list.add(Integer.parseInt(line));
            }
            reader.close();
            return list.toArray(new Integer[0]);
        }
        
    }
}
