class CCircle{
    String color;
    double pi=3.14;
    double radius;

    void setCircle(String str){
        color=str;
    }

    void setCircle(double r){
        radius=r;
    }

    void setCircle(String str, double r){
        color=str;
        radius=r;
    }

    void show(){
        System.out.println("color="+color+", Radius="+radius);
        System.out.println("area="+pi*radius*radius);
    }
}

public class app8_11{
    public static void main(String[] args){
        CCircle cir1=new CCircle();
        cir1.setCircle("Red");
        cir1.setCircle(2.0);
        cir1.show();

        cir1.setCircle("Blue", 4.0);
        cir1.show();
    }
}