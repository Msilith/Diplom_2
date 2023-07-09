package actions;

import lombok.Data;

import java.util.List;

@Data

public class GenerateOrderData {
    OrderAction orderAction = new OrderAction();
    private List<String> ingredients;

    public void IdIngredients() {
        ingredients = orderAction.getAllIngredients();
    }
}
