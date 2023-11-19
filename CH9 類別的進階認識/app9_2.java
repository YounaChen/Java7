class CCircle{ // 定義類別CCircle
    private String color;
    private double radius;
    private double pi=3.14;

    public CCircle(){   // 定義沒有引數的建構元CCircle()
        System.out.println("constructor CCircle() called");
        color="Green";
        radius=1.0;
    }

    public CCircle(String str, double r){   // 定義沒有引數的建構元CCircle()
            System.out.println("constructor CCircle(String, double) called");
            color=str;
            radius=r;
        }

    public void show(){
        System.out.println("radius="+radius+", color="+color);
        System.out.println( "area="+pi*radius*radius);
    }
}



public class app9_2{
    public static void main(String[] args){
        CCircle cir1=new CCircle(); // 建立物件並呼叫CCircle建構元
        cir1.show();

        CCircle cir2=new CCircle("Blue",4.0);
        cir2.show();
    }
}