package jour02.job03;

import java.util.Scanner;

public class job03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre: ");
        String nb1 = sc.nextLine();
        try {
            int intnb1 = Integer.parseInt(nb1);
            for (int i = 0; i <= 10 ; i++) {
                int produit=i*intnb1;
                System.out.printf(intnb1+"x"+ i + "="+ produit + "\n");
            }
        }
        catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }
}
