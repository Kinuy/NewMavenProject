package org.example;
import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String asciiArt = FigletFont.convertOneLine("Hello World");
        System.out.println(asciiArt);

    }

    public static int getNumber(int value){
        return value*3;
    }
}
