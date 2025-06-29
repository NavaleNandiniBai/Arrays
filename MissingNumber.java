import java.util.*;
public class MissingNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int ar[]=new int[size];
        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();
        }
        int n=size+1;
        int totalsum=n*(n+1)/2;
        int arrsum=0;
        for(int i=0;i<size;i++){
            arrsum+=ar[i];
        }
        int missingnumber=totalsum-arrsum;
        System.out.println("Missing Number : "+missingnumber);
    }
    
}

