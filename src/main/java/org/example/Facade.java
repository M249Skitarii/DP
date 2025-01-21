package org.example;
import org.example.Iterator.Iterator;
import org.example.Model.Groupe;
import org.example.Model.Node;

//Petite façade en mode on raconte une histoire aller! Il était une fois...
public class Facade {
    Node school;
    public void chapitre1(){
        System.out.printf("...une école sortit de terre...");
        school = Node.createSchool();
        school.get();
    }
    public void chapitre2(){
        System.out.println("un jour, une classe à eu professeure zoubeida et il sont devenu des élève heureux! (METTEZ MOI UN BONUS POUR LE PARTIEL SVP MADAME!)");
        Groupe g = (Groupe) school;
        Groupe it = (Groupe) g.getGroupe().get(0);
        Iterator i = it.createIterator();
        while (i.hasNext()){
            i.next();
        }
    }

    public void chapitre3(){
        school.get();
    }
}
