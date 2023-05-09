import java.util.*;
public class MinuteHeure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Décrivez un nombre de minutes: ");
        String input_minutes = sc.nextLine();
        try {
            int treated_minute = Integer.parseInt(input_minutes);
            int minutes = treated_minute % 60;
            int heure = treated_minute / 60;
            System.out.print("Heure: " + heure + ", Minutes: " + minutes);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }
}
