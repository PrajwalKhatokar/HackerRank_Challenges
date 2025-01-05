import java.util.Scanner;

public class OddEvenWeird {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n%2!=0){
            System.out.println("weird");
        }
        else {
            if (n>=2 && n<=5) {
                System.out.println("not weired");
        } else if (n>=5 && n<=30) {
                System.out.println("weird");

            }
            else{
                System.out.println("not weried");
            }
        }
    }
}
