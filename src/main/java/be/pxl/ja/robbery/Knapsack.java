package be.pxl.ja.robbery;

import java.util.List;

public class Knapsack {
    double maximumCapacity;
    List<Product> items;

    public double getCurrentWeight(){
        double weight=0;
        for (Product p: items) {
            weight+=p.getWeight();
        }
        return weight;
    }

    public void add(Product product) throws KnapsackFullException {
        if (getCurrentWeight()+product.weight>maximumCapacity){
            throw new KnapsackFullException("Knapsack is full");
        }
    }

    public List<Product> getItems(){
        return items;
    }

    public Knapsack(double max){
        this.maximumCapacity=max;
    }

}
