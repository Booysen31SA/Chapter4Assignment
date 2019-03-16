import Encapulation.Encapulation;
import Inheritance.Student;
import Polymorphism.Bike;
import Polymorphism.Splendor;

public class RunModules {

    public static void main(String[] args) {
        Encapulation cap = new Encapulation();
        cap.run();

        Student stud = new Student();
        stud.welcome();
        System.out.println(stud);

        Bike isA = new Splendor();
        isA.run();

    }
}
