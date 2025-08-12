import java.util.Scanner;
public class sumAndAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float add = 0;
        float avg = 0;
        for(int i = 0; i<5; i++){
            System.out.printf("Enter element no %d : ",i+1);
            add = add + sc.nextInt();
        }
        sc.close();
        System.out.printf("The sum of the numbers is : %.1f\n",add);
        avg = add/5;
        System.out.printf("The average of the numbers is %.2f\n",avg);
    }
}
