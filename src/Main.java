import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the N number ");
        int n=sc.nextInt();

        double result=0;
        for (double i = 1; i <=n ; i++) {

            result+=(1.0/i);
        }
        System.out.println("The result is : " +result);
    }
}
