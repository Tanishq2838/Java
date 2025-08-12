import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        int dup = a;
        int rev = 0;
        while(a!=0){
            int temp = a%10;
            rev = rev*10 + temp;
            a = a/10;
        }
        if(rev == dup){
            System.out.printf("The number is a Palindrome\n");
        }
        else{
            System.out.printf("The number is not a Palindrome\n");
        }
    }
}
