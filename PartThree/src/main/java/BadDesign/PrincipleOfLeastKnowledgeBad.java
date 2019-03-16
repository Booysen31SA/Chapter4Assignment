package BadDesign;

public class PrincipleOfLeastKnowledgeBad {

    //inner class for easy to read
    static class Calc{
        public double multi(double a, double b){return a*b;}
        public double sub(double a, double b){return a-b;}
    }

    //using 1 dot is violating the principle
    public static void main(String[] args) {
        Calc c = new Calc();

        //using 1 dot is violating the principle like below
        double Answer = c.multi(c.sub(2,6), 2);
        System.out.println(Answer);
    }
}
