// VerificaSenhaComWhile.java

// Realiza leitura de uma senha até que seja válida, informando quando está incorreta


import java.util.Scanner; // Utiliza Scanner


public class VerificaSenhaComWhile {

    // Inicia execução do programa
    public static void main (String [] args){

        // Habilita leitura de dados via janela de comando
        Scanner sc = new Scanner(System.in);

        // Lê um inteiro e armazena em password
        int password = sc.nextInt();

        // Enquanto senha incorreta
        while (password != 2002){
            System.out.println("Senha inválida");
            password = sc.nextInt();
        }

        //Senha correta digitada
        System.out.println("Acesso permitido");
        
        sc.close(); // encerra objeto scanner

    } // fim da main

} // fim da classe
