package jefflefoll.github.io.components;

import jefflefoll.github.io.données.Tuiles.ConfTuile;
import jefflefoll.github.io.services.TableauDeBord.FabriqueDeTableauDeBord;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SetupRender;
import org.apache.tapestry5.ioc.annotations.Inject;

import java.util.List;


public class TableauDeBord {

    @Inject
    FabriqueDeTableauDeBord usineDeTuiles;

    @Property
    private List<List<ConfTuile>> ensembleDeLignes;

    @Property
    private List<ConfTuile> ligne;

    @Property
    private ConfTuile confTuile;

    @SetupRender
    public void setupRender() {
        ensembleDeLignes = usineDeTuiles.fabriquerTabelauDeBord();
    }
}
