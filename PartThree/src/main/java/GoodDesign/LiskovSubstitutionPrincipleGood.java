package GoodDesign;


public class LiskovSubstitutionPrincipleGood {

    static class Animal{
        public void move(){

        }
    }

    static class Fish extends Animal implements FishMove {

        public void swim() {

        }
    }
    //dog move different from a fish
    static class Dog extends Animal {

    }

    interface FishMove{
        public void swim();
    }
}
