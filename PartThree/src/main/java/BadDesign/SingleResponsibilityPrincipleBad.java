package BadDesign;

import java.util.ArrayList;

public class SingleResponsibilityPrincipleBad {


    public void carService(String carName, int carModel){

        carServiceCheck car = new carServiceCheck();
        if(car.carSer(carModel)){
            System.out.println("Car is Still new");

        }else {System.out.println("Car can be serviced");}
    }


    class carServiceCheck{

        public boolean carSer(int carModel){
            if(carModel > 2018){
                return true;
            }
            return false;
        }
    }

}
