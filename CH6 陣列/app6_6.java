import java.util.*;
public class app6_6{
    public static void main(String args[]){
        int a[]={2,7,6,3,8,4};
        int b[]={2,7,6,3,8,4};
        int c[]=a; // 設定陣列c參考位置指向a

        if(a==b){ // 判斷a與b是否相同
            System.out.println("a==b");
        }
        else{
            System.out.println("a!=b");
        }
        a[2]=88;

        if(a==c){ // 判斷a與b是否相同
            System.out.println("a==c");
            System.out.println(c[2]);
            c[2]=99;
            System.out.println(a[2]);
        }
        else{
            System.out.println("a!=c");
        }

        
    }
}