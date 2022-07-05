package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    String damianWąsik = "Damian Wąsik";
    public String beautify(String string, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(string);

        System.out.println(result);
        return result;
    }

}
