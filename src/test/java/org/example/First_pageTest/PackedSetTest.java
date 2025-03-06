package org.example.First_pageTest;


import org.example.First_page.*;
import org.example.First_page.Iface.Weightable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PackedSetTest {
    Pack pack = new Pack("name", 1);
    WeightProduct weightGoods = new WeightProduct("name", "description");
    PieceProduct pieceProduct = new PieceProduct("PieceProduct", "Description", 23);

    PackedWeightProduct packedWeightProduct1 = new PackedWeightProduct(weightGoods, 30, pack);
    PackedWeightProduct packedWeightProduct2 = new PackedWeightProduct(weightGoods, 20, pack);
    PackedPieceProduct packedPieceProduct1 = new PackedPieceProduct(pieceProduct, 2, pack);
    PackedPieceProduct packedPieceProduct2 = new PackedPieceProduct(pieceProduct, 5, pack);

    PackedSet packedSet1 = new PackedSet(new Weightable[]
            {
            packedWeightProduct1, packedWeightProduct2,
            packedPieceProduct1, packedPieceProduct2
            },
            pack);
    PackedSet packedSet2 = new PackedSet(new Weightable[]
            {
                    packedSet1
            },
            pack);
    @Test
    public void getNetWeightTest(){
        Assertions.assertEquals(215, packedSet1.getNetWeight());
        Assertions.assertEquals(216, packedSet2.getNetWeight());
    }
    @Test
    public void getGrossWeightTest(){
        Assertions.assertEquals(216, packedSet1.getGrossWeight());
        Assertions.assertEquals(217, packedSet2.getGrossWeight());
    }
}
