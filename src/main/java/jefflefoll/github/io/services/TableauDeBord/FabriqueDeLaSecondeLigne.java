package jefflefoll.github.io.services.TableauDeBord;

import com.google.common.collect.Lists;
import jefflefoll.github.io.données.Tuiles.*;
import org.apache.tapestry5.ioc.annotations.Inject;

import java.util.List;

public class FabriqueDeLaSecondeLigne implements FabriqueDeLigneDeTableauDeBord {

    private final List<ConfTuile> configuration;

    public FabriqueDeLaSecondeLigne(@Inject ConfTuileContact contact, @Inject ConfTuileAPropos aPropos,
                                    @Inject ConfTuileConnexion connexion, @Inject ConfTuileDéconnexion déconnexion){
        this.configuration = Lists.newArrayList(contact, aPropos, connexion, déconnexion);
    }

    @Override
    public List<ConfTuile> fabriquerUneLigneDeTablerDeBord() {
        return configuration;
    }
}
