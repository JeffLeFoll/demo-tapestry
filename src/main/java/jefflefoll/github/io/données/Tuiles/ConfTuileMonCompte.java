package jefflefoll.github.io.données.tuiles;

import jefflefoll.github.io.pages.MonCompte;


public class ConfTuileMonCompte extends ConfTuile {

    private final String CLE_STYLE_ET_TITRE = "moncompte";
    private final Integer TAILLE_DE_LA_TUILE = 2;

    public String getStyle(){
        return CLE_STYLE_ET_TITRE;
    }

    public String getDébranchement(){
        return MonCompte.class.getSimpleName();
    }

    public String getIcone(){
        return "fa fa-user fa-3x";
    }

    public Integer getTaille() {
        return TAILLE_DE_LA_TUILE * BASE_UNITE_TUILE;
    }

    public boolean isAffichée() { return true; }

    public String getTitre(){
        return messages.get(CLE_STYLE_ET_TITRE);
    }
}
