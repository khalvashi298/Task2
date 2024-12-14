package org.example;

public class Symbol implements Interface1, Interface2 {

    @Override
    public void replaceSymbolA() {
        String str = "bitanica";
        String result = str.replace('a', 'z');
        System.out.println("replaceSymbolA: " + result);
    }
    @Override
    public void replaceSymbolB() {
        String str = "bitanica";
        String result = str.replace('b', 'w');
        System.out.println("replaceSymbolB: " + result);
    }
}

