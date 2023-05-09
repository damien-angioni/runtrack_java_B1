import java.text.DecimalFormat;                                         //Import library to format decimal variable

public class Facture {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");           //Set the format pattern

        double prix=49.99;
        int quantité=3;
        double tarifHT=prix*quantité;
        double tva=(double) (20*tarifHT)/100;
        double tarifTTC=tarifHT+tva;
        System.out.printf("Le prix: "+ prix + "\n");
        System.out.printf("La quantité: "+ quantité + "\n");
        System.out.printf("Total HT: "+ df.format(tarifHT) + "\n");     //Format decimal displayed
        System.out.printf("TVA: "+ df.format(tva) + "\n");              //Format decimal displayed
        System.out.printf("Total TTC "+ df.format(tarifTTC) + "\n");    //Format decimal displayed
    }
}
