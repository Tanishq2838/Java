import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number : ");
        int a = sc.nextInt();
        sc.close();
        for(int i = 1; i<=10; i++){
            System.out.printf("%d * %d = %d\n",a,i,a*i);
        }
    }
}
