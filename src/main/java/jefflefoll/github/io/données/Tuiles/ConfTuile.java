package jefflefoll.github.io.données.Tuiles;

import org.apache.tapestry5.ioc.Messages;
import org.apache.tapestry5.ioc.annotations.Inject;

/**
 * Created by petitjean on 17/06/2015.
 */
public abstract class ConfTuile {

    @Inject
    protected Messages messages;

    Integer BASE_UNITE_TUILE = 3;

    public abstract String getStyle();
    public abstract Object getDébranchement();
    public abstract String getIcone();
    public abstract String getTitre();
    public abstract Integer getTaille();
    public abstract boolean isAffichée();
}
