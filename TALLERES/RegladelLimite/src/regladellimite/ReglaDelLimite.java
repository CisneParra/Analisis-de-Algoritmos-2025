/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package regladellimite;

/**
 *
 * @author natsu
 */
public class ReglaDelLimite {

    // Función que representa el algoritmo a analizar
    public static long f(int n) {
        return 6L * n * n * n - 4L * n * n + 2L * n + 8;
    }

    public static void main(String[] args) {
        System.out.println("Análisis de la función f(n) = 6n³ - 4n² + 2n + 8");
        System.out.printf("%-10s %-15s\n", "n", "f(n)");

        for (int n = 1; n <= 20; n++) {
            System.out.printf("%-10d %-15d\n", n, f(n));
        }
    }
}

