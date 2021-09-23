package org.launchcode.studio7;

public abstract class Disc {
    private String name;
    private String discType;
    private int runTime;
    private String contents;

    public Disc(String name, String discType, int runTime, String contents) {
        this.name = name;
        this.discType = discType;
        this.runTime = runTime;
        this.contents = contents;
    }

    public String getName() {
        return name;
    }

    public String getDiscType() {
        return discType;
    }

    public int getRunTime() {
        return runTime;
    }


}
