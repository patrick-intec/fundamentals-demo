package Entities.Service;

import Entities.animal_entities.Animal;
import Entities.animal_entities.Carnivore;
import Entities.animal_entities.Herbivore;
import Entities.animal_entities.Omnivore;
import Entities.plant_entities.Plant;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForestNoteBook {

    private int plantCount;
    private int animalCount;
    private List<Carnivore> carnivores;
    private List<Omnivore> omnivores;
    private List<Herbivore> herbivores;
    private List<Animal> animals;
    private List<Plant> plants;
    private List<Plant> plantsDiet;




    public ForestNoteBook() {
        plantsDiet = new ArrayList<>();
        plants = new ArrayList<>();
        animals = new ArrayList<>();
        omnivores = new ArrayList<>();
        carnivores = new ArrayList<>();
        herbivores = new ArrayList<>();

    }

    public List<Carnivore> getCarnivore() { return carnivores.stream().distinct().collect(Collectors.toList());}
    public List<Omnivore> getOmnivore() { return omnivores.stream().distinct().collect(Collectors.toList());}
    public List<Herbivore> getHerbivore() {return herbivores.stream().distinct().collect(Collectors.toList());}


    public void setCarnivore(List<Carnivore> carnivore) { this.carnivores = carnivore; }
    public void setOmnivore(List<Omnivore> omnivore) { this.omnivores = omnivore; }
    public void setHerbivore(List<Herbivore> herbivore) { this.herbivores = herbivore; }


    public int getPlantCount() {
        return plantCount;
    }
    public int getAnimalCount() {
        return animalCount;
    }



    public void addAnimal(Animal animal) {
// check for duplicates

            this.animals.forEach(a -> {
            if(a.getName().equals(animal.getName())) {
                return;
            }
                });

// if no duplicates, add to main animals list
             this.animals.add(animal);

// determine what kind of animal it is and add to the proper list

            if (animal instanceof Carnivore) {
                 this.carnivores.add(((Carnivore) animal));
        }
            else if (animal instanceof Herbivore) {
                 this.herbivores.add(((Herbivore) animal));
}
            else if (animal instanceof Omnivore) {
                 this.omnivores.add(((Omnivore) animal));
}

    };




    public void sortAnimalsByName() {

    }



    public void sortPlantsByName() {
        this.sortPlantsByName();
    }





    public void printNoteBook() {
                this.animals.forEach(animal -> {
                System.out.println(animal.toString());
                this.plants.forEach(plant -> {
                System.out.println(plant.toString());
            });
        });



    }
}

