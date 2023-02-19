import java.util.Scanner ;
import java.lang.Math;

public class Bai5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so nguyen:"); 
        int n = input.nextInt();
        double sqr = Math.sqrt(n);
        if(sqr*sqr == n)
            System.out.print(n + " la so chinh phuong");
        else
            System.out.print(n + " khong phai la so chinh phuong");
        
}
}