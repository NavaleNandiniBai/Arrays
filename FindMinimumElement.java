import java.util.*;
public class FindMinimumElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int minele=a[0];
        for(int i=1;i<n;i++){
            if(a[i]<minele){
            minele=a[i];
            }
        }

        System.out.println("The minimum element in the given array : "+ minele);

    }
    
}
