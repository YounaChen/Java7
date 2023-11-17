public class app7_7{
    public static void main(String args[]){
        int A[][]={{18,32,65,27,30},{17,56,12,66}};
        int B[][];
        

        System.out.println("A陣列:");

        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        
        B=add10(A);

        System.out.println("B陣列:");
        for(int i=0;i<B.length;i++){
            for(int j=0;j<B[i].length;j++){
                System.out.print(B[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("A陣列:");

        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static int[][] add10(int arr[][]){ 
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]+=10;
            }
        }
        return arr;
    }
}