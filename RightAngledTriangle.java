import java.util.Scanner;
public class RightTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number : ");
        int a = sc.nextInt();
        sc.close();
        for(int i = 1; i<=a; i++){
            for(int j = 1; j<=i; j++){
                System.out.printf("%d ",j);
            }
            System.out.printf("\n");
        }
    }
}
