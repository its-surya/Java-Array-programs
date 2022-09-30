import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int[] arr1=new int[n1];
        for (int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int[] arr2=new int[n2];
        for (int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        int[] diff =new int[n2];
        int i= arr1.length-1;
        int j= arr2.length-1;
        int k= diff.length-1;
        int c=0;
        while (k>=0){
            int d=0;
            int arv1=i>=0?arr1[i] :0;
            if (arr2[j] + c>=arv1){
               d= arr2[j]+c - arv1;
            }else {
                d=arr2[j]+c+10-arv1;
                c=-1;
            }
            diff[k]=d;
            i--;
            j--;
            k--;
        }
        int index=0;
        while (index< diff.length){
          if (diff[index]==0){
              index++;
          }else {
              break;
          }
        }
        while (index< diff.length){
            System.out.println(diff[index]);
            index++;
        }

    }
}