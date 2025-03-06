package org.example.First_pageTest;

import org.example.First_page.Pack;
import org.example.First_page.PackedPieceProduct;
import org.example.First_page.PieceProduct;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PackedPieceProductTest {
    PieceProduct pieceProduct = new PieceProduct("PieceProduct", "Description", 23);
    Pack pack = new Pack("pack", 1);
    PackedPieceProduct packedPieceProduct = new PackedPieceProduct(pieceProduct, 2, pack);

    @Test
    public void getQuantityTest(){
        Assertions.assertEquals(2,packedPieceProduct.getQuantity());
    }
    @Test
    public void getNetWeightTest(){
        Assertions.assertEquals(46,packedPieceProduct.getNetWeight());
    }
    @Test
    public void getGrossWeightTest(){
        Assertions.assertEquals(47,packedPieceProduct.getGrossWeight());
    }

}
