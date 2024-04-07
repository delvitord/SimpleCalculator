package org.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inginLagi = true;

        while (inginLagi) {
            System.out.print("Masukkan operand 1: ");
            String operand1Str = scanner.nextLine();

            if (!Validasi.isNumeric(operand1Str)) {
                System.out.println("Input operand 1 tidak valid!");
                return;
            }

            System.out.print("Masukkan operator (+, -, *, /): ");
            String operator = scanner.nextLine();

            if (!Validasi.isValidOperator(operator)) {
                System.out.println("Operator tidak valid!");
                return;
            }

            System.out.print("Masukkan operand 2: ");
            String operand2Str = scanner.nextLine();
            if (!Validasi.isNumeric(operand2Str)) {
                System.out.println("Input operand 2 tidak valid!");
                return;
            }



            double operand1 = Double.parseDouble(operand1Str);
            double operand2 = Double.parseDouble(operand2Str);
            double hasil = 0;

            switch (operator) {
                case "+":
                    hasil = Komputasi.tambah(operand1, operand2);
                    break;
                case "-":
                    hasil = Komputasi.kurang(operand1, operand2);
                    break;
                case "*":
                    hasil = Komputasi.kali(operand1, operand2);
                    break;
                case "/":
                    hasil = Komputasi.bagi(operand1, operand2);
                    break;
            }

            System.out.println("\nHasil dari " + operand1 + " " + operator + " " + operand2 + " = " + hasil);

            // Tanyakan apakah ingin menggunakan kalkulator lagi
            System.out.print("\nIngin menggunakan kalkulator lagi? (y/n): ");

            String jawaban = scanner.nextLine();
            if (!jawaban.equalsIgnoreCase("y")) {
                inginLagi = false;
            }
        }

        System.out.println("Terima kasih telah menggunakan kalkulator!");
    }
}