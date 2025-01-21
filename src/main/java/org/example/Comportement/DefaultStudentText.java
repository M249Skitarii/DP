package org.example.Comportement;

public class DefaultStudentText extends Strategie{
    @Override
    public String text() {
        return "J'aime CyTech";
    }
    private DefaultStudentText(){};

    public static Strategie get() {
        if (alone == null)
            alone = new DefaultStudentText();
        return alone;
    }

    private static Strategie alone;
}
