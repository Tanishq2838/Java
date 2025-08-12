import java.util.Scanner;
public class natureOfRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.printf("Enter the coefficient of x^2 : ");
        a = sc.nextInt();
        System.out.printf("Enter the coefficient of x : ");
        b = sc.nextInt();
        System.out.printf("Enter the constant : ");
        c = sc.nextInt();
        sc.close();
        if(b*b-4*a*c < 0){
            System.out.printf("Roots are imaginary");
        }
        else if(b*b-4*a*c > 0){
            System.out.printf("Roots are real and distant");
        }
        else{
            System.out.printf("Roots are real and equal");
        }
    }
}
