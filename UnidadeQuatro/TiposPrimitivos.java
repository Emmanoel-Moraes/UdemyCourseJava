// TiposPrimitivos.java
// Declara variáveis com tipos primitivos em Java, inicializa-as e em seguida exibe um painel com os principais tipos de dados da linguagem


public class TiposPrimitivos {

    public static void main(String [] agrs){


        //Declarando os principais tipos primitivos em Java:


        // declara os tipos primitivos inteiros
        int numeroInteiro;
        byte inteiroCom8Bits;
        short inteiroCom16Bits;
        long inteiroCom32Bits;

        // tipos primitivos com ponto flutuante
        float decimalSimples; // menor precisão
        double decimalComposto; // maior precisão

        // tipo primitivo Unicode
        char caractere;

        // tipo primitivo para cadeia de caracteres
        String texto;

        // tipo primitivo lógico
        boolean booleano;


        // inicializando variáveis
        numeroInteiro = -4; // 2 ^ 9 -> 0 a 999999999
        inteiroCom8Bits = 127; // 2 ^ 3 -> 0 a 127
        inteiroCom16Bits = -9999; // 2 ^ 4 -> 0 a 9999
        inteiroCom32Bits = 999999999; // 2 ^ 9 -> 0 a 999999999
        decimalSimples =  562f; // = 562,00
        decimalComposto = 9338.90;
        caractere = 'B';
        texto = "The forest is a wild place to live";
        booleano = true;


        System.out.println("Principais tipos primitivos:");
        System.out.println("int -> inteiro com sinal, compreende 2^9 bits" + " -> exemplo: " + numeroInteiro);
        System.out.println("byte -> inteiro com 8 bits ou 2^3 " + " -> exemplo: " + inteiroCom8Bits);
        System.out.println("short -> inteiro com 16 bits ou 2^4" + " -> exemplo: " + inteiroCom16Bits);
        System.out.println("long -> inteiro com 32 bits ou 2^5" + " -> exemplo: " + inteiroCom32Bits);
        System.out.println("float -> decimal com precisão simples" + " -> exemplo: " + decimalSimples);
        System.out.println("double -> decimal com dupla precisão" + " -> exemplo: " + decimalComposto);
        System.out.println("char -> caractere no formato unicode" + " -> exemplo: " + caractere);
        System.out.println("String -> cadeia de caracteres" + " -> exemplo: " + texto);
        System.out.println("Boolean -> valor lógico" + " -> exemplo: " + booleano);


















    } // fim da main
} // fim da classe TiposPrimitivos
