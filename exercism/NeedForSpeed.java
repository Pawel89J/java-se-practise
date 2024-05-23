package pl.globallogic.exercism;

public class NeedForSpeed {

    private int batteryDrain = 0;
    private int speed = 5;
    private int distanceDriven = 0;
    private int remainingBattery = 100;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }
    public boolean batteryDrained() {
        return this.remainingBattery < this.batteryDrain;
    }
    public int distanceDriven() {
        return this.distanceDriven;
    }
    public void drive() {
        if (!batteryDrained()) {
            this.distanceDriven = this.distanceDriven + this.speed;
            this.remainingBattery = this.remainingBattery - this.batteryDrain;
        }
    }
    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}
class RaceTrack {

    private int distance = 800;

    RaceTrack(int distance) {
        this.distance = distance;
    }
    public boolean tryFinishTrack(NeedForSpeed car) {
        while (!car.batteryDrained()) {
            car.drive();
        }
        return car.distanceDriven() >= this.distance;
    }
}
