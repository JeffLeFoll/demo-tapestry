package jefflefoll.github.io.services;

import jefflefoll.github.io.données.tuiles.*;
import jefflefoll.github.io.services.authentification.ServiceAuthentification;
import jefflefoll.github.io.services.authentification.ServiceAuthentificationEnDure;
import jefflefoll.github.io.services.filtres.FiltreAuthentification;
import jefflefoll.github.io.services.tableauDeBord.FabriqueDeLaPremièreLigne;
import jefflefoll.github.io.services.tableauDeBord.FabriqueDeLaSecondeLigne;
import jefflefoll.github.io.services.tableauDeBord.FabriqueDeTableauDeBord;
import org.apache.tapestry5.ioc.OrderedConfiguration;
import org.apache.tapestry5.ioc.ServiceBinder;
import org.apache.tapestry5.ioc.annotations.Contribute;
import org.apache.tapestry5.services.MarkupRenderer;
import org.apache.tapestry5.services.MarkupRendererFilter;

public class AppModule {

    @Contribute(MarkupRenderer.class)
    public static void deactiveDefaultCSS(OrderedConfiguration<MarkupRendererFilter> configuration) {
        configuration.override("InjectDefaultStylesheet", null);
    }

    public static void bind(ServiceBinder binder) {
        binder.bind(FabriqueDeLaPremièreLigne.class);
        binder.bind(FabriqueDeLaSecondeLigne.class);
        binder.bind(FabriqueDeTableauDeBord.class);

        binderTuiles(binder);

        binder.bind(ServiceAuthentification.class, ServiceAuthentificationEnDure.class);
    }

    private static void binderTuiles(ServiceBinder binder) {
        binder.bind(ConfTuileMonCompte.class);
        binder.bind(ConfTuileAPropos.class);
        binder.bind(ConfTuileCatalogue.class);
        binder.bind(ConfTuileConnexion.class);
        binder.bind(ConfTuileDéconnexion.class);
        binder.bind(ConfTuileContact.class);
    }

    public static void contributeComponentRequestHandler(
            OrderedConfiguration configuration) {
        configuration.addInstance("AccèsRestreintParAuthentification", FiltreAuthentification.class);
    }
}
