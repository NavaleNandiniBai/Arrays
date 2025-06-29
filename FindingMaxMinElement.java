import java.util.*;
public class FindingMaxMinElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int maxele=a[0];
        int minele=a[0];
        for(int i=1;i<n;i++){
            if(a[i]>maxele){
                maxele=a[i];
            }
            if(a[i]<minele){
                minele=a[i];
            }
        }
        System.out.println("Minimum Element :"+minele);
        System.out.println("Maximum Element: "+maxele);
    }

    
}

