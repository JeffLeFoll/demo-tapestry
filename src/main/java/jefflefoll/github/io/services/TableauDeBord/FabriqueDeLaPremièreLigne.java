package jefflefoll.github.io.services.tableaudebord;

import com.google.common.collect.Lists;
import jefflefoll.github.io.données.tuiles.ConfTuile;
import jefflefoll.github.io.données.tuiles.ConfTuileCatalogue;
import jefflefoll.github.io.données.tuiles.ConfTuileMonCompte;
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
