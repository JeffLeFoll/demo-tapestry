package jefflefoll.github.io.services.authentification;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;


public class ServiceAuthentificationEnDureTest {


    private ServiceAuthentificationEnDure service;

    @Before
    public void setUp() throws Exception {
        service = new ServiceAuthentificationEnDure();
    }

    @Test
    public void neDoitPasAuthentifierBob(){

        boolean estAuthentifié = service.authentifierUtilisateur("bob@crypto.ex", "la moustache");

        assertThat(estAuthentifié).isFalse();
    }

    @Test
    public void doitAuthentifierAlice(){
        boolean estAuthentifié = service.authentifierUtilisateur("alice@crypto.ex", "ça glisse");

        assertThat(estAuthentifié).isTrue();
    }


    @Test
    public void doitAuthentifierLEmpereur(){
        boolean estAuthentifié = service.authentifierUtilisateur("Palpatine@deathstar.emp", "naboo");

        assertThat(estAuthentifié).isTrue();
    }



}