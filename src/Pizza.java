import java.util.List;

public class Pizza {
    private Dough dough;
    private List<Ingredient> ingredients;
    private boolean cooked;
    private boolean eaten;


    public Pizza(Dough dough, List<Ingredient> ingredients){
        this.dough = dough;
        this.ingredients = ingredients;
        this.cooked = false;
        this.eaten = false;
    }

    public void cook(){
        cooked = true;
    }

    public void eat(){
        if (cooked){
            eaten = true;
            System.out.println("You ate the pizza! GNAM😋");
        } else {
            System.out.println("You can't eat the pizza, it isn't cooked! ❌");
        }
    }

    public void describe(){
        System.out.println("This pizza looks amazing!");
        System.out.printf("Dough: type=%s, weight=%.1f, proofed=%dhrs\n",
                dough.getFlourType(), dough.getWeight(), dough.getProofHours() );
        for (Ingredient i : ingredients){
            System.out.println("- " + i.getName() + " (" + i.getQuantity() + "g)");
        }
        System.out.println("Cooked: " + cooked + ", Eaten: " + eaten);
    }
}
