package org.example.Model;

import java.util.ArrayList;
import org.example.Iterator.IterableContent;
import org.example.Iterator.Iterator;
import org.example.Iterator.IteratorDuContent;

// Eyoo? un petit début de Composite là ou quoi?
public class Groupe implements Node, IterableContent {
    private ArrayList<Node> groupe = new ArrayList<Node>();


    public ArrayList<Node> getGroupe() {
        return groupe;
    }

    @Override
    public void get() {
        for (Node n: groupe) {
            n.get();
        }
    }
    public void set(ArrayList<Node> node){
        groupe = node;
    }
    @Override
    public Iterator createIterator() {
        return new IteratorDuContent(this.groupe);
    }
}
