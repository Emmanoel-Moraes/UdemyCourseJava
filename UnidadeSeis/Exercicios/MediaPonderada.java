// MediaPonderada.java

// Lê N vezes (onde N é inserido pelo usuário), 3 conjuntos de valores decimais inseridos (cada conjunto com 3 elementos), calcula a média ponderada e exibe o resultado

import java.util.Scanner; // Utiliza Scanner
import java.util.Locale; // Utiliza Locale

public class MediaPonderada {

    // Inicia execução do programa
    public static void main (String [] args){

        // Define padrão US para leitura e exibição de dados
        Locale.setDefault(Locale.US);
        // Habilita leitura de dados via janela de comando
        Scanner sc = new Scanner (System.in);


        // Lê um inteiro e armazena em N
        int N = sc.nextInt();

        // Realiza N vezes o loop
        for (int i = 0; i < N; i++){

            // Lê e armazena 3 inteiros
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            // Calcula media ponderada
            double mediaPonderada = (2 * a + 3 * b + 5 * c) / 10;

            // Exibe média ponderada
            System.out.printf("%.1f\n", mediaPonderada);
        }

        sc.close(); // encerra objeto Scanner

    } // fim da main

} // fim da classe MediaPonderada
