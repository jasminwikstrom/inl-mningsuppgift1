package se.wikstroem.animal;

public class Cat extends Animal {

    public Cat(String name, double weightInKg) {
        super(name, weightInKg);
    }

    @Override
    public String getFoodType() {
        return "kattfoder";
    }

    @Override
    public double getFoodPortionInGrams() {
        return (this.weightInKg * 1000) / 150;
    }
}
