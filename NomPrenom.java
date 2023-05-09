import java.util.*;                                 //import library to get functions needed
public class NomPrenom {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);         //Java Standard Input System.
        System.out.print("Entrez votre nom: ");
        String nom= sc.nextLine();                  //User input string
        System.out.print("Entrez votre prénom: ");
        String prenom= sc.nextLine();
        System.out.print("Nom: "+nom+", Prénom: "+prenom);
    }
}
