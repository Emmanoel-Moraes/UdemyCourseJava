package org.udemy.UnidadeOito.Exercicios; // Pertence ao package org.udemy.UnidadeOito.Rectangle

// RectangleMain.java

// Programa utiliza classe Rectangle para gerar objeto e  manipulá-lo, inserindo compprimento, largura, calculando e exibindo área, perímetro e  diagonal, respectivamente


import java.util.Scanner; // Utiliza Scanner


public class RectangleMain {

    // Início da execução
    public static void main (String[] args){

        // utiliza Scanner para ler objetos
        Scanner sc = new Scanner(System.in);

        // Objeto rectangle é instanciado
        Rectangle rectangle = new Rectangle();


        // Prompt
        System.out.println("Enter rectangle width and height:");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.printf("AREA: %.2f\n", rectangle.Area()); // Exibe área do retângulo

        System.out.printf("PERIMETER: %.2f\n", rectangle.Perimeter()); //Exibe perímetro do retângulo

        System.out.printf("DIAGONAL: %.2f\n", rectangle.Diagonal()); // Exibe diagonal do retângulo

    } // fim da main

} // fim da classe  RectangleMain
