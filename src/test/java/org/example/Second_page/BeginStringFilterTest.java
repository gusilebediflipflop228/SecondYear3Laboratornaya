package org.example.Second_page;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BeginStringFilterTest {
    String str = "Мама мыла раму";
    BeginStringFilter filter1 = new BeginStringFilter("Мама");
    BeginStringFilter filter2 = new BeginStringFilter("мыла");
    @Test
    public void applyTest(){
        boolean res1 = filter1.apply(str); // результат — true
        boolean res2 = filter2.apply(str); // результат — false
        Assertions.assertTrue(res1);
        Assertions.assertFalse(res2);
    }
}
