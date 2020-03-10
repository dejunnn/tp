package seedu.duke;

public class Food {
    String foodName;
    double carbohydrates;
    double fats;
    double fiber;
    double minerals;
    double proteins;
    double vitamins;
    double water;

    public Food(String foodName, double carbohydrates, double fats, double fiber, double minerals,
                double proteins, double vitamins, double water) {
        this.foodName = foodName;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.fiber = fiber;
        this.minerals = minerals;
        this.proteins = proteins;
        this.vitamins = vitamins;
        this.water = water;
    }

    public String getFoodName() {
        return foodName;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getFats() {
        return fats;
    }

    public double getFiber() {
        return fiber;
    }

    public double getMinerals() {
        return minerals;
    }

    public double getProteins() {
        return proteins;
    }

    public double getVitamins() {
        return vitamins;
    }

    public double getWater() {
        return water;
    }
}