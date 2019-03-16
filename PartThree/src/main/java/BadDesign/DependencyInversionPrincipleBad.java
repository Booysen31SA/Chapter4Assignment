package BadDesign;

public class DependencyInversionPrincipleBad {

    public abstract class Do{
        abstract void run();
    }

    //extends is bad
    public class Dog extends Do{


        void run() {
            System.out.println("Walk");
        }
    }
    public class Cat extends Do{


        void run() {
            System.out.println("Run fast");
        }
    }

}
