class CCircle{
    
    double pi=3.14;
    double radius;

    void show_area(){
        System.out.println("area="+pi*radius*radius);
    }
}

public class app8_12{
    public static void main(String[] args){
        CCircle cir1=new CCircle();
        
        cir1.radius=-2.0;
        cir1.show_area();

    }
}