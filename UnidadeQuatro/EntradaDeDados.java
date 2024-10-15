// EntradaDeDados.java

// Demonstra de forma simplificada o processo de entrada de dados por meio de janela de comando


import java.util.Scanner; // Classe Scanner é utilizada para possibilitar a inserção de dados

public class EntradaDeDados {


    // inicia a execução do programa
    public static void main (String [] args) {


        // Objeto Scanner instanciado - habilita o recebimento de dados via teclado/prompt
        Scanner input = new Scanner(System.in);

        String x;
        x = input.next(); // x recebe o valor do tipo  String inserido pelo usuário (até o primeiro espaço)

        String y;
        y = input.nextLine(); // recebe String inserida pelo usuário (até o primeiro Enter)

        // Demonstração de recebimento de elemento Unicode
        char letra;
        letra = input.next().charAt(0);

        //  Demonstração de recebimento de inteiro
        int inteiro;
        inteiro = input.nextInt(); // recebe o inteiro inserido pelo usuário

        //  Demonstração de recebimento de decimal (float)
        float numeroDecimalSimples;
        numeroDecimalSimples = input.nextFloat();

        //  Demonstração de recebimento de decimal (double)
        double numeroDecimalComposto;
        numeroDecimalComposto = input.nextDouble(); // recebe número decimal inserido pelo usuário

        //  Demonstração de recebimento de valor booleano
        boolean valorVerdade;
        valorVerdade = input.nextBoolean();

        // Demonstração de recebimento de número com 8 bits
        byte numeroByte;
        numeroByte = input.nextByte();

        // Demonstração de recebimento de número com 16 bits
        short numeroShort;
        numeroShort = input.nextShort();

        // Demonstração de recebimento de número com 32 bits
        long numeroLong;
        numeroLong = input.nextLong();


        // encerra objeto Scanner
        input.close();


    } // fim da main

} // fim da classe EntradaDeDados
