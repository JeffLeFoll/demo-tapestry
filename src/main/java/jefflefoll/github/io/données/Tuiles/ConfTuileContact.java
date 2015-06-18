package jefflefoll.github.io.données.Tuiles;

import jefflefoll.github.io.pages.Contact;


public class ConfTuileContact extends ConfTuile {

    private final String CLE_STYLE_ET_TITRE = "contact";
    private final Integer TAILLE_DE_LA_TUILE = 2;

    public String getStyle(){
        return CLE_STYLE_ET_TITRE;
    }

    public String getDébranchement(){
        return Contact.class.getSimpleName();
    }

    public String getIcone(){
        return "fa fa-envelope-o fa-3x";
    }

    public Integer getTaille() {
        return TAILLE_DE_LA_TUILE * BASE_UNITE_TUILE;
    }

    public boolean isAffichée() { return true; }

    public String getTitre(){
        return messages.get(CLE_STYLE_ET_TITRE);
    }
}
