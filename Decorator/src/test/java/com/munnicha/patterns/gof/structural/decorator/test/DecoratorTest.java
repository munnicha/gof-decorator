package com.munnicha.patterns.gof.structural.decorator.test;

import com.munnicha.patterns.gof.structural.decorator.model.FlowerBouquet;
import com.munnicha.patterns.gof.structural.decorator.model.Glitter;
import com.munnicha.patterns.gof.structural.decorator.model.OrchidBouquet;
import com.munnicha.patterns.gof.structural.decorator.model.PaperWrapper;
import com.munnicha.patterns.gof.structural.decorator.model.RibbonBow;
import com.munnicha.patterns.gof.structural.decorator.model.RoseBouquet;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author munnicha
 */
public class DecoratorTest {
    
    @Test
    public void testDecorator(){
        FlowerBouquet roseBouquet=new RoseBouquet(500.0);
        FlowerBouquet roseBouquetExtras=new Glitter(new PaperWrapper(new RoseBouquet(500.0)));
        FlowerBouquet orchidBouqet=new Glitter(new RibbonBow(new RibbonBow(new PaperWrapper(new OrchidBouquet(1200.0)))));
        
        assertEquals(500.0,roseBouquet.cost(),0.0001);
        assertEquals(650.0,roseBouquetExtras.cost(),0.0001);
        assertEquals(1410.0,orchidBouqet.cost(),0.0001);
        assertEquals("Orchid Bouquet with paper wrapper with ribbon bow with ribbon bow with glitter",orchidBouqet.getDescription());
    }
}
