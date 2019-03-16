package Encapulation;

public class Encapulation {

    private BuilderClass carBuild;

    public void run(){

        carBuild =  BuilderClass.CarBuilder.newInstance()
                   .setCarName("Toyota")
                   .setCarColour("Blue")
                   .setWheelSize(14)
                   .build();

        System.out.println("Car Name   :"+carBuild.getCarName()
                        + "\nCar Colour :" +carBuild.getCarColour()
                        + "\nWheel Size :" + carBuild.getWheelSize());
    }
}
