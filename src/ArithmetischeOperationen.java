public class ArithmetischeOperationen {
    public static void main(String[] args) {

        int c, e, g, h, l;
        int a = 5;
        int b = 10;

        c = a + b;
        e = b - a;
        g = a * b;
        h = b / a;
        l = a % b;

        int o = 3;
        int r = o++;

        System.out.println(c);
        System.out.println(e);
        System.out.println(g);
        System.out.println(h);
        System.out.println(l);

        System.out.println(r);
        System.out.println(o);

        double addRes= addieren(a,b);
        double minRes= substrahieren(a,b);
        double mulRes= multiplizieren(a,b);
        double divRes= dividieren(a,b);

        printResult(addRes);
        printResult(minRes);
        printResult(mulRes);
        printResult(divRes);






    }
    public static int addieren(int a, int b){

        return a + b;
    }

    public static int substrahieren(int a, int b){

        return a - b;

    }

    public static int multiplizieren(int a, int b){

        return a * b;
    }

    public static int dividieren(int a, int b){

        return a / b;
    }

    public static void printResult(double result){
        System.out.println("Result is --- " + result);
    }


}
