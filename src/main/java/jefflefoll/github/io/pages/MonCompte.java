package jefflefoll.github.io.pages;

import jefflefoll.github.io.données.annotations.AccèsRestreintParAuthentification;
import org.apache.tapestry5.annotations.Import;

@Import(stylesheet = {"context:layout/css/c3.min.css"}, library = {"context:layout/js/d3.min.js","context:layout/js/c3.min.js"})
@AccèsRestreintParAuthentification
public class MonCompte {
}
