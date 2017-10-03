package se.wikstroem;

import se.wikstroem.animal.Animal;
import se.wikstroem.animal.Cat;
import se.wikstroem.animal.Dog;
import se.wikstroem.animal.Snake;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Skapa ett antal djur som bor på hotellet

        Dog sixten = new Dog("Sixten", 5);
        Dog dogge = new Dog("Dogge", 10);

        Cat venus = new Cat("Venus", 5);
        Cat ove = new Cat("Ove", 3);

        Snake hypno = new Snake("Hypno", 1);

        //Lägger till djuren i en lista, här används polymorfism. Då jag skapar en lista med flera subkalsser.
        List<Animal> animals = new ArrayList<>();
        animals.add(sixten);
        animals.add(dogge);
        animals.add(venus);
        animals.add(ove);
        animals.add(hypno);


        //Fråga personalen om vilket djur som ska få mat

        String name = JOptionPane.showInputDialog("Vad heter djuret som ska matas?");

        // Hitta rätt djur
        Animal animaltofeed = null;
        for (Animal animal : animals){

            if (animal.getName().equalsIgnoreCase(name)){
                animaltofeed = animal;
            }
        }


        if (animaltofeed == null) {
            JOptionPane.showMessageDialog(null, "Inget djur heter så");

        } else {
            StringBuilder text = new StringBuilder();

            // Dynamiskbindning: getFoodPortioninGrams finns i interface Feedable. Alla klasser har den metoden.
            // Men det är inte förens programmet körs som exempelvis hund/katt -versionen av metoden som anropas

            text.append(animaltofeed.getName())
                    .append(" ska ha ")
                    .append(String.format("%.2f", animaltofeed.getFoodPortionInGrams()))
                    .append(" gram av ")
                    .append(animaltofeed.getFoodType());

            JOptionPane.showMessageDialog(null, text);


        }



    }
}
