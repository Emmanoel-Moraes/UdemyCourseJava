// FuncoesMath.java

// Demonstra brevemente algumas funções matemáticas da lib Math


public class FuncoesMath {

    // inicia execução do programa
    public static void main (String [] args){

        // Declaração de variáveis
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        // Ra[iz quadrada de x
        A = Math.sqrt(x);

        // Raíz quadrada de y
        B = Math.sqrt(y);

        // Raíz quadrada de 25
        C = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        // x ^ y
        A = Math.pow(x,y);

        // x ^ 2
        B = Math.pow(x, 2.0);

        //  5 ^ 2
        C = Math.pow(5.0, 2.0);

        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + C);
        System.out.println("5 elevado ao quadrado = " + C);


        // Módulo de y
        A = Math.abs(y);

        // Módulo de z
        B = Math.abs(z);

        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);


    } // fim da main

} // fim da classe FuncoesMath
