import java.util.Scanner;
public class lengthOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String a = sc.nextLine();
        System.out.print("The number has "+ a.length()+ " digits");
    }
}
