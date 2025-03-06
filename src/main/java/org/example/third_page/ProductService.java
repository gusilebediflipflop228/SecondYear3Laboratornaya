package org.example.third_page;

import org.example.First_page.Consignment;
import org.example.First_page.Iface.Weightable;
import org.example.Second_page.Filter.Filter;

public class ProductService {

    public static int countByFilter(Consignment consignment, Filter filter){
        int count = 0;
        for (Weightable product : consignment.getWeightables()) {
            if (filter.apply(product.getName())) {
                count++;
            }
        }
        return count;
    }

}
