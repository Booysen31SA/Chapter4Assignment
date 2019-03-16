package GoodDesign;

public class OpenClosedPrincipleGood {

    interface calc{
        int multi(int a, int b);
    }

    class calcE implements calc{


        public int multi(int a, int b) {
            return a*b;
        }
    }
}
