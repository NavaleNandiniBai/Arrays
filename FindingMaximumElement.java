import java.util.*;
public class FindingMaximumElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int maxele=a[0];
        for(int i=1;i<n;i++){
            if(a[i]>maxele){
                maxele=a[i];
            }
        }
        System.out.println("Maximum Element: "+maxele);
    }

    
}
