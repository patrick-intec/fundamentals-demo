package Entities.plant_entities;

public class Flower extends  Plant {
    private Scent smell;
    public String flower;

    public Flower(String name, double height) {
        super(name, height);
    }

    public Scent getSmell() {
        return smell;
    }

    public void setSmell(Scent smell) {
        this.smell = smell;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "smell=" + smell +
                ", flower='" + flower + '\'' +
                '}';
    }
}




