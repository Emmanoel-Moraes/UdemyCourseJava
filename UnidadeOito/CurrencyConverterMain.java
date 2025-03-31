package org.udemy.UnidadeOito; // pertence ao package


// Lê a cotação do dólar, um valor  em  dólares a ser comrpado por uma pessoa em reais, informa quanto a pesssoa pagará pelos dólares considerando 6% de IOF sobre o valor em dolar


import java.util.Locale; // utiliza Locale
import java.util.Scanner; // utiliza Scanner

import static org.udemy.UnidadeOito.Exercicios.CurrrencyConverter.dollarToReal; // usa   método static da classe CurrencyConverter

public record CurrencyConverterMain() {

    // inicia execução
    public static void main (String [] args){


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // prompt
        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        // promt
        System.out.print("How many dollars will be bought? ");
        double dollarAmount = sc.nextDouble();

        // Resultado do valor em reais a ser pago
        System.out.printf("Amount to be paid in reais = %.2f", dollarToReal(dollarAmount, dollarPrice));


    } // fim da main

} // fim da classe CurrencyConverterMain
