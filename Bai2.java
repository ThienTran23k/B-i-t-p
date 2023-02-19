import java.util.Scanner ;
import java.lang.Math;

public class Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap a :"); 
        double a = input.nextDouble();
        System.out.print("Nhap b :"); 
        double b = input.nextDouble();
        System.out.print("Nhap c :"); 
        double c = input.nextDouble();

        if(a ==0){
            
            if(b== 0){
                if(c == 0){
                    System.out.println("Vo so nghiem");
                }
                else{
                    System.out.println("Vo nghiem") ;
                }}
            
            else{
                Double tinhx = (-c)/(b);
                System.out.print("X = "+ tinhx);
                }
            
            }
        else {
            Double delta = b*b - 4 *a *c;
            if (delta < 0){
                System.out.print("Phuong trinh vo nghiem");
            }
            else if (delta == 0){
                double ngkep = (-b) /(2*a);
                System.out.print("Phuong trinh co nghiem kep = "+ ngkep);
            }
                
            else {
                double x_1 = ((-b)+Math.sqrt(delta)) /(2*a);
                double x_2 = ((-b)-Math.sqrt(delta)) /(2*a);
                System.out.print("Phuong trinh co nghiem kep ");
                System.out.print("X1 = " + x_1);
                System.out.print("X2 = "+x_2);
            }
                

        }
                
        }
        }
        

