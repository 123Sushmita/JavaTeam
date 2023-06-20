import java.util.Scanner;
public class SwtichBreak {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a month accordingly to get number ");
        String month= scanner.nextLine();
        switch (month) {
            case "Jan":
                System.out.println(1);
                break;
            case "Feb":
                System.out.println("2");
                break;
            case "march":
                System.out.println("3");
                break;
            case "april":
                System.out.println("4");
                break;
            case "may":
                System.out.println("5");
                break;
            case "june":
                System.out.println("6");
                break;
            case "july":
                System.out.println("7");
                break;
            case "August":
                System.out.println("8");
                break;
            case "september":
                System.out.println("9");
                break;
            case "october":
                System.out.println("10");
                break;
            case "November":
                System.out.println("11");
                break;
            case "December":
                System.out.println("12");
                break;

            default:
                System.out.println("Invalid month ");
        }
    }
}
