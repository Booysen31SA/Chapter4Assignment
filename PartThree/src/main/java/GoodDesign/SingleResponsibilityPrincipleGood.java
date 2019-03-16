package GoodDesign;



public class SingleResponsibilityPrincipleGood {

    public void carService(String carName, int carModel){


        if(carSer(carModel)){
            System.out.println("Car is Still new");

        }else {System.out.println("Car can be serviced");}
    }


    public boolean carSer(int carModel){
        if(carModel > 2018){
            return true;
        }
        return false;
    }
}
