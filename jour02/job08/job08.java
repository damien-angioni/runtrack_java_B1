package jour02.job08;
import java.util.Scanner;
public class job08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un Nombre: ");
        String numero = sc.nextLine();
        int res = numero.length();
        System.out.println("Il y a: "+res+" chiffres");
    }

}

