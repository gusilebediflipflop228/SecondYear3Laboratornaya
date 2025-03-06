package org.example.First_pageTest;

import org.example.First_page.WeightProduct;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeightProductTest {
    WeightProduct weightGoods = new WeightProduct("Name", "Description");
    @Test
    public void getNameTest(){
        Assertions.assertEquals("Name", weightGoods.getName());
    }
    @Test
    public void getDescriptionTest(){
        Assertions.assertEquals("Description", weightGoods.getDescription());
    }
}
