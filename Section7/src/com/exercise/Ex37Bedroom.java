package com.exercise;

public class Ex37Bedroom {
    private String name;
    private Ex37Wall wall1;
    private Ex37Wall wall2;
    private Ex37Wall wall3;
    private Ex37Wall wall4;
    private Ex37Ceiling ceiling;
    private Ex37Bed bed;
    private Ex37Lamp lamp;

    public Ex37Bedroom(String name, Ex37Wall wall1, Ex37Wall wall2, Ex37Wall wall3, Ex37Wall wall4, Ex37Ceiling ceiling, Ex37Bed bed, Ex37Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Ex37Lamp getLamp() {
        return this.lamp;
    }

    public void makeBed() {
        System.out.println("Bedroom -> Making bed");
        bed.make();
    }
}
