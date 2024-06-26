package pl.globallogic.exercism.remotecontrolcompetition;

public class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    private int distance;
    private int victories;

    public void drive() {
        this.distance += 10;
    }
    public int getDistanceTravelled() {
        return this.distance;
    }
    public int getNumberOfVictories() {
        return this.victories;
    }
    public void setNumberOfVictories(int numberOfVictories) {
        this.victories = numberOfVictories;
    }
    @Override
    public int compareTo(ProductionRemoteControlCar car) {
        return Integer.compare(car.getNumberOfVictories(), getNumberOfVictories());
    }
}
