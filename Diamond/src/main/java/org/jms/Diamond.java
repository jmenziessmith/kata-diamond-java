package org.jms;

public class Diamond {
    static String ws = " "; // whitespace char

    private String Text = "";
    public String getText() { return Text; }

    public static Diamond Create(char letter)
    {
        letter = Character.toUpperCase(letter);

        var result = new Diamond();

        var numberOfLetters = letter - 'A' + 1; // char can be treated as an int for maths
        var sb = new StringBuilder();

        var padding = numberOfLetters;
        if(numberOfLetters == 1){ padding = 0;}
        if(numberOfLetters == 2){ padding = 1;}

        // build each line out
        for(int i = 0; i < numberOfLetters; i++){
            BuildLine(numberOfLetters, i, padding, sb);
        }
        // build lines back in
        for (int i = numberOfLetters -2; i >= 0; i--) {
            BuildLine(numberOfLetters, i, padding, sb);
        }

        result.Text = sb.toString();

        return result;
    }

    private static void BuildLine(int numberOfLetters, int i, int padding, StringBuilder sb) {
        var paddingSide = numberOfLetters - i -1;
        var paddingMiddle = padding - (paddingSide * 2);
        var currentLetter = 'A' + i; // calculate current letter

        sb.append(ws.repeat(paddingSide)); // left padding

        sb.append(Character.toString(currentLetter)); // letter

        if(paddingMiddle > 0){
            sb.append(ws.repeat(paddingMiddle)); // middle padding
            sb.append(Character.toString(currentLetter)); // right letter
        }

        sb.append(ws.repeat(paddingSide)); // right padding

        if(numberOfLetters > 1){ sb.append("\n"); }
    }

}
