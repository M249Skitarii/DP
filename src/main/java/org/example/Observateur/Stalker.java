package org.example.Observateur;

public class Stalker implements Observateur{
    @Override
    public void notifier(String t) {
        System.out.println(t);
    }
}
