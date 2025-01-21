package org.example.Model;
import org.example.Observateur.LeVideur;
import org.example.Observateur.Observateur;
import org.example.Observateur.Stalker;

//PATRON DE METHODE !!!!
public abstract class Human implements Node{
    private Observateur[] obs = {new LeVideur(), new Stalker()};
    void notifierTous(String t){
        for (Observateur o: obs
             ) {
                o.notifier(t);
        }
    }
    String name;
    abstract void parole();
    abstract void consequences();

    public void action(){
        notifierTous("#[PATRON DE METHODE] le personnage Agis!");
        this.parole();
        this.consequences();
    }

    public void get(){
        this.action();
    }

}
