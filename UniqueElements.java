import java.util.*;
public class UniqueElements {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            boolean isUnique=true;
            for(int j=0;j<n;j++){
                if(i!=j && a[i]==a[j]){
                    isUnique=false;
                    break;
                }
            }
        
            if(isUnique){
                System.out.println("Unique Elements : "+a[i]+" ");
            }
        }
    }
    
}
