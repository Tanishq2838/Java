import java.util.Scanner;
public class reverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        int rev = 0;
        while(a!=0){
            int temp = a%10;
            rev = rev*10 + temp;
            a = a/10;
        }
        System.out.printf("The number after reversal is : %d\n",rev);
    }
}
