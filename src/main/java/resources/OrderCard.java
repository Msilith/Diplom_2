package resources;

import lombok.Data;

import java.util.List;

@Data
public class OrderCard {

    private List<String> ingredients;

    public OrderCard(List<String> ingredients) {
        this.ingredients = ingredients;
    }

}