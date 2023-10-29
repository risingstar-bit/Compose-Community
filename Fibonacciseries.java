import java.util.Scanner;

class Fibonacciseries{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int num1 = 0, num2 = 1, nextTerm;

        System.out.println("Enter the no. of turns : ");
        System.out.print(0);
        System.out.print(0);

        for(int i = 1; i <= n; i++){
            nextTerm = num1 + num2;
            num1 = num2;
            num2 =nextTerm;
            System.out.print(nextTerm);
        }
    }
}
