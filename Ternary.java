import java.util.Scanner;
public class Ternary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int y= (x==0) ? 0: (x>0?1:-1);
        System.out.println(y);
    }
}
