public class ExerciceVariable {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        System.out.printf("La valeur de num1 est: "+ num1 +" La valeur de num2 est: "+ num2 + "\n");
        int num_buffer=num1;
        num1=num2;num2=num_buffer;
        System.out.printf("La valeur de num1 est: "+ num1 +" La valeur de num2 est: "+ num2 + "\n");
    }
}