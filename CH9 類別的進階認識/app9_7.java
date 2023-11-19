class CCircle{
    private static int count=0;
    private static double pi=3.14;
    private double radius;

    public CCircle(){
        this(1.0);
    }

    public CCircle(double r){
        radius=r;
        count++;
    }
    public void show(){
        System.out.println("area="+pi*radius*radius);
    }

    public static void show_count(){ // 把show_count()宣告成類別函數
        System.out.println(count+" object(s) created");
    }
}

public class app9_7{
    public static void main(String[] args){
        CCircle.show_count();
        CCircle cir1=new CCircle();
        CCircle.show_count();
        CCircle cir2=new CCircle(2.0);
        CCircle cir3=new CCircle(4.3);
        cir3.show_count();
    }
}