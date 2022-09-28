import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int index=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index=i;
                break;
            }
        }
        System.out.println(index);
    }
}