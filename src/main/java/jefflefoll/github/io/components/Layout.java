package jefflefoll.github.io.components;

import org.apache.tapestry5.annotations.Import;

@Import(stylesheet = {"context:layout/css/bootstrap.css",
        "context:layout/css/template.css",
        "context:layout/css/c3.min.css",
        "context:layout/css/font-awesome.min.css"
}, library = {"context:layout/js/d3.min.js","context:layout/js/c3.min.js"})
public class Layout {
}
