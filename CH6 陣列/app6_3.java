import java.util.*;
public class app6_3{
    public static void main(String args[]){
        int i,min,max;
        int a[]={74,48,30,17,62};

        min=max=a[0];
        System.out.print("Element in array a are :");

        for(i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            if(max<a[i]){
                max=a[i];
            }
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println();
        System.out.println("max is :"+max);
        System.out.println("min is :"+min);

        
        
    }
}