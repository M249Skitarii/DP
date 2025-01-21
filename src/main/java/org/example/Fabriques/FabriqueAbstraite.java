package org.example.Fabriques;
import org.example.Model.Node;

import java.util.ArrayList;
import java.util.Random;
//Mais non! Une fabrique Abstraite!! \o/
public abstract class FabriqueAbstraite {
    public static String[] noms = {"Alice", "Bob", "Charlie", "Diane", "Eve", "Aurelien",
            "Frank", "Grace", "Hank", "Ivy", "Jack",
            "Karen", "Leo", "Mona", "Nathan", "Olivia",
            "Paul", "Quinn", "Rachel", "Steve", "Tina",
            "Uma", "Victor", "Wendy", "Xavier", "Yasmine",
            "Zach", "Aiden", "Bella", "Caleb", "Daisy",
            "Elliot", "Fiona", "Gavin", "Holly", "Isaac",
            "Julia", "Kevin", "Lila", "Marcus", "Nina",
            "Oscar", "Penny", "Quentin", "Ruby", "Samuel",
            "Tara", "Ursula", "Vince", "Willow", "Zoe"
    };
    public static String choisirNomAleatoire() {
        Random random = new Random();
        int index = random.nextInt(noms.length); // Génère un index aléatoire
        return noms[index];
    }
    public abstract ArrayList<Node> create();
}
