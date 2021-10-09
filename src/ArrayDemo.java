public class ArrayDemo {

    public static void main(String[] args) {

        double[] article = new double[5];
        article[0] = 2.4;
        article[1] = 2.0;
        article[2] = 2.9;

       // double summe = article[0] +article[1] +article[2] + article[3] + article[4];
        double summe = 0;
        for (int i = 0; i < article.length; i++) {

            summe = summe + article[i];
        }

        System.out.println("Summe: " + summe);

    }
}
