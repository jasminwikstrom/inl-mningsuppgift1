package se.wikstroem.animal;


//Alla djursorterna ärver från superklassen Animal
public class Dog extends Animal {

    //supercall/superanrop, anropar konstruktorn i superklassen animal då hund i detta fall ej har ett "unikt" beteende
    public Dog(String name, double weightInKg) {
        super(name, weightInKg);
    }

    @Override
    public String getFoodType() {
        return "hundfoder";
    }


    //Inkapsling:weightinKG är packageprotected. För att kunna använda variabeln i en uträkning i main skapar jag en publikmetod getFoodPort...
    @Override
    public double getFoodPortionInGrams() {
        return (this.weightInKg * 1000) / 100;
    }

}
