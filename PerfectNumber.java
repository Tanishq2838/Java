import java.util.Scanner;
public class perfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number : ");
        int a = sc.nextInt();
        sc.close();
        int count = 0;
        for(int i = 1; i<(a/2 + 1); i++){
            if(a%i == 0){
                count = count + i;
            }
        }
        if(count == a){
            System.out.printf("%d is a Perfect Number\n",a);
        }
        else{
            System.out.printf("%d is not a Perfect Number\n",a);
        }
    }
}
