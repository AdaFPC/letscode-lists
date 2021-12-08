package com.letscode.exercicio5;

import com.letscode.Reader;

public class Metric {
    public static double convertToCentimeter(double number){
        return  number * 2.54;
    }

    public static void print(double number){
        System.out.printf("%.02f cm\n",convertToCentimeter(number));

    }

    public static void execute(){
        System.out.println("Exercicio 05 - Conversor de Medidas");
        double firstNumber = Reader.readDouble("Digite as medidas em polegadas");
        print(firstNumber);
        System.out.println("---------------------------------------------------");
    }
}
