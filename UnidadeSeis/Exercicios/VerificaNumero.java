// VerificaNumero.java

// Lê N inteiros (onde N é inserido pelo usuário), calcula quantos desses valores estão dentro do intervalo [10,20] e quantos estão fora, mostrando no final a contagem desses valores


import java.util.Scanner; // Utiliza Scanner


public class VerificaNumero {

    // Inicia execução do programa
    public  static void main (String [] args){

        // Habilita leitura de dados via janela de comando
        Scanner sc = new Scanner(System.in);

        // Lê um inteiro e armazena em N
        int N = sc.nextInt(),
        intervaloIn  = 0, intervaloOut = 0; // contadores dos intervalos

        // Contador para o while
        int cont = 0;

        while (cont < N){

            // Lê número inserido na janela de comando e armazena o valor
            int numero = sc.nextInt();

            // Se pertencer ao intervalo [10,20]
            if (numero >= 10 && numero <= 20)
                intervaloIn++; // incrementa em 1 intervaloIn

            else // caso contrário
                intervaloOut++; // incrementa em 1 intervaloOut

            cont++; // incrementa contador do laço While
        }

        System.out.println(intervaloIn + " in");
        System.out.println(intervaloOut + " out");

        sc.close(); // encerra objeto Scanner
        
    } // fim da main

} // fim da classe VerificaNumero
