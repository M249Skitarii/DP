package org.example.Fabriques;
import org.example.Model.Etudiant;
import org.example.Model.Node;

import java.util.ArrayList;

public class FabriqueClasseNormal extends FabriqueAbstraite{

    public ArrayList<Node> create(){
        ArrayList<Node> classe = new ArrayList<Node>();
        for (int i = 0; i<=5; i++){
            classe.add(new Etudiant(choisirNomAleatoire()));
        }
        return classe;
    }
}
