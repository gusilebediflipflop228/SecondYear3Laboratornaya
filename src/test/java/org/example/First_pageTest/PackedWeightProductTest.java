package org.example.First_pageTest;


import org.example.First_page.Pack;
import org.example.First_page.PackedWeightProduct;
import org.example.First_page.WeightProduct;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PackedWeightProductTest {
    Pack pack = new Pack("name", 1);
    WeightProduct weightGoods = new WeightProduct("name", "description");
    PackedWeightProduct packedWeightGoods = new PackedWeightProduct(weightGoods, 30, pack);

    @Test
    public void getNetWeight(){
        Assertions.assertEquals(30, packedWeightGoods.getNetWeight());
    }
    @Test
    public void getGrossWeight(){
        Assertions.assertEquals(31, packedWeightGoods.getGrossWeight());
    }
}
