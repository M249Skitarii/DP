package org.example.Iterator;

import org.example.Model.Human;

//mmmmmh... je me demande quel pattern c'est?
public interface Iterator {
    public Human next();
    public boolean hasNext();
}
