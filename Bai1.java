import java.util.Scanner ;

public class Bai1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap a :"); 
        float a = input.nextFloat();
        System.out.print("Nhap b :"); 
        float b = input.nextFloat();
        if(a == 0){
            if(b == 0){
                System.out.println("Vo so nghiem");
            }
            else{
                System.out.println("Vo nghiem") ;
            }
            }
            else{
            float tinhx = -b/a;
            System.out.print("X = "+ tinhx);
            }
            
    }
}