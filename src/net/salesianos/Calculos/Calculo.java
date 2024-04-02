package net.salesianos.Calculos;

public class Calculo {
    public static void factorialDeN(int n) {
        int numero = 1;
        int multiplicador = 1;
        for (int i = 1; i <= n; i++) {
            numero = i + multiplicador;
            multiplicador++;

        }
        System.out.println(numero);
    }

    public static void calculoPorcentual(int[] n, int porcentaje) {
        int resultado;
        for (int i = 0; i < n.length; i++) {
            resultado = n[i] * porcentaje / 100;
            n[i] = resultado;

        }

    }
}
