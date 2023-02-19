import java.util.Scanner ;
public class Bai7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so :"); 
        int n = input.nextInt();
        if (n < 100 | n> 999){
            System.out.print(" Hay nhap lai tu 100 -> 999");
        }
        else {
            int donvi = n % 10;
            n /= 10;
            
            int chuc = n % 10;
            int tram = n / 10;
            
            if (tram == 1)
            {
                System.out.print("Mot");
            }
            else if (tram == 2)
            {
                System.out.print("Hai");
            }
            else if (tram == 3)
            {
            System.out.print("Ba");
            }
            else if (tram == 4)
            {
                System.out.print("Bon");
            }
            else if (tram == 5)
            {
                System.out.print("Nam");
            }
            else if (tram == 6)
            {
                System.out.print("Sau");
            }
            else if (tram == 7)
            {
                System.out.print("Bay");
            }
            
            else if (tram == 8)
            {
                System.out.print("Tam");
            }
            else if (tram == 9)
            {
                System.out.print("Chin");
            }
            System.out.print(" Tram ");


            if (chuc ==0 & donvi ==0)
                System.out.print("chan");
            if (chuc == 0 & donvi != 0){
                System.out.print(" le ");
            }
            else if (chuc == 2)
            { 
                System.out.print(" Hai ");
            }
            else if (chuc == 3)
            {
                System.out.print(" Ba ");
            }
            else if (chuc == 4)
            {
                System.out.print(" Bon ");
            }
            else if (chuc == 5)
            {
                System.out.print(" Nam " );
            }
            
            else if (chuc == 6)
            {
                System.out.print(" Sau ");
            }
            else if (chuc == 7)
            {
                System.out.print(" Bay ");
            }
            else if (chuc == 8)
            {
                System.out.print(" Tam ");
            }
            else if (chuc == 9)
            {
                System.out.print(" Chin ");
            }
            
            if (donvi == 1)
            {
                System.out.print("Mot");
            }
            else if (donvi == 2)
            {
                System.out.print("Hai");
            
            }
            else if (donvi == 3)
            {
            
                System.out.print("Ba");
            }
            else if (donvi == 4)
            {
                System.out.print("Bon");
            }
            else if (donvi == 5)
            {
                System.out.print("Lam");
            }
            else if (donvi == 6)
            {
                System.out.print("Sau");
            }
            else if (donvi == 7)
            {
                System.out.print("Bay");
            }
            else if (donvi == 8)
            {
                System.out.print("Tam");
            }
            else if (donvi == 9)
            
            {
                System.out.print("Chin");
            }
        }
}
}
