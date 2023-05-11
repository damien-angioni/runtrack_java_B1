package jour02.job07;

import java.util.Scanner;
public class job07 {
    public static void main(String[] args) {
        double x;
        Scanner in = new Scanner(System.in);        //Précise que l'input se fera avec System.in
        System.out.println("Entrez nombre X: ");
        x = in.nextDouble();                        //x Sera la variable de l'input, sous format double
        double result = 1.0;
        for(int i = 2; i <= x; i++)
        {
            result = result * i;

        }
        System.out.println("La factorielle X est: " + result);
    }
}
