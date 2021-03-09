package com.munnicha.patterns.gof.structural.decorator.model;

/**
 *
 * @author munnicha
 */
public class Glitter extends FlowerBouquetDecorator{

    public Glitter(FlowerBouquet fb) {
        super(fb);
    }

    @Override
    public double cost() {
        double finalCost=flowerBouquet.cost();
        finalCost+=addCost();
        return finalCost;
    }
    
    private double addCost(){
        return 100.0;
    }

    @Override
    public String getDescription() {
        String finalDescription=flowerBouquet.getDescription();
        finalDescription+=extendDescription();
        return finalDescription;
    }
    
    private String extendDescription(){
        return " with glitter";
    }
    
}
