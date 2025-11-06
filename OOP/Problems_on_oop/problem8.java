package OOP.Problems_on_oop;
import java.util.*;

public class problem8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();

        switch (speed) {
            case 0:
                System.out.println("Fan is turned off");
                break;
            case 1:
                System.out.println("Fan is on low speed");
                break;
            case 2:
                System.out.println("Fan is on medium speed");
                break;
            case 3:
                System.out.println("Fan is on high speed");
                break;
            default:
                System.out.println("Invalid speed setting");
        }

        sc.close();
    }
}
