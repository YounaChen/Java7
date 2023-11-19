public class app7_11{
    public static void main(String args[]){
        star();
        star(7);
        star('@',9);
    }

    public static void star(){
        star(5);
    }

    public static void star(int n){
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void star(char ch, int n){
        for(int i=0;i<n;i++){
            System.out.print(ch);
        }
        System.out.println();
    }
    
}