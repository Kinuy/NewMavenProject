package org.example;
import com.github.lalyos.jfiglet.FigletFont;

public class Main {
    public static void main(String[] args) {
        String asciiArt = FigletFont.convertOneLine("Hello World");
        System.out.println(asciiArt);

    }

    public static int getNumber(int value){
        return value*3;
    }
}
