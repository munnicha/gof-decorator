package com.munnicha.patterns.gof.structural.decorator.model;

/**
 *
 * @author munnicha
 */
public abstract class FlowerBouquet {
    
    String description;
    double cost;
    
    public abstract double cost();
    public abstract String getDescription();
}
