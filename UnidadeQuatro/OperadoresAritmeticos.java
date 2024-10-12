// OperadoresAritmeticos.java
// Demonstração dos operadores existentes na linguagem java através de testes e atribuições


import java.util.Locale;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        int x = 10; //  x recebe valor
        int y = x - 3; // y recebe valor
        int birdsInTheFeather = 20; // birdsInTheFeather recebe valor

        double totalValueShopping = 1412.69; // totalValueShopping recebe valor
        double kmDriven = 7.5; //kmDriven recebe valor

        // operadores
        // soma: +
        // subtração: -
        // multiplicação: *
        // divisão: /
        // resto: %

        System.out.println("x + y: " + (x + y));
        System.out.println("Total Value - $ 200 cash: " + (totalValueShopping - 200));
        System.out.printf("KM by 3 hours: %.2f\n", (kmDriven / 3));
        System.out.println("Integer division in x by y: " + (x / y));
        System.out.println("Decimal division in x by y: " + ((double) x / y));
        System.out.println("x * y: " + x * y);
        System.out.println("Module y by x: " + (y % x));
        System.out.println("Birds in the feather is " + 5 * birdsInTheFeather + "% perfect! :)");

    } // fim da main

} // fim da classe OperadoresAritmeticos.java