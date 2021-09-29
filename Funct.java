
import java.util.*;

public class Funct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y=0;
        int x = sc.nextInt();
        if(x<0||x==0||x>0){
            if(x>0){
                y=1;
            }
            else if(x==0){
                y=0;
            }
            else if(x<0){
                y=-1;
            }
            else{
                System.out.println("please enter a correct value");
            }
        }
        else{
            System.out.println("not a valid value");
        }
        System.out.print(y);
    }
}
