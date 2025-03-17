package org.udemy.UnidadeOito.Exercicios; // Pertence ao package

// EmployeeMain.java



import java.util.Scanner; // Utiliza Scanner

public class EmployeeMain {


    // Inicia execução do programa
    public static void  main  (String[] args){

        // Instanciação dos objetos das classes Scanner e Employee
        Scanner sc = new Scanner (System.in);
        Employee employee = new Employee();



        System.out.print("Name: ");
        employee.name = sc.nextLine(); // lê nome atribui ao objeto employee
        //System.out.println();


        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble(); // lê salário bruto atribui ao objeto employee
       // System.out.println();


        System.out.print("Tax: ");
        employee.tax = sc.nextDouble(); // lê taxa e atribui ao objeto employee
        System.out.println();


        System.out.print(employee); // exibe dados de employee com salário com descontos
        System.out.println();

        System.out.print("Which percentage to increase salary? ");
        employee.IncreaseSalary(sc.nextDouble()); // Lê a porcentagem e altera o salário internamente
        System.out.println();

        System.out.print("Updated data: " + employee);






    } // fim da  execução da main

} // fim da classe EmployeeMain
