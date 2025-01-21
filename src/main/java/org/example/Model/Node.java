package org.example.Model;

import org.example.Fabriques.FabriqueAbstraite;
import org.example.Fabriques.FabriqueClasseHeureuse;
import org.example.Fabriques.FabriqueClasseNormal;
import org.example.Fabriques.FabriqueSalleDesProfs;

public interface Node{
    public void get();
    //Méthode de Fabrique avec des fabriques abstraites dedans parce que pourquoi pas!
    public static Node createSchool(){
        Groupe school = new Groupe();
        FabriqueAbstraite fList[] = {new FabriqueClasseNormal(), new FabriqueClasseHeureuse(), new FabriqueSalleDesProfs()};
        for (FabriqueAbstraite f: fList
             ) {
            Groupe i = new Groupe();
            i.set(f.create());
            school.getGroupe().add(i);
        }
        return school;
    }
}
