import java.util.Scanner;
public class powOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number : ");
        int a = sc.nextInt();
        sc.close();
        int temp = a;
        int i = 1;
        while(a>1 || a>2){
            a = a/2;
            i = i*2;
        }
        if(i == temp){
            System.out.printf("The number is a power of 2\n");
        }
        else{
            System.out.printf("The number is not a power of 2\n");
        }
    }
}
