package jefflefoll.github.io.services.filtres;

import jefflefoll.github.io.données.annotations.AccèsRestreintParAuthentification;
import jefflefoll.github.io.données.constantes.ConstantesSessionAttribute;
import jefflefoll.github.io.services.authentification.ServiceAuthentification;
import org.apache.tapestry5.Link;
import org.apache.tapestry5.annotations.SessionAttribute;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.runtime.Component;
import org.apache.tapestry5.services.*;

import java.io.IOException;

public class FiltreAuthentification implements ComponentRequestFilter {

    private final PageRenderLinkSource renderLinkSource;
    private final ComponentSource componentSource;
    private final Response réponse;

    @SessionAttribute(ConstantesSessionAttribute.UTILISATEUR_AUTENTIFIE)
    private boolean estIdentifié;

    public FiltreAuthentification(PageRenderLinkSource renderLinkSource,
                                  ComponentSource componentSource, Response réponse) {
        this.renderLinkSource = renderLinkSource;
        this.componentSource = componentSource;
        this.réponse = réponse;
    }

    @Override
    public void handleComponentEvent(ComponentEventRequestParameters parameters, ComponentRequestHandler handler) throws IOException {
        if (redirigeVersLaPageDAuthentification(parameters.getActivePageName())) {
            return;
        }

        handler.handleComponentEvent(parameters);
    }

    @Override
    public void handlePageRender(PageRenderRequestParameters parameters, ComponentRequestHandler handler) throws IOException {
        if (redirigeVersLaPageDAuthentification(parameters.getLogicalPageName())) {
            return;
        }

        handler.handlePageRender(parameters);
    }

    private boolean redirigeVersLaPageDAuthentification(String nomDeLaPage) throws IOException {
        if (estIdentifié) {
            return false;
        }

        Component page = componentSource.getPage(nomDeLaPage);

        if (! page.getClass().isAnnotationPresent(AccèsRestreintParAuthentification.class)) {
            return false;
        }

        Link link = renderLinkSource.createPageRenderLink("Connexion");

        réponse.sendRedirect(link);

        return true;
    }
}
