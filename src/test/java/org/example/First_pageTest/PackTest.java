package org.example.First_pageTest;

import org.example.First_page.Pack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PackTest {
    Pack pack = new Pack("TestPackage", 1);
    @Test
    public void getNameTest(){
        Assertions.assertEquals("TestPackage", pack.getName());
    }
    @Test
    public void getWeightTest(){
        Assertions.assertEquals(1, pack.getWeight());
    }
}
