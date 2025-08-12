import java.util.Scanner;
public class checkTwoFloat3DecPlaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the num 1 : ");
        float a = sc.nextFloat();
        System.out.printf("Enter the num 2 : ");
        float b = sc.nextFloat();
        sc.close();
        a = a*1000;
        b = b*1000;
        int c = (int)a;
        int d = (int)b;
        if(c == d){
            System.out.printf("The number is same upto 3 decimal digits\n");
        }
        else{
            System.out.printf("The numbers are not same\n");
        }
    }
}
