package com.kodilla.stream.beautifier;

public class PoemBeutifier {
    public static void beautify(String string, PoemDecorator poemDecorator) {
        System.out.println("Decorated text: " + poemDecorator.decorate(string));
    }
}
