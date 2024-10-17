// Q6CalculaAreas.java

// Exercício 6
// Proposta:
// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B, C.  Em seguida, calcule e mostre:
//      a) área do triângulo retângulo que tem A por base e C por altura.
//      b) área do círculo de raio C. (pi = 3.14159)
//      c) área  do trapézio que tem A e  B por bases e C por altura.
//      d) área do quadrado que tem lado B.
//      e) área do retângulo que tem lados A e B.


import java.util.Scanner; // utiliza Scanner
import java.util.Locale; // utiliza Locale

public class Q6CalculaAreas {

    // Inicia execução do programa
    public static void main (String [] args){

        // Habilita padrão US
        Locale.setDefault(Locale.US);

        // Habilita leitura de dados via janela de comando
        Scanner sc = new Scanner(System.in);

        // Valores para manipulação
        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        // Lendo A B e C
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();


        // Calcula área do triângulo retângulo
        triangulo = A * C / 2.0;

        // Calcula área do círculo
        circulo = 3.14159 * C * C;

        // Calcula área do trapézio
        trapezio = ((A + B) * C)  / 2;

        // Calcula área do quadrado
        quadrado = B * B;

        // Calcula área do retângulo
        retangulo = A * B;


        // Exibe áreas calculadas
        System.out.printf("TRIANGULO: %.3f\n" +
                          "CIRCULO: %.3f\n" +
                          "TRAPEZIO: %.3f\n" +
                          "QUADRADO: %.3f\n" +
                          "RETANGULO: %.3f", triangulo, circulo, trapezio,quadrado, retangulo);

   } // fim da main

} // fim da classe Q6CalculaAreas
