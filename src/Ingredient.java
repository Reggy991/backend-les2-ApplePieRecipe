public class Ingredient {
    private double amount;
    private String unit;
    private String name;

    // ---------------------------------------------------------------- Constructors
    public Ingredient(double amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }
    public Ingredient() {

    }

    public double getAmount() {
        return amount;
    }

    // ---------------------------------------------------------------- Getters and setters
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
