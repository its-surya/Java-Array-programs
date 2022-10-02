public class Main {
    public static void main(String[] args) {
        int[] n={10,20,30,40,50,60,70,80,90,100};
        int hi=n.length-1;
        int data=70;
        int low=0;
        while (low<=hi){
            int mid=(hi+low)/2;
            if (data>n[mid]){
                low=mid+1;
            } else if (data<n[mid]) {
                hi=mid-1;
            }else {
                System.out.println(mid+1+"th");
                return;}
        }System.out.println(-1);
    }
}