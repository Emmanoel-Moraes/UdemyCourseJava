// OperadorTernario.java

// Demonstra aplicação do operador ternário na resolução de um problema.


public class OperadorTernario {

    // Inicia execuão do programa
    public static void main (String[] args){

        double preco = 34.5;
        double desconto;

                // condição ? valor se verdadeiro : valor se falso
        desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto);

    } // fim da main

} // fim da classe OperadorTernario
