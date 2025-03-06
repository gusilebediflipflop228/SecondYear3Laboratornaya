package org.example.Second_page;

import org.example.Second_page.EndStringFilter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EndStringFilterTest {
    String str = "Всё переплетено";
    EndStringFilter filter1 = new EndStringFilter("переплетено");
    EndStringFilter filter2 = new EndStringFilter("абабаааб");
    @Test
    public void applyTest(){
        boolean res1 = filter1.apply(str); // результат — true
        boolean res2 = filter2.apply(str); // результат — false
        Assertions.assertTrue(res1);
        Assertions.assertFalse(res2);
    }
}
