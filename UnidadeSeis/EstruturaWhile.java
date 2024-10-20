// EstruturaWhile.java

// Demontrando  funcionamento da estrura de repetição while


import java.util.Scanner; // Utiliza Scanner


public class EstruturaWhile {

    // Inicia execução do programa
    public static void  main (String[] args) {

        // habilita leitura de dados via janela de comando
        Scanner sc = new Scanner(System.in);

        // Lê número inserido via prompt de comando e atribui a num
        int num = sc.nextInt();

        // Enquanto o número inserido não for zero
        while (num != 0) {
            num = sc.nextInt(); // Lê número atribui a num
        }

        sc.close(); // encerra objeto scanner

    } // fim da main

} // fim da classe EstruturaWhile
