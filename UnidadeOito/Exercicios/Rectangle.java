package org.udemy.UnidadeOito.Exercicios; // pertence ao package org.udemy.UnidadeOito.Rectangle

// Rectangle.java

// Classe Rectangle com atributos width (largura), height (altura) e métodos Area(), Perimeter() e Diagonal()

import java.math.*;


public class Rectangle {

    public double width;
    public double  height;


    //  Metodo para retornar área  do retangulo
    public double  Area(){

        return width * height;
    }


    // Método para  retornar perímetro do retângulo
    public double Perimeter(){

        return 2  * width + 2 * height;
    }


    // Método para  retornar diagonal do retângulo
    public double Diagonal() {

        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

}
