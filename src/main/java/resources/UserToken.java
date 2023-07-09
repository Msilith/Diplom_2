package resources;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@JsonIncludeProperties({"accessToken"})
@Accessors(chain = true)
public class UserToken {
    private String accessToken;

    public UserToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public UserToken() {
    }

}
