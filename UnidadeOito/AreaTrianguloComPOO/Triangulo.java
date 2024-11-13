// Triangulo.java

// Classe Triangulo com atributos lados, construtor, métodos set e get

package entities;

public class Triangulo {

    private double a;
    private double b;
    private double c;

    // Construtor vazio
    public Triangulo (){}


    // Construtor com parâmetros
    public Triangulo (double a, double b, double c){

        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Metodo set para a
    public void setA (double a){

        this.a = a;
    }


    // Metodo set para b
    public void setB (double b){

        this.b = b;
    }


    // Metodo set para c
    public void setC (double c){
        this.c = c;
    }


    // Metodo get para a
    public double getA (){
        return a;
    }

    // Metodo get para b
    public double getB (){
        return b;
    }

    // Metodo get para c
    public double getC (){
        return c;
    }

    // Calcula área e retorna
    public double areaTriangulo (){
        double p =  (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public void maior (double areaX, double areaY){

        // Exibindo o triângulo que possui maior área
        if (areaX > areaY)
            System.out.println("Larger area: X");
        else if (areaX < areaY)
            System.out.println("Larger area: Y");
        else
            System.out.println("Both triangles are equals");

    }



} // fim da classe Triangulo
