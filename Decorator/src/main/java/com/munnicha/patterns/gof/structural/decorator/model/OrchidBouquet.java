package com.munnicha.patterns.gof.structural.decorator.model;

/**
 *
 * @author munnicha
 */
public class OrchidBouquet extends FlowerBouquet{

    public OrchidBouquet(double cost){
        this.description="Orchid Bouquet";
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
