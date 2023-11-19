class CCircle{ // 定義類別CCircle
    private double radius;
    private double pi=3.14;

    public CCircle(double r){   // 定義建構元CCircle()
        radius=r;
    }

    public void show(){
        System.out.println("radius="+radius+", area="+pi*radius*radius);
    }
}



public class app9_1{
    public static void main(String[] args){
        CCircle cir1=new CCircle(4.0); // 建立物件並呼叫CCircle建構元
        cir1.show();
    }
}