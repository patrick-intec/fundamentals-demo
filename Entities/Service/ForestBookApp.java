package Entities.Service;

import Entities.animal_entities.Animal;
import Entities.animal_entities.Carnivore;
import Entities.animal_entities.Herbivore;
import Entities.animal_entities.Omnivore;
import Entities.plant_entities.Plant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForestBookApp {
    public static void main(String[] args) {
        Plant grass = new Plant("grass");

        Carnivore dog = new Carnivore("Dog", 35, 1.25,1.5 );
        Carnivore wolf = new Carnivore("wolf", 46, 1.55,1.9 );
        Carnivore tiger = new Carnivore("tiger", 98, 1.63,2.5 );
        Carnivore lion = new Carnivore("lion", 96, 1.60,2.6 );
        Herbivore elephant = new Herbivore("elephant", 359, 2.22,2.9);
        elephant.addPlantToDiet(grass);
        Herbivore cow = new Herbivore("Cow", 150, 1.65,2.3 );
        cow.addPlantToDiet(grass);
        Animal human = new Omnivore("Human", 85, 1.77, 1.77);

        ForestNoteBook forestNoteBook = new ForestNoteBook();
        forestNoteBook.addAnimal(dog);
        forestNoteBook.addAnimal(wolf);
        forestNoteBook.addAnimal(tiger);
        forestNoteBook.addAnimal(lion);
        forestNoteBook.addAnimal(elephant);
        forestNoteBook.addAnimal(cow);
        forestNoteBook.addAnimal(human);

        forestNoteBook.printNoteBook();





    }
}



