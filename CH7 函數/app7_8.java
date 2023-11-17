public class app7_8{
    public static void main(String args[]){
        int A[]={1,2,3,4,5};
        square(A); // 呼叫square，並傳遞陣列A
        
        System.out.println("呼叫square()函數之後...");

        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }

    public static void square(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i]; //將陣列的元素值平方
        }
    }

    
}