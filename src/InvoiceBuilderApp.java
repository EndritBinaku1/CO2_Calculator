public class InvoiceBuilderApp {
    public static void main(String[] args) {

        double article1 = 0;
        double article2 = 0;
        double article3 = 0;
        double article4 = 0;
        double article5 = 0;

        article1 = 2.4;
        article2 = 2.0;
        article3 = 2.9;

        //double summe = article1 + article2 + article3 + article4 + article5;
        double summe = summeCalculate(article1, article2, article3, article4, article4);

        System.out.println("Gesamtkosten: " + summe);
    }

    public static double summeCalculate(double a, double b, double c, double d, double e){

        double summeDerArtikel = a + b + c + d + e;
        return summeDerArtikel;

    }
}
