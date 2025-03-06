package org.example.Second_page;

import org.example.Second_page.Filter.Filter;

public class OnlyOneLetterFilter implements Filter {
    private final Character pattern; // символ

    public OnlyOneLetterFilter(Character pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean apply(String string) {
        return (string.indexOf(pattern) == string.lastIndexOf(pattern)) && (string.indexOf(pattern) != -1);
    }
}
