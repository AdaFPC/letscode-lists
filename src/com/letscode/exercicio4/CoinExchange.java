package com.letscode.exercicio4;

import com.letscode.Reader;

public class CoinExchange {

    public static void print(double dolar, double real){
        System.out.printf("CAD$ %.02f \n", (real / dolar));

    }

    public static void execute(){
        System.out.println("Exercicio 04 - Conversor de Moedas");
        double dolar = Reader.readDouble("Digite a cotação do dolar");
        double real = Reader.readDouble("Digite o valor, em reais, a ser convertido");
        print(dolar, real);
        System.out.println("---------------------------------------------------");
    }
}
