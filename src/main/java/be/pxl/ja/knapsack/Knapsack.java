package be.pxl.ja.knapsack;

import java.util.ArrayList;
import java.util.List;

public class Knapsack<I extends Item> {
    double maximumCapacity;
    List<I> items;

    public Knapsack(double max){
        this.maximumCapacity=max;
        this.items=new ArrayList<>();
    }


    public double getCurrentWeight(){
        double weight=0;
        for (I item: items) {
            weight+=item.getWeight();
        }
        return weight;
    }

    public void add(I item) throws KnapsackFullException {
        if (getCurrentWeight()+item.getWeight()>maximumCapacity){
            throw new KnapsackFullException(String.format("cannot add item [%s]. Maximum capacity reached", item));
        }
    }

    public List<I> getItems(){
        return items;
    }


}
