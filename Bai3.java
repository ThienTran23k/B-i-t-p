import java.util.Scanner ;


public class Bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so dien su dung :"); 
        double SoDien = input.nextDouble();    
        if (SoDien < 50 ){
            double Tien = SoDien * 1000 ;
            System.out.print("So tien phai tra la : "+ Tien);
        }
        else{
            double Tien = 50 *1000 +  (SoDien -50)*1200 ;
            System.out.print("So tien phai tra la : "+ Tien);

        }
        }
}
