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

    public void show_count(){
        System.out.println(count+" object(s) created");
    }
}

public class app9_6{
    public static void main(String[] args){
        CCircle cir1=new CCircle();
        cir1.show_count();
        CCircle cir2=new CCircle(2.0);
        CCircle cir3=new CCircle(4.3);
        cir1.show_count();
        cir2.show_count();
        cir3.show_count();
    }
}