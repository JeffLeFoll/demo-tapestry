package jefflefoll.github.io.services.authentification;


import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;
import jefflefoll.github.io.données.constantes.ConstantesSessionAttribute;
import org.apache.tapestry5.annotations.SessionAttribute;

import java.util.HashMap;
import java.util.Map;

public class ServiceAuthentificationEnDure implements ServiceAuthentification{

    @SessionAttribute(ConstantesSessionAttribute.UTILISATEUR_AUTENTIFIE)
    private boolean estIdentifié;

    private static final Map<String, String> baseDAuthentification;
    static {
        baseDAuthentification = new HashMap<>();
        baseDAuthentification.put("5f837cee23df08f8038bcc2dc57981d0", "PALPATINE@deathstar.emp");
        baseDAuthentification.put("feb25603fd533363071556f4e457dd71", "ALICE@crypto.ex");
    }

    public boolean authentifierUtilisateur(String email, String motDePasse) {

        String motDePasseSalé = Hashing.murmur3_128(23).hashString(motDePasse, Charsets.UTF_8).toString();

        String emailEnBase = baseDAuthentification.get(motDePasseSalé);

        if(emailEnBase == null){
            estIdentifié = false;
        } else {
            estIdentifié = emailEnBase.equalsIgnoreCase(email);
        }

        return estIdentifié;
    }
}
