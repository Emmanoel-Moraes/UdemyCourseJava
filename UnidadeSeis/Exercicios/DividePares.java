// DividePares.java

// Lê N pares de números e mostra a divisão do primeiro pelo segundo, se o denominador for zero exibe mensagem "divisão impossível"


import java.util.Scanner; // Utiliza Scanner

public class DividePares {

    // Inicia execução do programa
    public static void main (String[] args){

        // Habilita leitura de dados via janela de comando
        Scanner sc = new Scanner (System.in);

        // Lê inteiro e armazena em N
        int N = sc.nextInt();

        for (int i = 0; i < N; i++){

            // Lê dois inteiros e armazena
            int num1 = sc.nextInt(), num2 = sc.nextInt();

            // Se denomidador igual a zero
            if (num2 == 0){
                System.out.println("divisão impossível");
                continue; // passa para o próximo i
            }

            System.out.println(num1 / (double) num2);
        }

        sc.close(); // encerra objeto scanner

    } // fim da main

} // fim da classe DividePares
