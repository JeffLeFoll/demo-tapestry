package jefflefoll.github.io.services;

import jefflefoll.github.io.données.Tuiles.*;
import jefflefoll.github.io.services.TableauDeBord.FabriqueDeLaPremièreLigne;
import jefflefoll.github.io.services.TableauDeBord.FabriqueDeLaSecondeLigne;
import jefflefoll.github.io.services.TableauDeBord.FabriqueDeTableauDeBord;
import org.apache.tapestry5.ioc.OrderedConfiguration;
import org.apache.tapestry5.ioc.ServiceBinder;
import org.apache.tapestry5.ioc.annotations.Contribute;
import org.apache.tapestry5.services.MarkupRenderer;
import org.apache.tapestry5.services.MarkupRendererFilter;

public class AppModule {

    @Contribute(MarkupRenderer.class)
    public static void deactiveDefaultCSS(OrderedConfiguration<MarkupRendererFilter> configuration)
    {
        configuration.override("InjectDefaultStylesheet", null);
    }

    public static void bind(ServiceBinder binder) {
        binder.bind(FabriqueDeLaPremièreLigne.class);
        binder.bind(FabriqueDeLaSecondeLigne.class);
        binder.bind(FabriqueDeTableauDeBord.class);

        binderTuiles(binder);
    }

    private static void binderTuiles(ServiceBinder binder) {
        binder.bind(ConfTuileMonCompte.class);
        binder.bind(ConfTuileAPropos.class);
        binder.bind(ConfTuileCatalogue.class);
        binder.bind(ConfTuileConnexion.class);
        binder.bind(ConfTuileDéconnexion.class);
        binder.bind(ConfTuileContact.class);
    }
}
