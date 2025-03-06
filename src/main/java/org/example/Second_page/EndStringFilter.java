package org.example.Second_page;

import org.example.Second_page.Filter.Filter;

public class EndStringFilter implements Filter {
    private final String pattern;

    public EndStringFilter(String string) {
        pattern = string;
    }

    @Override
    public boolean apply(String str){
        return str.endsWith(pattern);
    }
}
