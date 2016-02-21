package jefflefoll.github.io.pages;

import jefflefoll.github.io.données.annotations.AccèsPublic;
import org.apache.tapestry5.PersistenceConstants;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;

@AccèsPublic
public class Connexion {

    @InjectPage
    private Index index;

    @Property
    @Persist(PersistenceConstants.FLASH)
    private String saisieMail;

    @Property
    @Persist(PersistenceConstants.FLASH)
    private String saisieMdP;
    
    public Object onSuccess() {
        return index;
    }
}
