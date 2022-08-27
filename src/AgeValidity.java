import java.util.*;

public class AgeValidity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean drivingUnderAge = false;
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age<=18){
            drivingUnderAge = true;
        }
        System.out.print("You are driving under age: ");
        System.out.println(drivingUnderAge);

    }
}
