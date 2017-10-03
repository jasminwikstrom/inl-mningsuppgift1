package se.wikstroem.animal;

public class Snake extends Animal {

    public Snake(String name, double weightInKg) {
        super(name, weightInKg);
    }

    @Override
    public String getFoodType() {
        return "Ormpellets";
    }

    @Override
    public double getFoodPortionInGrams() {
        return 20.00;
    }
}
