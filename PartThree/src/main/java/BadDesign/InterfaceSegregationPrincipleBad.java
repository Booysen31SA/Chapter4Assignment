package BadDesign;

public class InterfaceSegregationPrincipleBad {

    interface Animal{

        public void move();
        public void swim();
    }

    //have interface with one purpose, a some classes wont use all the methods
    public class Dog implements Animal{

        public void move() {
            System.out.println("Run");
        }

        public void swim() {

        }
    }

    public class Fish implements Animal{

        public void move() {

        }

        public void swim() {

            System.out.println("Swim");
        }
    }
}
