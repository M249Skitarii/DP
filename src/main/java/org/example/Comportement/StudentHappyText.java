package org.example.Comportement;

public class StudentHappyText extends Strategie{
    @Override
    public String text() {
        return "Je suis content :)";
    }
    private StudentHappyText(){};

    public static Strategie get() {
        if (alone == null)
            alone = new StudentHappyText();
        return alone;
    }

    private static Strategie alone;
}
