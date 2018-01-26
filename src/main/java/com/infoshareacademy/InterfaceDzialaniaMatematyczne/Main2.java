package com.infoshareacademy.InterfaceDzialaniaMatematyczne;




import java.util.Scanner;

public class Main2 {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main2 main2 =new Main2();
        Computation computation;

        if (main2.shouldMultiply()){
            computation = new Multiplication();

        }
        else {
            computation = new Addition();
        }
        double arg1 = main2.getArg();
        double arg2 = main2.getArg();

        double result = computation.compute(arg1, arg2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply(){
        System.out.println("Co chcesz zrobić? Naciśnij M i <Enter>, jeśli ma to być mnożenie. W innym wypadku bedzie to dodawanie.");
        return  scanner.next().equals("M");

    }
    private double getArg(){

        System.out.println("Podaj liczbę " );

        return scanner.nextDouble();
    }
}
