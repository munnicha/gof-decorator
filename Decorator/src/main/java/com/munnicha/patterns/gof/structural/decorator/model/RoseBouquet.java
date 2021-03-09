package com.munnicha.patterns.gof.structural.decorator.model;

/**
 *
 * @author munnicha
 */
public class RoseBouquet extends FlowerBouquet{
    
    public RoseBouquet(double cost){
        this.description="Rose Bouquet";
        this.cost=cost;
    }

    @Override
    public double cost() {
        return this.cost;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
    
}
