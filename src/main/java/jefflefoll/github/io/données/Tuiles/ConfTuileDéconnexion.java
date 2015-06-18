package jefflefoll.github.io.données.Tuiles;

import jefflefoll.github.io.pages.Déconnexion;


public class ConfTuileDéconnexion extends ConfTuile {

    private final Integer TAILLE_DE_LA_TUILE = 1;

    public String getStyle(){
        return "authentification";
    }

    public String getDébranchement(){
        return Déconnexion.class.getSimpleName();
    }

    public String getIcone(){
        return "fa fa-sign-out fa-3x";
    }

    public Integer getTaille() {
        return TAILLE_DE_LA_TUILE * BASE_UNITE_TUILE;
    }

    public boolean isAffichée() { return false; }

    public String getTitre(){
        return messages.get("déconnexion");
    }
}
