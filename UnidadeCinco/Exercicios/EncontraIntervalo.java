// EncontraIntervalo.java

// Lê um número qualquer, informa o intervalo que ele pertence. Caso não seja encontrado, exibe a mensagem "Fora de intervalo"


// Utiliza Scanner
import java.util.Scanner;


public class EncontraIntervalo {

    // inicia execução do programa
    public static void  main (String[] args ){

        // Habilita recebimento de informações via janela de comando
        Scanner sc = new Scanner (System.in);

        // Lê um número qualquer o armazena na variável numero
        double numero = sc.nextDouble();


        if (numero >= 0 && numero <= 25)
            System.out.println("Intervalo [0,25]");

        else if (numero > 25 && numero <= 50)
            System.out.println("Intervalo (25,50]");

        else if (numero > 50 && numero <=75)
            System.out.println("Intervalo (50,75]");

        else if (numero > 75 && numero <= 100)
            System.out.println("Intervalo (75,100]");

        else
            System.out.println("Fora de intervalo");


        sc.close(); // encerra objeto Scanner

    } // fim da main

} // fim da classe EncontraIntervalo
