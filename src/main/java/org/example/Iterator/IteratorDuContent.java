package org.example.Iterator;

import org.example.Comportement.StudentHappyComportement;
import org.example.Comportement.StudentHappyText;
import org.example.Model.Human;
import org.example.Model.Node;
import org.example.Model.Etudiant;

import java.util.ArrayList;

//gestion catastrophique des types /!\
public class IteratorDuContent implements Iterator{
    public int index = -1;
    private ArrayList<Node> l;
    public IteratorDuContent(ArrayList<Node> l){
        this.l = l;
    }
    @Override
    public Human next() {
        if (!hasNext())
            return null;
        Etudiant e = (Etudiant) l.get(++index);
        e.setComportement(StudentHappyComportement.get());
        e.setReplique(StudentHappyText.get());
        return e;
    }

    @Override
    public boolean hasNext() {
        return index + 1 < l.size();
    }
}
