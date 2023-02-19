import java.util.Scanner ;

public class Bai9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu su dung: ");
        int n = input.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao phan tu thu " + i + ": ");
            array[i] = input.nextInt();  
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu thu " + i + ": " + array[i]);
        }
        System.out.println("X can xoa :" );
        int x = input.nextInt();
        int b =0;
        for (int i = 0; i < n; i++) {
            if (array[i] != x) {
                array[b] = array[i];
                b++;
            }
        }
        n = b;  
        System.out.println("Mang sau khi da xoa " + x + " la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
    }


}
