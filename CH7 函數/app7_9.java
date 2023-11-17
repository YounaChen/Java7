public class app7_9{
    public static void main(String args[]){
        System.out.println("1*2*3...*4="+fac(4));
    }

    public static int fac(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*fac(n-1);
        }
    }

    
}