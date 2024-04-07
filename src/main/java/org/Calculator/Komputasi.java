package org.Calculator;

public class Komputasi {

    public static double kurang(double operand1, double operand2) {
        double hasil = operand1 - operand2;

        return hasil;
    }
    public static double tambah(double operand1, double operand2) {
        double hasil = operand1 + operand2;

        return hasil;
    }

    // Method untuk perkalian
    public static double kali(double operand1, double operand2) {
        double hasil = operand1 * operand2;

        return hasil;
    }

    // Method untuk pembagian
    public static double bagi(double operand1, double operand2) {
        if (operand2 == 0) {
            throw new IllegalArgumentException("Tidak bisa melakukan pembagian dengan nol!");
        }
        return operand1 / operand2;
    }
}
