package City;

public class City {
    int numberOfBuildings;

    public City(int numberOfBuildings) {
        this.numberOfBuildings = numberOfBuildings;
    }

    public int getNumberOfBuildings() {
        return numberOfBuildings;
    }

    public void destroyBuilding() {
        this.numberOfBuildings--;
    }
}
