import java.util.Scanner ;

public class Bai8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so can tinh giai thua :"); 
        int n = input.nextInt();
        int ketqua = 1;
        for (int i = 1; i <= n; i++) {
            ketqua =ketqua * i ; 
        }
        System.out.print("Ket qua = "+ ketqua);
    }
}
