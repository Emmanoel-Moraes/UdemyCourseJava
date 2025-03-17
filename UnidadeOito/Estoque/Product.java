package org.udemy.UnidadeOito.Estoque;

public class Product {

    public String name;
    public double price;
    public int quantity;



    public double TotalValueInStock(){

        return quantity * price;
    }



    public void  AddProducts( int quantity){
        this.quantity += quantity;
    }


    public void RemoveProcucts (int quantity){
        this.quantity -= quantity;
    }


    public String toString(){
        return String.format(
                "%s, $ %.2f, %d units, Total: %.2f",
                name, price, quantity, TotalValueInStock());
    }

}
