package be.pxl.ja.knapsack;

public class Product implements Item, Comparable<Product>{

     double weight;
     double price;
     String name;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Product p){
        double myprice = this.getPrice();
        if (this.price>p.price){
            return -1;
        } else if(this.price<p.price){
            return 1;
        } else{
            return 0;
        }
    }



    @Override
    public String toString() {
        return "Product{" +
                "weight=" + weight +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    public Product(){}
    public Product(String name, double price, double weight){
        this.name=name;
        this.price=price;
        this.weight=weight;
    }

}
