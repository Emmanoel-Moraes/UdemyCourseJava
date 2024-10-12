// FormataçãoDeTexto.java
// Programa utiliza as variáveis declaradas e instanciadas previamente para demonstrar a formatação de Strings

import java.util.Locale; // utiliza Locale

public class FormatacaoDeTexto {

    public static void main (String [] args) {

        Locale localeBrazil = new Locale("pt", "BR");

        String product1 = "Computer"; // product1 do tipo String é inicializado
        String product2 = "Office desk"; // product2 do tipo String é inicializado

        int age = 30; // age do tipo int é inicializado
        int code = 5290; // code do tipo int é inicializado
        char gender = 'F'; // gender do tipo char é inicializado

        double price1 = 2100.0; // price1 do tipo double é inicializado
        double price2 = 650.50; // price2 do tipo double é inicializado
        double measure = 53.234567; // measure ´do tipo double é inicializado


        // exibe variáveis declaradas anteriormente, formatadas
        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f\n", product1, price1);
        System.out.printf("%s, which price is $ %.2f\n\n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %c\n\n", age, code, gender);
        System.out.printf("Measue with eight decimal places: %.8f\n", measure);
        System.out.printf("Rouded (three decimal places): %.3f\n", measure);
        Locale.setDefault(Locale.US);  // mudar sistema decimal regional para o padrão americano
        System.out.printf("US decimal point: %.3f\n", measure);


    } // fim da main

} // fim da classe FormacaoDeTexto.java
