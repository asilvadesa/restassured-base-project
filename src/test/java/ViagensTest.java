import org.junit.jupiter.api.Test;

import static com.asilvadesa.spec.TokenSpec.adminTokenAccess;
import static io.restassured.RestAssured.given;

public class ViagensTest extends BaseAPI{

    @Test
    public void testCadastroDeViagemValidaRetornoSucesso(){

        String token = given().spec(adminTokenAccess()).when().post(configuration.auth()).then()
                .extract().path(configuration.dataToken());
        System.out.println("token ====> " + token);
    }

}
