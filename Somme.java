import java.util.Scanner;

public class Somme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre: ");
        String nb1 = sc.nextLine();
        System.out.print("Entrez un autre nombre: ");
        String nb2 = sc.nextLine();
        try {
            int intnb1 = Integer.parseInt(nb1);
            int intnb2 = Integer.parseInt(nb2);
            System.out.print("Résultat="+ (intnb1+intnb2));
        }
        catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }
}

