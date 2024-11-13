// AreaDoTriangulo.java

// Utilizando POO com classe Triangulo para realizar cálculo da área de dois triângulos, exibindo o resultado e o triânglo com maior área

import entities.Triangulo;

import java.util.Scanner; // UtilizaScanner
import java.util.Locale; // Utiliza Locale

public class AreaDoTriangulo {

    // Incia execução do programa
    public static void main (String[] args){

        // Habilita leitura de dados via janela de comando
        Scanner sc = new  Scanner (System.in);
        // Instancia triangulo X e Y
        Triangulo X = new Triangulo();
        Triangulo Y = new Triangulo();

        System.out.println("Enter the measures of triangle X");

        // Lê lados do triângulo X
        X.setA(sc.nextDouble());
        X.setB(sc.nextDouble());
        X.setC(sc.nextDouble());

        // prompt
        System.out.println("Enter the measures of triangle Y");

        // Lê lados do triângulo Y
        Y.setA(sc.nextDouble());
        Y.setB(sc.nextDouble());
        Y.setC(sc.nextDouble());


        double areaX = X.areaTriangulo();
        double areaY = Y.areaTriangulo();

        // Exibe áreas de X e Y
        System.out.printf("Triangle X area: %.4f\n",areaX);
        System.out.printf("Triangle Y area: %.4f\n",areaY);

        // Exibindo o triângulo que possui maior área
        if (areaX > areaY)
            System.out.println("Larger area: X");
        else if (areaX < areaY)
            System.out.println("Larger area: Y");
        else
            System.out.println("Both triangles are equals");

        sc.close(); // encerra objeto scanner

    } // fim da main

} //AreaDoTriangulo