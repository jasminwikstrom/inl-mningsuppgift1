package se.wikstroem.animal;

public abstract class Animal implements Feedable {

    //Instansvariabler som alla djuren har gemensamt när de checkar in på hotellet.
    //packageprotected-Endast klasser som ärver och är i samma package har åtkomst till dessa
    //Genom att göra publika metoder av dessa (nedan) så blir den nåbar från main
    String name;
    double weightInKg;

    public Animal (String name, double weightInKg){

        this.name = name;
        this.weightInKg = weightInKg;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public double getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(double weightInKg) {
        this.weightInKg = weightInKg;
    }
}
