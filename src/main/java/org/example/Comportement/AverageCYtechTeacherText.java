package org.example.Comportement;

public class AverageCYtechTeacherText extends Strategie{
    @Override
    public String text() {
        return "bah alors on ne passe pas l'année?" ;
    }
    private AverageCYtechTeacherText(){};
    public static Strategie get() {
        if (alone == null)
            alone = new AverageCYtechTeacherText();
        return alone;
    }
    private static Strategie alone;
}
