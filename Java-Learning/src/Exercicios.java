package entities;

public class Product {
    //Atributos devem ser privados e devem ser acessados por meio de metodos get e set
    private String name;
    private double price;
    private int quantity;


    //THIS - referencia para o propio objeto(diferencia  atributos de variaveis locais)
    public  Product(String name, double price, int quantity){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public  Product(String name, double price){
        this.name = name;
        this.price = price;

    }
    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString() {
        return name
                +", $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total : $ "
                + totalValueInStock();
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQuantity(){
        return quantity;
    }
}
//teste