package jour02.job05;

import java.util.Scanner;

public class job05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("votre âge: ");
        String nb1 = sc.nextLine();
        try {
            int intnb1 = Integer.parseInt(nb1);
            if (16< intnb1 &&  intnb1 <67){
                if(intnb1>55){
                    System.out.println("Il sera difficile de trouver un emploi!");
                }
                else{
                    System.out.println("Vous avez l'age pour travailler!");
                }
            }
            else{
                System.out.println("Vous n'avez pas l'age pour travailler!");
            }
        }
        catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }
}
