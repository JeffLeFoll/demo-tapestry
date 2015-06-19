package jefflefoll.github.io.components;

import jefflefoll.github.io.données.tuiles.ConfTuile;
import jefflefoll.github.io.services.tableauDeBord.FabriqueDeTableauDeBord;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SetupRender;
import org.apache.tapestry5.ioc.annotations.Inject;

import java.util.List;


public class TableauDeBord {

    @Parameter(required = true)
    @Property
    private List<List<ConfTuile>> ensembleDeLignes;

    @Property
    private List<ConfTuile> ligne;

    @Property
    private ConfTuile confTuile;
}
