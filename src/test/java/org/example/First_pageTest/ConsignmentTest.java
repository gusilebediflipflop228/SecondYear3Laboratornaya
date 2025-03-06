package org.example.First_pageTest;


import org.example.First_page.*;
import org.example.First_page.Iface.Weightable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConsignmentTest {
    Pack pack = new Pack("name", 1);
    WeightProduct weightGoods = new WeightProduct("name", "description");
    PieceProduct pieceProduct = new PieceProduct("PieceProduct", "Description", 23);

    PackedWeightProduct packedWeightProduct1 = new PackedWeightProduct(weightGoods, 30, pack);
    PackedWeightProduct packedWeightProduct2 = new PackedWeightProduct(weightGoods, 20, pack);
    PackedPieceProduct packedPieceProduct1 = new PackedPieceProduct(pieceProduct, 2, pack);
    PackedPieceProduct packedPieceProduct2 = new PackedPieceProduct(pieceProduct, 5, pack);

    PackedSet packedSet = new PackedSet(new Weightable[]
            {
                    packedWeightProduct1, packedWeightProduct2,
                    packedPieceProduct1, packedPieceProduct2
            },
            pack);
    Consignment consignment = new Consignment("1 весовой, 1 штучный, 1 набор", new Weightable[]
            {
                    packedWeightProduct1, //31
                    packedPieceProduct2, //116
                    packedSet //216
            });
    @Test
    public void getWeightTest(){
        Assertions.assertEquals(363, consignment.getWeight());
    }
}
