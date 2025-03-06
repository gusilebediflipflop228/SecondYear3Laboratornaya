package org.example.third_pageTest;

import org.example.First_page.*;
import org.example.First_page.Iface.Weightable;
import org.example.Second_page.BeginStringFilter;
import org.example.Second_page.EndStringFilter;
import org.example.Second_page.OnlyOneLetterFilter;
import org.example.third_page.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductServiceTest {
    Pack pack = new Pack("1121", 1);
    WeightProduct weightGoods = new WeightProduct("1121", "description");
    PieceProduct pieceProduct = new PieceProduct("abc1", "Description", 23);

    PackedWeightProduct packedWeightProduct1 = new PackedWeightProduct(weightGoods, 30, pack);
    PackedWeightProduct packedWeightProduct2 = new PackedWeightProduct(weightGoods, 20, pack);
    PackedPieceProduct packedPieceProduct1 = new PackedPieceProduct(pieceProduct, 2, pack);
    PackedPieceProduct packedPieceProduct2 = new PackedPieceProduct(pieceProduct, 5, pack);

    PackedSet packedSet = new PackedSet(new Weightable[]
            {
                    packedWeightProduct1, packedWeightProduct2,
                    packedPieceProduct1, packedPieceProduct2
            },
            pack, "packedSet");

    PackedSet packedSet1 = new PackedSet(new Weightable[]
            {
                    packedWeightProduct1, packedWeightProduct2
            },
            pack, "packedSet");

    Consignment consignment = new Consignment("1 весовой, 1 штучный, 1 набор", new Weightable[]
            {
                    packedWeightProduct1,
                    packedPieceProduct2, //116
                    packedSet //216
            }, "sac");

    Consignment consignment2 = new Consignment("1 весовой, 1 штучный, 1 набор", new Weightable[]
            {
                    packedWeightProduct1,
                    packedPieceProduct2, //116
                    packedSet //216
            }, "sac");

    Consignment consignment3 = new Consignment("1 весовой, 1 штучный, 1 набор", new Weightable[]
            {
                    packedWeightProduct1,
                    packedSet1 //216
            }, "sac");

    BeginStringFilter filter1 = new BeginStringFilter("ab");
    EndStringFilter filter2 = new EndStringFilter("1");
    OnlyOneLetterFilter filter3 = new OnlyOneLetterFilter('a');
    BeginStringFilter filterFor2 = new BeginStringFilter("11");

    @Test
    public void filters(){
        Assertions.assertEquals(1, ProductService.countByFilter(consignment, filter1));
        Assertions.assertEquals(2, ProductService.countByFilter(consignment2, filter2));
        Assertions.assertEquals(1 , ProductService.countByFilter(consignment3, filter3));
    }

}