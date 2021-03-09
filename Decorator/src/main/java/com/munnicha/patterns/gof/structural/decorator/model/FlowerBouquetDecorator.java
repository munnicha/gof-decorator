package com.munnicha.patterns.gof.structural.decorator.model;

/**
 *
 * @author munnicha
 */
public abstract class FlowerBouquetDecorator extends FlowerBouquet{
    
    protected FlowerBouquet flowerBouquet;
    
    public FlowerBouquetDecorator(FlowerBouquet fb){
        this.flowerBouquet=fb;
    }
}
