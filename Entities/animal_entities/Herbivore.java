package Entities.animal_entities;

import Entities.plant_entities.Plant;

import java.util.HashSet;
import java.util.Set;

public class Herbivore extends Animal {
    private Set<Plant> plantDiet;

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        return this.plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {plantDiet = new HashSet<>();
        this.plantDiet = plantDiet;
    }

    public void addPlantToDiet(Plant plant) {
        if (plantDiet == null) plantDiet = new HashSet<>();
        this.plantDiet.add(plant);
    }

    public void printDiet() {
        System.out.println(this.plantDiet);
    }


    @Override
    public String toString() {
        return "Herbivore{" +
                "plantDiet=" + plantDiet + ", " + getName() + ", " + getWeight() + ", " + getHeight() + ", " + getLength() +
                '}';
    }
}