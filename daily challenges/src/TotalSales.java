import java.util.Scanner;

public class TotalSales {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int salesCount=sc.nextInt();
        if(salesCount>=30 && salesCount<=100) {
            if (salesCount >= 30 && salesCount <= 50)
                System.out.println("D");
            else if (salesCount >= 51 && salesCount <= 60)
                System.out.println("C");
            else if (salesCount >= 61 && salesCount <= 80)
                System.out.println("B");
            else
                System.out.println("A");
        }
        else {
            System.out.println("invalid");
        }
    }
}
