import com.asilvadesa.config.Configuration;
import com.asilvadesa.config.ConfigurationManager;
import org.aeonbits.owner.Config;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.*;

public abstract class BaseAPI {

    protected static Configuration configuration;

    @BeforeAll
    public static void beforeAllTest(){
        configuration = ConfigurationManager.getConfiguration();

        baseURI = configuration.baseURI();
        basePath = configuration.basePath();
        port = configuration.port();
    }
}
