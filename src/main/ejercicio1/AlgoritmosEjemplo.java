package main.ejercicio1;

public class AlgoritmosEjemplo {

    // 1. Imprimir todos los elementos de un arreglo
    public static void imprimirArreglo(int[] arr) {
        for (int n : arr) { //O(n)
            System.out.print(n + " "); //O(1)
        }
    }

    // 2. Búsqueda lineal
    public static int busquedaLineal(int[] arr, int clave) {
        for (int i = 0; i < arr.length; i++) { //O(n)
            if (arr[i] == clave) //O(1)
                return i;
        }
        return -1;
    }

    // 3. Búsqueda binaria (arreglo ordenado)
    public static int busquedaBinaria(int[] arr, int clave) {
        int izquierda = 0, derecha = arr.length - 1;
        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;  //O(1)
            if (arr[medio] == clave) //O(1)
                return medio;
            if (arr[medio] < clave) //O(1)
                izquierda = medio + 1;
            else
                derecha = medio - 1; //O(1)
        }
        return -1;
    }

    // 4. Factorial recursivo 
    public static int factorial(int n) {
        if (n == 0) //O(1)
            return 1;
        return n * factorial(n - 1);
    }

    // 5. Fibonacci recursivo
    public static int fibonacci(int n) {
        if (n <= 1) //O(1)
            return n;  
        return fibonacci(n - 1) + fibonacci(n - 2); //O(2^n)
    }

    // 6. Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length; //O(1)
        for (int i = 0; i < n - 1; i++) { //O(n)
            for (int j = 0; j < n - 1 - i; j++) { //O(n)
                if (arr[j] > arr[j + 1]) { //O(1)
                    int temp = arr[j]; //O(1)
                    arr[j] = arr[j + 1]; //O(1)
                    arr[j + 1] = temp; //O(1)
                }
            }
        }
    }

    // 7. Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) { //O(1)
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; //O(1)
        int i = (low - 1); //O(1)
        for (int j = low; j < high; j++) { //O(n)
            if (arr[j] <= pivot) { //O(1)
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // 8. Suma de matriz (matriz cuadrada n x n)
    public static int sumaMatriz(int[][] matriz) {
        int suma = 0;
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    // 9. Encontrar el máximo en un arreglo
    public static int encontrarMaximo(int[] arr) {
        int max = arr[0];
        for (int n : arr) {
            if (n > max)
                max = n;
        }
        return max;
    }

    // 10. Potencia recursiva 
    public static int potencia(int base, int exponente) {
        if (exponente == 0)
            return 1;
        return base * potencia(base, exponente - 1);
    }
}
