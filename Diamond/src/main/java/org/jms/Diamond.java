package org.jms;

public class Diamond {

    private String Text;
    private void setText(String value) { Text = value; }
    public String getText() { return Text; }

    public static Diamond Create(char letter)
    {
        var result = new Diamond();

        result.setText("A");

        return result;
    }

}
