package jefflefoll.github.io.services.TableauDeBord;

import com.google.common.collect.Lists;
import jefflefoll.github.io.données.Tuiles.ConfTuile;
import jefflefoll.github.io.données.Tuiles.ConfTuileCatalogue;
import jefflefoll.github.io.données.Tuiles.ConfTuileMonCompte;
import org.apache.tapestry5.ioc.annotations.Inject;

import java.util.List;

public class FabriqueDeLaPremièreLigne implements FabriqueDeLigneDeTableauDeBord {

    private final List<ConfTuile> configuration;

    public FabriqueDeLaPremièreLigne(@Inject ConfTuileMonCompte monCompte, @Inject ConfTuileCatalogue catalogue){
        this.configuration = Lists.newArrayList(monCompte, catalogue);
    }

    @Override
    public List<ConfTuile> fabriquerUneLigneDeTablerDeBord() {
        return configuration;
    }
}
