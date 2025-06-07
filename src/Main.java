import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //create new ingredients
        Ingredient mozzarella = new Ingredient("mozzarella", 50.0,false,true);
        Ingredient pepperoni = new Ingredient("pepperoni", 30.0, false, true);
        Ingredient fries = new Ingredient("fries", 75.0, true, true);

        // create new doughs
        Dough flour0 = new Dough("Farina 0", true, true, 300.0, 36);
        Dough semola = new Dough("Farina di semola", true, false, 300.0, 48);

        List<Ingredient> ingredientsPizza = new ArrayList<>();
        ingredientsPizza.add(mozzarella);
        ingredientsPizza.add(pepperoni);
        ingredientsPizza.add(fries);

        Pizza diavola = new Pizza(semola, ingredientsPizza);
        diavola.describe();
        diavola.cook();
        diavola.eat();
        diavola.describe();

    }
}
