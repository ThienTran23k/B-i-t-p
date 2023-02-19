import java.util.Scanner ;

public class Bai6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so diem:"); 
        float n = input.nextFloat();
        if (n < 5 & n >=0 ){
            System.out.print("==> xep loai kem"); 
        }
        else if (n >=5 & n< 7 ){
            System.out.print("==> xep loai trung binh"); 
        }
            
        else if (n >= 7 & n<8 ){            
            System.out.print("==> xep loai kha");  
    }
        else {
            System.out.print("==> xep loai gioi"); 
        }
             

}
}

