package com.company;

public class Main {

    public static void main(String[] args) {

        String inputOne="1A3d4s5t";
        boolean resultOne = example(inputOne);
        System.out.println(resultOne);
        String inputTwo="A2bb2d4";
        boolean resultTwo = example(inputTwo);
        System.out.println(resultTwo);
    }
    private static boolean example(String Result) {
        boolean m = true;
        boolean n = true;
        for (int i = 0; i < Result.length() - 1; i++) {
            m = Character.isDigit(Result.charAt(i));
            n = Character.isDigit(Result.charAt(i + 1));
            if (m == n){
                return true;
            }
        }
        return false;
    }
}

