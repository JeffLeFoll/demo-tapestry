package jefflefoll.github.io.pages;

import jefflefoll.github.io.données.annotations.AccèsPublic;
import jefflefoll.github.io.données.tuiles.ConfTuile;
import jefflefoll.github.io.services.tableaudebord.FabriqueDeTableauDeBord;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SetupRender;
import org.apache.tapestry5.ioc.annotations.Inject;

import java.util.List;

@AccèsPublic
public class Index {

    @Inject
    private FabriqueDeTableauDeBord usineDeTuiles;

    @Property
    private List<List<ConfTuile>> ensembleDeLignes;

    @SetupRender
    public void setupRender() {
        ensembleDeLignes = usineDeTuiles.fabriquerTabelauDeBord();
    }
}
