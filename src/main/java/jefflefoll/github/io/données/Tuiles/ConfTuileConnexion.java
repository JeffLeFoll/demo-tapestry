package jefflefoll.github.io.données.tuiles;

import jefflefoll.github.io.pages.Connexion;


public class ConfTuileConnexion extends ConfTuile {

    private final Integer TAILLE_DE_LA_TUILE = 1;

    public String getStyle(){
        return "authentification";
    }

    public String getDébranchement(){
        return Connexion.class.getSimpleName();
    }

    public String getIcone(){
        return "fa fa-sign-in fa-3x";
    }

    public Integer getTaille() {
        return TAILLE_DE_LA_TUILE * BASE_UNITE_TUILE;
    }

    public boolean isAffichée() { return true; }

    public String getTitre(){
        return messages.get("connexion");
    }
}
