package utils.resources;
import static utils.constants.Endpoints.BANCOLOMBIA;
import lombok.Getter;
@Getter
public enum GetEndpoint {

    URL_BANCOLOMBIA(BANCOLOMBIA);

    private final String endpoint;

    GetEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
}
