package org.example.Comportement;

public class DefaultStudentComportement extends Strategie {
    @Override
    public String text() {
        return "aidez-moi! on me menace T-T" ;
    }
    private DefaultStudentComportement(){};

    public static Strategie get() {
        if (alone == null)
            alone = new DefaultStudentComportement();
        return alone;
    }

    private static Strategie alone;
}
