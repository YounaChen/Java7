class CCircle{ // 設定field為私有成員
    
    private double pi=3.14;
    private double radius; // 預設為0

    private double area(){ // 定義私有的函數成員
        return pi*radius*radius;
    }

    public void show_area(){ // 定義公有的函數成員
        System.out.println("area="+area()); //呼叫私有成員
    }

    public void setRadius(double r){
        if(r>0){
            radius=r; // 將私有成員radius設為r
            System.out.println("radius="+radius);
        }
        else{
            System.out.println("input error");
        }
    }
}

public class app8_14{
    public static void main(String[] args){
        CCircle cir1=new CCircle();
        
        cir1.setRadius(-2.0);
        cir1.show_area();

    }
}