// ExpressoesAritmeticas.java
// Demonstra as expressões aritméticas na linguagem java realizando algumas operações matemática

import java.util.Locale; // utilizar padrão brasileiro de idioma e símbolos

public class ExpressoesAritmeticas {

    // inica execução
    public static void main (String[] args){

        Locale locale = new Locale("pt", "BR");
        // sejam a e b inteiros, com a = 2 e b = 9
        int a = 2, b = 9;

        // Então o resultado da expressão a + 3 x b - (a+b)/a é dado por
        int resultadoInteiro = a + 3 * b - (a+b) / a;

        // No entanto, se o resultado desejado for do tipo decimal, temos:
        double resultadoDecimal = a + 3 * b - (a+b) / (double) a;

        // Exibe o resultado inteiro
        System.out.println("O resultado inteiro é: " + resultadoInteiro);

        // Exibe o resultado decimal, com duas casas de precisão
        System.out.printf("O resultado deicmal é %.2f", resultadoDecimal);

    } // fim da main

} // fim da classe expressoesNumericas
