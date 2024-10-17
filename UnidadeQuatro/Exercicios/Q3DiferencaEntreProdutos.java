// Q3DiferencaEntreProdutos.java

// Exercício 3
// Proposta:
// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
// de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).


import java.util.Scanner; // utiliza Scanner para ler os valores inseridos pelo usuário

public class Q3DiferencaEntreProdutos {

    // inicia execução do programa
    public static void main (String[] args){

        // Habilita leitura de dados via janela de comando
        Scanner sc = new Scanner(System.in);


        // instanciando valores inteiros
        int A, B, C, D, diferenca;

        // Os quatro valores coletados por Scanner serão postos em suas respectivas variáveis
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        // calcula diferença entre os produtos A*B - C*D
        diferenca =  A * B - C * D;

        //exibe diferença
        System.out.println("DIFERENÇA = " + diferenca);


    } // fim da main

} // fim da classe Q3DiferencaEntreProdutos
