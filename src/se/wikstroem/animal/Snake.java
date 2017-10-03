package se.wikstroem.animal;


//Alla djursorterna ärver från superklassen Animal
public class Snake extends Animal {


    //supercall/superanrop, anropar konstruktorn i superklassen
    public Snake(String name, double weightInKg) {
        super(name, weightInKg);
    }

    @Override
    public String getFoodType() {
        return "Ormpellets";
    }


    // Då ormen ska ha em standardportion oavsett vikt returneras ett bestämt värde
    @Override
    public double getFoodPortionInGrams() {
        return 20.00;
    }
}
