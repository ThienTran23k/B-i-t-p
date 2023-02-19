import java.util.Scanner ;
import java.lang.Math;

public class Bai4 {
    
        public static void Bai1() {
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
                System.out.println("X = "+ tinhx);
                }
                
        }

    public static void Bai2() {
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
                System.out.println("X2 = "+x_2);
            }
                

        }
                
        }

            public static void Bai3() {
                Scanner input = new Scanner(System.in);
                System.out.print("Nhap so dien su dung :"); 
                double SoDien = input.nextDouble();    
                if (SoDien < 50 ){
                    double Tien = SoDien * 1000 ;
                    System.out.print("So tien phai tra la : "+ Tien);
                }
                else{
                    double Tien = 50 *1000 +  (SoDien -50)*1200 ;
                    System.out.println("So tien phai tra la : "+ Tien);
        
                }
                }
    
        

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean cont = true;
		do {
			System.out.println("+---------------------------------------------------+");
            System.out.println("1. Giải phương trình bậc nhất");
            System.out.println("2. Giải phương trình bậc 2");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Kết thúc");
            System.out.println("+---------------------------------------------------+");
            System.out.println("Chọn chức năng:");
			int chon = input.nextInt();
			switch (chon) {
			case 1:Bai1();
                break;
			case 2:Bai2();
				break;
			case 3:Bai3();
				break;
			default:
				System.out.println("Tạm biệt");
				cont = false;
				break;
			}
		} while (cont);
}
}