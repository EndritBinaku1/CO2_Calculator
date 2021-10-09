public class ArrayDemo1 {

    public static void main(String[] args) {

        double[] Array1 ={7, 3, 1};
        double[] Array2 ={1, 2, 3};

        System.out.println("+ ");
        for (int i = 0 ; i < Array1.length; i++){
            double summe = Array1[i] + Array2[i];
            System.out.println(", " + summe);

        }
        System.out.println("* ");
        for (int i = 0 ; i < Array1.length; i++){
            double produkt = Array1[i] * Array2[i];
            System.out.println(", " + produkt);
        }

    }
}
