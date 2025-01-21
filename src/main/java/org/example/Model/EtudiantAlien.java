package org.example.Model;
// Ils sont une race intelligente, Ils s'ADAPTENT 000: !
public class EtudiantAlien extends Etudiant{

    private Alien alien = new Alien();

    @Override
    public void parole(){
        System.out.println(alien.getIdentifiant_galactique() +": "+ alien.getMessage_d_amour_et_2_paix());
    }

    @Override
    public void consequences() {
        alien.hypnose();
        notifierTous(" #[Adaptateur] comportement adapté wouhou!");
    }

}