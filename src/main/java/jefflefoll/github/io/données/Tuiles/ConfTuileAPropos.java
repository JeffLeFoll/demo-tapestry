package jefflefoll.github.io.données.Tuiles;

import jefflefoll.github.io.pages.APropos;


public class ConfTuileAPropos extends ConfTuile {

    private final String CLE_STYLE_ET_TITRE = "apropos";
    private final Integer TAILLE_DE_LA_TUILE = 1;

    public String getStyle(){
        return CLE_STYLE_ET_TITRE;
    }

    public String getDébranchement(){
        return APropos.class.getSimpleName();
    }

    public String getIcone(){
        return "fa fa-question-circle fa-3x";
    }

    public Integer getTaille() {
        return TAILLE_DE_LA_TUILE * BASE_UNITE_TUILE;
    }

    public boolean isAffichée() { return true; }

    public String getTitre(){
        return messages.get(CLE_STYLE_ET_TITRE);
    }
}
