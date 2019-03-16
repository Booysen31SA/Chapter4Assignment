package BadDesign;

public class LiskovSubstitutionPrincipleBad {

    static class Animal{
        public void move(){

        }
    }

    static class Fish extends Animal{

    }
    //dog move different from a fish
    static class Dog extends Animal{

    }
}
