// FuncoesString.java

// Detalha de forma simplificada algumas funções pertecentes à classe String


public class FuncoesString {

    // Inicia  execução do  programa
    public static void main (String [] args){


        String original = "abcde FGHIJ ABC abc DEFG    ";
        String s01 = original.toLowerCase(); // converte string original em minúscula
        String s02 = original.toUpperCase(); // converte string original em maiúscula
        String s03 = original.replace('a', 'x'); // troca a por X
        String s04 = original.trim(); // elimina espaços nas bordas
        String s05 = original.substring(2); // gera string a partir da segunda posição
        String s06 = original.substring(2, 9); // gera string a partir da segunda posição até a posição 9
        String s07 = original.replace("abc", "xy"); // troca abc por xy
        int s08 = original.indexOf("I"); // posição do I
        int s09 = original.lastIndexOf("abc"); // última ocorrência da string abc



        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("replace a por x: -" + s03 + "-");
        System.out.println("trim: -" + s04 + "-");
        System.out.println("substring 2: -" + s05 + "-");
        System.out.println("substring 2,9: -" + s06 + "-");
        System.out.println("replace abc por xy: -" + s07 + "-");
        System.out.println("indexOff: -" + s08 + "-");
        System.out.println("lastIndexOff: -" + s09 + "-");

    } // fim da main

} // fim da classe FuncoesString
