package main.ejercicio2;
import java.util.HashSet;

public class RespuestasOptimizadas {
    // El estudiante debe escribir aquí las versiones optimizadas y las
    // complejidades

    // 1. Versión optimizada de tieneDuplicados (Complejidad anotada en la variable)
    public static String tieneDuplicadosComplejidad = "O(n) + O(1) + O(1) = O(n)";


    public static boolean tieneDuplicadosOpt(int[] arr) {
        HashSet<Integer> vistos = new HashSet<>(); //tabla hash 
        for(int num : arr) {  //O(n)
            if (vistos.contains(num)) { //O(1)
                return true; // Duplicado encontrado
            }
            vistos.add(num); //O(1)
        }
        return false; // No hay duplicados
    }

    // 2. Versión optimizada de contarMayores (Complejidad anotada en la variable)
    public static String contarMayoresComplejidad = "6* O(1) + O(n) = O(n)";

    public static int contarMayoresOpt(int[] arr, int x) {
        int contador = 0; //O(1)
        int max = Integer.MIN_VALUE; //O(1)

        for (int i = 0; i < arr.length; i++) { //O(n)
            if (arr[i] > x && arr[i] >= max) { //O(1)
                contador++; //O(1)
            }
            if (arr[i] > max) { //O(1)
                max = arr[i]; // O(1)
            }
        }
        return contador;
    }

    // 3. Versión optimizada de encontrarMaximo (Complejidad anotada en la variable)
    public static String encontrarMaximoComplejidad = ""; 

    public static int encontrarMaximoOpt(int[] arr) {

        return 0;
    }
}
