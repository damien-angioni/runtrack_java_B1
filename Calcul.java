public class Calcul {
    static void Main() {                        //Main method
        int nombre = 7;                         //Defining variable
        System.out.println(nombre);             //Printing variable
        nombre=nombre+3;                        //Processing Variable
        System.out.println(nombre);
        nombre=nombre*5;
        System.out.println(nombre);
    }

    public static void main(String[] args) {    //Calling Method
        Main();                                 //Argument Main() to Method calling
    }
}