package Encapulation;

public class BuilderClass {

    private String carName;
    private String carColour;
    private int wheelSize;

    public String getCarName() {
        return carName;
    }

    public String getCarColour() {
        return carColour;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public BuilderClass(CarBuilder carBuilder){
       this.carName = carBuilder.carName;
       this.carColour = carBuilder.carColour;
       this.wheelSize = carBuilder.wheelSize;
   }

   public static class CarBuilder{

       private String carName;
       private String carColour;
       private int wheelSize;

       public static CarBuilder newInstance(){
           return new CarBuilder();
       }

       public CarBuilder setCarName(String carName) {
           this.carName = carName;
           return this;
       }

       public CarBuilder setCarColour(String carColour) {
           this.carColour = carColour;
           return this;
       }

       public CarBuilder setWheelSize(int wheelSize) {
           this.wheelSize = wheelSize;
           return this;
       }

       public BuilderClass build(){
           return new BuilderClass(this);
       }
   }
}
