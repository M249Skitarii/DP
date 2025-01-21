package org.example.Observateur;

public class LeVideur implements Observateur{
// il fait des petits espaces... C'est plus... plus lisible :)
    @Override
    public void notifier(String t) {
        System.out.println("\n");
    }
}
