import java.util.Scanner;
import java.lang.Math;
public class amstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        double c = 0;
        int d = a;
        while(d!=0){
            d = d/10;
            c++;
        }
        d = a;
        double arg = 0;
        while(d!=0){
            double temp = d%10;
            arg = arg + Math.pow(temp,c);
            d = d/10;
        }
        int arm = (int)arg;
        if(arm == a){
            System.out.printf("The number is an Armstrong Number\n");
        }
        else{
            System.out.printf("The number is not an Armstrong Number\n");
        }
    }
}
