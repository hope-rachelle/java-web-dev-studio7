package org.launchcode.studio7;

public class DVD extends Disc implements SpinningDisc {

    public DVD(String name, String discType, int runTime, String contents) {
        super(name, discType, runTime, contents);

    }

    @Override
    public void startSpin() {
        System.out.println("Now playing your " + getDiscType() + " " + getName() + ". Run time is " + getRunTime() + " minutes.");
    }

    @Override
    public void stopSpin() {
        System.out.println(getName() + " has been stopped");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
