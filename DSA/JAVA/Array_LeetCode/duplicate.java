//Here we have written a code to find out the frequency of the digits in the given array
public class duplicate {

    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 2, 3 };
        int hash[] = new int[99];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(i + "The frequency" + hash[i]);
        }
    }

}
