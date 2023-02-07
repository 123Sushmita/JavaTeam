import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        System.out.println("clothes");
        System.out.println("......");
        System.out.println("1.Western dress for both men and women");
        System.out.println("2. Women Traditional");
        System.out.println("3.Men clothes");
        System.out.println("4.Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your choice:");
                int options = scanner.nextInt();


        switch (options)
        {
            case 1:
            System.out.println("You want T-shirt");
            System.out.println("you want Shirt");
            System.out.println("you want pant");
        break;

            case 2:
            System.out.println("you want sari");
            System.out.println("Ypu want lehenga");
            break;

            case 3:
            System.out.println("You want daurasurwal");
            System.out.println("you want coatpant");
break;
case 4:
System.out.println("you want to exit");
break;
            default:
                System.out.println("Sorry your option is not clothes list .");

        }
    }
}
