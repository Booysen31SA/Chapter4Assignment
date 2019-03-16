package Inheritance;

public class UnderGraduate {

    private String id = "123456";
    private String name = "Matthew";
    private int studyYears = 3;

    public void welcome(){
        System.out.println("\nInheritance");
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStudyYears() {
        return studyYears;
    }

    @Override
    public String toString() {
        return   "ID          : " + getId()
                +"\nName        : " + getName()
                + "\nStudy Years : "+ getStudyYears();
    }


}
