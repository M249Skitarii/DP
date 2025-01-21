package org.example.Fabriques;

import org.example.Comportement.StudentHappyComportement;
import org.example.Comportement.StudentHappyText;
import org.example.Model.Etudiant;
import org.example.Model.Node;

import java.util.ArrayList;

public class FabriqueClasseHeureuse extends FabriqueAbstraite {
    public ArrayList<Node> create(){
        ArrayList<Node> classe = new ArrayList<Node>();
        for (int i = 0; i<=4; i++){
            classe.add(new Etudiant(choisirNomAleatoire(), StudentHappyText.get(), StudentHappyComportement.get()));
        }
        return classe;
    }
}
