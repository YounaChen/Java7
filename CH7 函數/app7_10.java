public class app7_10{
    public static void main(String args[]){
        int a=5, b[]={1,2,3,4};
        show(a);
        show(b);
    }

    public static void show(int value){
        System.out.println("value="+value);
    }

    public static void show(int arr[]){
        System.out.print("array=");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }

    
}