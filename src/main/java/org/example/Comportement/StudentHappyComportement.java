package org.example.Comportement;

public class StudentHappyComportement extends Strategie{

    @Override
    public String text() {
        return "Like this ever gonna happen" ;
    }
    private StudentHappyComportement(){};

    public static Strategie get() {
        if (alone == null)
            alone = new StudentHappyComportement();
        return alone;
    }

    private static Strategie alone;
}

