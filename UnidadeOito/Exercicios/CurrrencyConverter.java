package org.udemy.UnidadeOito.Exercicios;

public class CurrrencyConverter {

    public static double IOF = 0.06;

    public static double dollarToReal(double amount, double dollarPrice){

        return (amount * dollarPrice) + (amount * dollarPrice * IOF);
    }















}
