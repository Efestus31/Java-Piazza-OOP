public class Ingredient {

    private String name;
    private double quantity;
    private boolean addedAfterCook;
    private boolean isAvailable;




    public Ingredient(String name, double quantity, boolean addedAfterCook, boolean isAvailable) {
        this.name = name;
        this.quantity = quantity;
        this.addedAfterCook = addedAfterCook;
        this.isAvailable = isAvailable;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }
    public boolean isAddedAfterCook() {
        return addedAfterCook;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
}
