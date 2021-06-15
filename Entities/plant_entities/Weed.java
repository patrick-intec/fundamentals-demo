package Entities.plant_entities;

public class Weed {
    private double area;
    public String weed;

    public String weed(String weed, double area) {
        return weed + area;
    }

    public double getArea(){
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Weed{" +
                "area=" + area +
                ", weed='" + weed + '\'' +
                '}';
    }
}
