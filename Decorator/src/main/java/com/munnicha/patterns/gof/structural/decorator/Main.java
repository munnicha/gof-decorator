package com.munnicha.patterns.gof.structural.decorator;

import com.munnicha.patterns.gof.structural.decorator.model.FlowerBouquet;
import com.munnicha.patterns.gof.structural.decorator.model.Glitter;
import com.munnicha.patterns.gof.structural.decorator.model.OrchidBouquet;
import com.munnicha.patterns.gof.structural.decorator.model.PaperWrapper;
import com.munnicha.patterns.gof.structural.decorator.model.RibbonBow;
import com.munnicha.patterns.gof.structural.decorator.model.RoseBouquet;

/**
 *
 * @author munnicha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Rose bouquet without extras");
        FlowerBouquet roseBouquet=new RoseBouquet(500.0);
        System.out.println("Description: "+roseBouquet.getDescription());
        System.out.println("Cost: "+roseBouquet.cost());
        
        System.out.println("\r\nRose bouquet with some single extras");
        FlowerBouquet roseBouquetExtras=new Glitter(new PaperWrapper(new RoseBouquet(500.0)));
        System.out.println("Description: "+roseBouquetExtras.getDescription());
        System.out.println("Cost: "+roseBouquetExtras.cost());
        
        System.out.println("\r\nOrchid bouquet with multiple extras");
        FlowerBouquet orchidBouqet=new Glitter(new RibbonBow(new RibbonBow(new PaperWrapper(new OrchidBouquet(1200.0)))));
        System.out.println("Description: "+orchidBouqet.getDescription());
        System.out.println("Cost: "+orchidBouqet.cost());
    }
}
