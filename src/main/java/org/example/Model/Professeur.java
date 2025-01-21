package org.example.Model;

import org.example.Comportement.AverageCYtechTeacherFun;
import org.example.Comportement.AverageCYtechTeacherText;
import org.example.Comportement.Strategie;

public class Professeur extends Human {

    private String name = "le professeur";
    private Strategie replique = AverageCYtechTeacherText.get();
    private Strategie comportement = AverageCYtechTeacherFun.get();
    public Professeur(){};
    public Professeur(String name){
        this.name = name;
    };
    public Professeur(String name, Strategie replique, Strategie con){
        this.name = name;
        this.replique = replique;
        this.comportement = con;
    };
    @Override
    void parole(){
        System.out.println(name+ ": "+ replique.text());
    }

    @Override
    void consequences() {
        System.out.println(name+": "+comportement.text());
    }
    public void setReplique(Strategie s){
        replique = s;
    }

    public void setComportement(Strategie comportement) {
        this.comportement = comportement;
    }
}

