package org.example.Model;

import org.example.Comportement.DefaultStudentComportement;
import org.example.Comportement.DefaultStudentText;
import org.example.Comportement.Strategie;

public class Etudiant extends Human{
    private String name = "le professeur";
    private Strategie replique = DefaultStudentText.get();
    private Strategie comportement = DefaultStudentComportement.get();
    public Etudiant(){};
    public Etudiant(String name){
        this.name = name;
    };
    public Etudiant(String name, Strategie replique, Strategie con){
        this.name = name;
        this.replique = replique;
        this.comportement = con;
    };
    @Override
    public void parole(){
        System.out.println(name +": "+replique.text());
    }

    @Override
    public void consequences() {
        System.out.println(name + ": "+comportement.text());
    }
    public void setReplique(Strategie s){
        replique =s;
    }

    public void setComportement(Strategie comportement) {
        notifierTous(" #[STRATEGIE] comportement changé? Mais quel est cette magie!?");
        this.comportement = comportement;
    }
}
