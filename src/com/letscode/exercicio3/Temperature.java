package com.letscode.exercicio3;

import com.letscode.Reader;

public class Temperature {
    public static double convertToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static void print(double celsius){
        System.out.println(convertToFahrenheit(celsius));

    }

    public static void execute(){
        System.out.println("Exercicio 03 - Conversor de Temperatura");
        double firstNumber = Reader.readDouble("Digite a temperatura em Celsius");
        print(firstNumber);
        System.out.println("---------------------------------------------------");
    }
}

