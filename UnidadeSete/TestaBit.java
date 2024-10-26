// TestaBit.java

// Utiliza operador BitWise para verificar valor lógico de um bit específico


import java.util.Scanner; //  Utiliza Scanner


public class TestaBit {

    // Inicia execução do programa
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        int mask = 0b100000;
        int n = sc.nextInt();

        if ((mask & n) != 0)
            System.out.println("O sexto bit não é zero");

    } // fim da main

} // fim da classe TestaBit
