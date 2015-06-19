package jefflefoll.github.io.components;

import jefflefoll.github.io.données.tuiles.ConfTuile;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;

public class Tuile {

    @Parameter(required = true)
    @Property
    private ConfTuile conf;

}
