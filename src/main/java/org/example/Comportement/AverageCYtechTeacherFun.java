package org.example.Comportement;

public class AverageCYtechTeacherFun extends Strategie {
    @Override
    public String text() {
        return "bah alors on ne passe pas l'année?";
    }
    private AverageCYtechTeacherFun(){};

    public static Strategie get() {
        if (alone == null)
            alone = new AverageCYtechTeacherFun();
        return alone;
    }
    private static Strategie alone;
}

