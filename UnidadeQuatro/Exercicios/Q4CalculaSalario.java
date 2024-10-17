// Q4CalculaSalario.java

// Exercício 4
// Proposta:
// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.



import java.util.Scanner; // utiliza Scanner
import java.util.Locale; // utiliza Locale

public class Q4CalculaSalario {

    // inicia execução do programa
    public static void main (String [] args) {

        // Habilita padrão US de texto e formatação
        Locale.setDefault(Locale.US);

        // Habilita leitura de dados via janela de comando
        Scanner sc = new Scanner(System.in);

        int number; // variável para número do funciónario
        int workedHours; // variável para horas trabalhadas
        double hourlyRate; // variável para valor-hora

        double salary; // variável para salário

        // recebe valores de número, salário e hora do funcionário
        number = sc.nextInt();
        workedHours = sc.nextInt();
        hourlyRate = sc.nextDouble();

        // calculando salário com base nas horas trabalhadas e no valor por hora devido
        salary = workedHours * hourlyRate;

        // Exibe número e salário do funcionário
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f", number, salary);


    } // fim da main

} // fim da classe Q4CalculaSalario
