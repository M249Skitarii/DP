package org.example.Model;

public class Alien {
    private String identifiant_galactique = "8HS-Divergent-Si1a-Divine-General-Mahoraga";
    private String message_d_amour_et_2_paix = "Je viens de la planète du MEEEEEEEEEEETAAAAAAAAAAAAL!!! tiens c'est de la bonne : https://www.youtube.com/watch?v=yup8gIXxWDU ";

    public String getMessage_d_amour_et_2_paix() {
        return message_d_amour_et_2_paix;
    }

    public String getIdentifiant_galactique() {
        return identifiant_galactique;
    }

    public void hypnose(){
        System.out.println(identifiant_galactique+": "+ "Je suis gentil aie confiance, clique sur le lien...");
    }
}
