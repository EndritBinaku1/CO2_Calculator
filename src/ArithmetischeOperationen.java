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

        printResult(2 + 3);
        int result = add(5 , 6);
        printResult(result);
    }

    public static void printResult(int result){
        System.out.println(result);
    }

    public static int add(int a, int b){

        return a + b;
    }
}
