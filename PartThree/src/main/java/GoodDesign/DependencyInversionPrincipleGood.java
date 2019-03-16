package GoodDesign;

public class DependencyInversionPrincipleGood {

    interface Do{
        public void move();
    }

    //implement a interface for metods
    public class Dog implements Do{


        public void move() {
            System.out.println("Move");
        }
    }
    public class Cat implements Do{
        public void move() {
            System.out.println("Move Fast");
        }
    }

}
