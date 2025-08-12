import java.util.Scanner;
public class posOrNeg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.printf("Enter the number : ");
        a = sc.nextInt();
        sc.close();
        if(a<0){
            System.out.printf("Negative");
        }
        else if(a>0){
            System.out.printf("Positive");
        }
        else{
            System.out.printf("Zero");
        }
    }
}
