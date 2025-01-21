package org.example.Fabriques;

import org.example.Model.EtudiantAlien;
import org.example.Model.Node;
import org.example.Model.Professeur;

import java.util.ArrayList;
import java.util.Random;

public class FabriqueSalleDesProfs extends FabriqueAbstraite{
    String[] nomsVieux = {
            "Gertrude", "Eugène", "Marguerite", "Alphonse",
            "Simone", "Marcel", "Fernande", "Gustave",
            "Henriette", "Maurice"
    };
    public String choisirNomVieux() {
        Random random = new Random();
        int index = random.nextInt(nomsVieux.length); // Génère un index aléatoire
        return nomsVieux[index];
    }
    public ArrayList<Node> create(){
        ArrayList<Node> classe = new ArrayList<Node>();
        for (int i = 0; i<=5; i++){
            classe.add(new Professeur(choisirNomVieux()));
        }
        classe.add(new EtudiantAlien());
        return classe;
    }
}
