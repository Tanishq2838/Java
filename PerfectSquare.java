import java.util.Scanner;
import java.lang.Math;
public class perfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number : ");
        double a = sc.nextDouble();
        sc.close();
        double c = Math.sqrt(a);
        int b = (int)c;
        if(c == b){
            System.out.printf("The number is a perfect square\n");
        }
        else{
            System.out.printf("The number is not a perfect square\n");
        }
    }
}
