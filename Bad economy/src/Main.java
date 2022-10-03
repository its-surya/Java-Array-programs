import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int i=0;
        int j=a.length-1;
        int find=sc.nextInt();
        int ceiling=0;
        int floor=0;
        while (i<=j){
            int mid=(i+j)/2;
            if (find > a[mid]) {
                i=mid+1;
                floor=a[mid];
            } else if (find< a[mid]) {
                j=mid-1;
                ceiling=a[mid];
            }else {
                floor=a[mid];
                ceiling=a[mid];
                break;
            }

        }

        System.out.println(ceiling);
        System.out.println(floor);

    }

}