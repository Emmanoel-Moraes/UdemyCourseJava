// Q2AreaDoCirculo.java

// Exercício 2
// Proposta:
// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
// casas decimais


import java.util.Locale; // Utiliza padrão US
import java.util.Scanner; // Utiliza recebimento de dados via prompt

public class Q2AreaDoCirculo {


    // inicia execução
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in); // habilita recebimento de dados via janela de comando

        // Instancia raio e área
        double raio, area;
        double pi = 3.14159;

        raio = sc.nextDouble();

        // calcula área do círculo
        area = pi * Math.pow(raio, 2.0);

        // Exibe área do cículo calculada
        System.out.printf("A = %.4f", area);


    } // fim da main

} // fim da classe Q2AreaDoCirculo
