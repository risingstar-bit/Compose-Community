
//A prime number is a number that is divisible by only two numbers: 1 and itself. So, if any number is divisible by any other number, it is not a prime number.


public class Main {

  public static void main(String[] args) {
    final Scanner scan = new Scanner(System.in);
    System.out.println("Check prime for: ");
    int n = scan.nextInt();
    if (n > 1 && isPrimeNumber(n)) {
      System.out.println(n + " is a prime number.");
    } else {
      System.out.println(n + " is not a prime number.");
    }
  }

  private static boolean isPrimeNumber(int n) {
    for (int i = 2; i < Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
