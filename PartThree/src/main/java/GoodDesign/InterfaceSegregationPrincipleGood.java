package GoodDesign;

public class InterfaceSegregationPrincipleGood {

    interface LandAnimal{

        public void move();

    }

    interface SeaAnimal{
        public void swim();
    }

    public class Dog implements LandAnimal{

        public void move() {
            System.out.println("Run");
        }

    }

    public class Fish implements SeaAnimal{

        public void swim() {

            System.out.println("Swim");
        }
    }
}
