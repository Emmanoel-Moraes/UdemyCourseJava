// LinhasQuadradosECubos.java

// Lê um inteiro N, exibe N linhas e para cada linha exibe a respectiva potência quadrada e cúbica

import java.util.Scanner; // Utiliza Scanner

public class LinhasQuadradosECubos {

    // Inicia execução do programa
    public static void main (String[] args){

        // Habilita recebimento de dados pela janela de comando
        Scanner sc = new Scanner (System.in);

        // Lê um inteiro e armazena
        int N = sc.nextInt();

        // laço de repetição
        for (int i = 1; i <= N; i++){

            // Exibe linha, quadrado e cubo do número i
            System.out.printf("%d %d %d\n", i, (int) Math.pow(i, 2), (int) Math.pow(i,3));

        }

        sc.close(); // encerra objeto scanner

    } // fim da main

} // fim da classe LinhasQuadradosECubos