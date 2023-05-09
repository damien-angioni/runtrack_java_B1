import java.util.Scanner;

public class NombresJusquaEntier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choisissez votre entier: ");
        String entier = sc.nextLine();
        try {
            int entier_int = Integer.parseInt(entier);
            for (int i = 0; i <= entier_int ; i++) {
                System.out.println(i);
            }
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }
}
