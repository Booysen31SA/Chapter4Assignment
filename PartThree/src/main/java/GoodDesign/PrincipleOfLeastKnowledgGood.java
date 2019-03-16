package GoodDesign;

public class PrincipleOfLeastKnowledgGood {

    static class Calc{
        public double multi(double a, double b){return a*b;}
        public double sub(double a, double b){return a-b;}
    }

    public static void main(String[] args) {
        Calc c = new Calc();

        //using one dot like below
        double answer = c.sub(2,6);
        double answer2 = c.multi(answer,2);
        System.out.println(answer2);
    }
}
