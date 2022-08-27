import java.util.Scanner;

public class ChkOddEven {

    public static void main(String []args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if ((num%2) == 0){
            System.out.println("Your number is even " + num);

        }
        else if((num%2) != 0){

            System.out.println("Your number is odd " + num);
        }


    }
}
