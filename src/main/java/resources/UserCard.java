package resources;
import lombok.Data;

@Data

public class UserCard {
    private String email;
    private String password;
    private String name;

    public UserCard(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public UserCard(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public UserCard() {
    }
}