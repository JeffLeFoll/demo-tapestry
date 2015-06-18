package jefflefoll.github.io.services.TableauDeBord;

import com.google.common.collect.Lists;
import jefflefoll.github.io.données.Tuiles.ConfTuile;
import org.apache.tapestry5.ioc.annotations.Inject;

import java.util.List;

public class FabriqueDeTableauDeBord {

private List<List<ConfTuile>> tableauDeBord;

    public FabriqueDeTableauDeBord(@Inject FabriqueDeLaPremièreLigne premièreLigne, @Inject FabriqueDeLaSecondeLigne secondeLigne){
        tableauDeBord = Lists.newArrayList();

        tableauDeBord.add(premièreLigne.fabriquerUneLigneDeTablerDeBord());
        tableauDeBord.add(secondeLigne.fabriquerUneLigneDeTablerDeBord());
    }

    public List<List<ConfTuile>> fabriquerTabelauDeBord(){
        return tableauDeBord;
    }

}
