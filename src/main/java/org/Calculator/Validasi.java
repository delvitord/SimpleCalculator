package org.Calculator;

public class Validasi {
    public static boolean isNumeric(String str) {
        if (str == null) {
            return false;
        } else {
            try {
                double d = Double.parseDouble(str);
            } catch (NumberFormatException nfe) {
                return false;
            }
            return true;
        }
    }


    public static boolean isValidOperator(String operator) {
        if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")){
            return true;
        } else {
            return false;
        }
    }
}
