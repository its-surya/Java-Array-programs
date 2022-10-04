import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] a=new int[n];
        for (int i=0; i<a.length;i++){
            a[i]= sc.nextInt();
        }
        int find=sc.nextInt();
        int lo=0;
        int hi=a.length-1;
        int fi=-1;
        while (lo<=hi){
            int mid=(hi+lo)/2;
            if (find<a[mid]){
                hi=mid-1;
            } else if (find>a[mid]) {
                lo=mid+1;
            }else {
                fi=mid;
                hi=mid-1;
            }
        }
        System.out.println(fi);

        //------------------------------------
        int low=0;
        int high=a.length-1;
        int li=-1;
        while (low<=high){
            int mid=(high+low)/2;
            if (find<a[mid]){
                high=mid-1;
            } else if (find>a[mid]) {
                low=mid+1;
            }else {
                li=mid;
                low=mid+1;
            }
        }
        System.out.println(li);


    }
}