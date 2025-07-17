package org.jms;

public class Diamond {
    static final String ws = " "; // whitespace char

    private String Text = "";
    public String getText() { return Text; }

    public static Diamond Create(char letter)
    {
        letter = Character.toUpperCase(letter);

        var result = new Diamond();

        var numberOfLetters = letter - 'A' + 1; // char can be treated as an int for maths

        var padding = numberOfLetters == 1 ? 0 // A
                : numberOfLetters == 2 ? 1 // B
                : numberOfLetters + numberOfLetters - 3 ;

        var sb = new StringBuilder();

        // build lines expanding
        for(int i = 0; i < numberOfLetters; i++){
            BuildLine(numberOfLetters, i, padding, sb);
        }
        // build lines contracting
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
