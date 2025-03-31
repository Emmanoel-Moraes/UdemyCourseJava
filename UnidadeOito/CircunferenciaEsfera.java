package org.udemy.UnidadeOito; // pertence ao package

import java.math.*;

public class CircunferenciaEsfera {

    public double raio; // atributo raio


    //  retorna valor da circunferência do raio
    public double circunferência() {
        return 2 * Math.PI * raio;
    }


    //  retorna volume da esfera com o raio
    public double volume() {
        return 4 / 3.0 * Math.PI * Math.pow(raio, 3);
    }


    public String toString(){
        return "Circunference: " + String.format("%.2f", circunferência()) +
                "\nVolume: " + String.format("%.2f", volume()) +
                "\nPI value: " + String.format("%.2f", Math.PI);
    }



}
